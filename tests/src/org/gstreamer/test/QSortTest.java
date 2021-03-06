package org.gstreamer.test;

import glib.Glib20Library;
import glib.Glib20Library.GCompareDataFunc;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * First try to hand-port GLib's own qsort-test.c.
 * Version used: Ubuntu 14.04's glib2.0_2.40.0-2 source package
 */
public class QSortTest {

	public static final int SIZE = 100000;

	//Do the same as the original sort() function, BridJ callback style
	public static class SortCallback extends GCompareDataFunc {
		public int apply(Pointer<?> a, Pointer<?> b, Pointer<?> userData) {
			return a.as(Integer.class).get() < b.as(Integer.class).get() ? -1 : 1;
		}
	}

	@Test
	public void sortRandomNumbers() {
		System.out.println("QSortTest started");
		/*
		 * TODO:
		 * This is a global array in the original code. JNAerator seems to use the one in the compiled test.
		 * Decide what the best way to do this is. Allocating it dynamically here for now.
		 */
		Pointer<Integer> array = Pointer.allocateInts(SIZE);

		int i;
		SortCallback callback = new SortCallback();

		for (i = 0; i < SIZE; i++) {
			array.set(i, Glib20Library.g_random_int());
		}

		Glib20Library.g_qsort_with_data(array, SIZE, BridJ.sizeOf(Integer.class),
				Pointer.pointerTo((Glib20Library.GCompareDataFunc)callback), null);

		for (i = 0; i < SIZE - 1; i++) {
			assertTrue("Array not sorted at index " + i, array.getIntAtIndex(i) <= array.getIntAtIndex(i + 1));
		}

		// 0 elements is a valid case
		Glib20Library.g_qsort_with_data(array, 0, BridJ.sizeOf(Integer.class),
				Pointer.pointerTo((Glib20Library.GCompareDataFunc)callback), null);

		array.release();
		System.out.println("QSortTest completed without error");
	}

}
