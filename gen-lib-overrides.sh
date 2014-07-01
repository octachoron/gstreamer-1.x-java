#!/bin/bash

echo 'Probing libraries for unexpected symbol placements...'

overrides_file=$PWD/_lib_overrides.in
mappings_file=$PWD/_lib_mappings.tmp

rm -f $overrides_file $mappings_file

pushd src/lowlevel/glib >/dev/null

libs='Glib Gio Gobject Gthread Gmodule'
lib_postfix=20Library.java
lib_so_ver=-2.0
lib_so_postfix=$lib_so_ver.so

for lib in $libs; do
  lib_so_files="$lib_so_files lib`echo $lib | tr A-Z a-z`$lib_so_postfix"
done

multiarch_tuple=`gcc -print-multiarch 2>/dev/null`
if [ $? -ne 0 ]; then
  echo 'Platform uses FHS-style multiarch'
  # Fall back to /usr/lib or /usr/lib64
  [ "`uname -m`" == "x86_64" ] && libdir=/usr/lib64 || libdir=/usr/lib
else
  echo 'Platform uses Debian-style multiarch'
  libdir=/usr/lib/$multiarch_tuple
fi

for lib_so_file in $lib_so_files; do
  lib_so_paths="$lib_so_paths $libdir/$lib_so_file"
done

echo "Shared libraries searched: $lib_so_paths"

nm -D --defined-only --print-file-name $lib_so_paths | tr ':' ' ' \
    | cut -d ' ' -f 1,4 > $mappings_file

qual='((protected native static)|(public static native)|(protected static native)|(public native static))'
for lib in $libs; do
  lib_file=$lib$lib_postfix
  funs=`egrep  "$qual [a-zA-Z0-9_]* [a-zA-Z0-9_]*" $lib_file \
    | sed -r "s/\s*$qual [a-zA-Z0-9_]* ([a-zA-Z0-9_]*).*/\6/g"`
  lib_so=$libdir/lib`echo $lib | tr A-Z a-z`$lib_so_postfix
  for fun in $funs; do
    fun_lib=`egrep "^[^ ]+ $fun$" $mappings_file | cut -d ' ' -f 1`
    if [ "$fun_lib" != "$lib_so" ]; then
      if [ -z "$fun_lib" ]; then
        echo "$fun is not exported in any of the libs, adding skip pattern"
        echo "-skipFunctions $fun" >> $overrides_file
      else
        echo "$fun is exported in $fun_lib instead of $lib_so, adding override"
        fun_lib_short=`echo $fun_lib \
          | sed -r "s@$libdir/lib([a-z]+)$lib_so_postfix@\1@g"`$lib_so_ver
        if [ -z "$lib_overrides" ]; then
          lib_overrides="$fun=$fun_lib_short"
        else
          lib_overrides="$lib_overrides,$fun=$fun_lib_short"
        fi
      fi
    fi
  done
done

echo "-libraryOverrides $lib_overrides" >> $overrides_file

popd >/dev/null

echo "Finished probing for unexpected symbol placements"
