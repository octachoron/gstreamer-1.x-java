package org.gstreamer.test;

import glib.Gio20Library;
import glib.Glib20Library;
import glib.Gmodule20Library;
import glib.Gobject20Library;
import glib.Gthread20Library;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Checks for known issues related to loading libraries.
 *
 */
public class LoadLibs {
	
	@Test
	public void checkMissingFunctions() throws ClassNotFoundException {
		
		List<Class<?>> libs = Arrays.asList(
			Glib20Library.class,
			Gio20Library.class,
			Gobject20Library.class,
			Gthread20Library.class,
			Gmodule20Library.class
		);
		
		for (Class<?> klass : libs) {
			Class.forName(klass.getName());
		}
	}
}
