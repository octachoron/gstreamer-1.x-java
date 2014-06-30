#!/bin/bash

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
  # Fall back to /usr/lib or /usr/lib64
  [ "`uname -m`" == "x86_64" ] && libdir=/usr/lib64 || libdir=/usr/lib
else
  libdir=/usr/lib/$multiarch_tuple
fi

for lib_so_file in $lib_so_files; do
  lib_so_paths="$lib_so_paths $libdir/$lib_so_file"
done

echo "Libs @ $lib_so_paths"

nm -D --defined-only --print-file-name $lib_so_paths | tr ':' ' ' \
    | cut -d ' ' -f 1,4 > $mappings_file

for lib in $libs; do
  lib_file=$lib$lib_postfix
  funs=`egrep 'protected native static [a-zA-Z0-9_]* [a-zA-Z0-9_]*' $lib_file \
    | sed -r 's/\s*protected native static [a-zA-Z0-9_]* ([a-zA-Z0-9_]*).*/\1/g'`
  lib_so=$libdir/lib`echo $lib | tr A-Z a-z`$lib_so_postfix
  for fun in $funs; do
    fun_lib=`egrep "^[^ ]+ $fun$" $mappings_file | cut -d ' ' -f 1`
    if [ "$fun_lib" != "$lib_so" ]; then
      if [ -z "$fun_lib" ]; then
        echo "HIT: $fun is not exported"
        echo "-skipFunctions $fun" >> $overrides_file
      else
        echo "HIT: $fun is in $fun_lib, not $lib_so"
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