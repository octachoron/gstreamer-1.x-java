## gstreamer-1.x-java

A temporary playground to test some ideas to rewrite the [gstreamer-java](https://code.google.com/p/gstreamer-java/) bindings so they can support [gstreamer-1.x](http://gstreamer.freedesktop.org/news/).

### Instructions

Right now, the approach being tested in this repo is to use [JNAerator](https://github.com/ochafik/nativelibs4java) to automatically parse the native code (GLib, GStreamer, etc), and generate the corresponding java files. 

To run the build script on OSX (I tested it on 10.9.1), first install [macports](http://www.macports.org/), and then install the GLib port by running

```
sudo port install glib2
```

This should result in all the glib2 (v2.38.2) files (lib, headers, etc) begin installed under /opt/local. Then, you can execute the build.sh script to have JNAerator going through glib.h. This script simply calls:

```
java -jar jnaerator.jar glib.jnaerator -mode Directory -f -v
```

However, the use of JNAerator to create the new gstreamer bindings is one among several other possibilities. Follow/participate of the ongoing discussion about different ideas being currently considered in this [thread](http://tinyurl.com/ot3lm9w) on the gstreamer-java Google Group.

### Building on Linux

The repo includes an Ant build.xml which can be used to run the JNAerator step on glib (the jnaerate-glib target), and compile the results (compile-glib). The compile target does glib only at the moment. The JNAerated Java sources use [BridJ](https://code.google.com/p/bridj/), a release jar is included in the repo.

The Linux build process was only tested on Ubuntu 14.04. A simple 

```
ant compile
```

should yield what we can do at the moment.
