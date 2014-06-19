package org.gstreamer.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import glib.GList;
import glib.Glib20Library;

import java.util.ArrayList;
import java.util.Arrays;

import org.bridj.Pointer;
import org.junit.Test;

/**
 * Do simple operations on a GList, see if it works as expected.
 */
public class GListTest {
	
	@Test
	public void insertAndIterate() {
		// Allocate test data
		Pointer<Integer> test = Pointer.allocateInt();
		test.set(42);
		Pointer<Integer> test2 = Pointer.allocateInt();
		test2.set(39);
		
		// Put the test data on a GList
		Pointer<GList> list = null;
		list = Glib20Library.g_list_prepend(list, test); 
		list = Glib20Library.g_list_prepend(list, test2);
		
		// See what happened
		int listLength = Glib20Library.g_list_length(list);
		assertEquals(2, listLength);

		final ArrayList<Integer> results = new ArrayList<Integer>(2);
		for (int n = 0; n < listLength; n++) {
			results.add(Glib20Library.g_list_nth_data(list, n).as(Integer.class).get());
		}
		assertArrayEquals(Arrays.asList(39, 42).toArray(), results.toArray());
		
		// Free everything we allocated dynamically
		test.release();
		test2.release();
		Glib20Library.g_list_free(list);
	}

}
