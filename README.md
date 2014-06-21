## gstreamer-1.x-java

This is the main working repository of the Google Summer of Code 2014 project titled GStreamer 1.x Java bindings and migration.
These efforts are forked from a temporary playground to test some ideas to rewrite the [gstreamer-java](https://code.google.com/p/gstreamer-java/) bindings so they can support [gstreamer-1.x](http://gstreamer.freedesktop.org/news/). See the original repository for details.
The primary target platform (and the only one at the moment) is Linux. See the original repository for the original OSX build instructions.

### Current approach

Right now, the approach being tested in this repo is to use [JNAerator](https://github.com/ochafik/nativelibs4java) to automatically parse the native code (GLib, GStreamer, etc), and generate the corresponding java files.

However, the use of JNAerator to create the new gstreamer bindings is one among several other possibilities. Follow/participate of the ongoing discussion about different ideas being currently considered in this [thread](http://tinyurl.com/ot3lm9w) on the gstreamer-java Google Group.

### Building on Linux

The repo includes an Ant build.xml which can be used to run the JNAerator step on all of glib (the ```jnaerate``` target), and compile the results (the ```compile``` target). The JNAerated Java sources use [BridJ](https://code.google.com/p/bridj/), which is included in the shaded jnaerator.jar.

A simple 

```
ant compile
```

should yield what we can do at the moment. There are also a few tests to work the GLib bindings. They can be run by saying

```
ant run-tests
```
