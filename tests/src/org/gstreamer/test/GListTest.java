package org.gstreamer.test;

import glib.GList;
import glib.Glib20Library;

import org.bridj.Pointer;

/**
 * Do simple operations on a GList, see if it works as expected.
 */
public class GListTest {
	
	public static void main(String[] args) {
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
		System.out.println("List length: " + listLength); //should see 2 here
		
		System.out.print("Elements in list:");
		for (int n = 0; n < listLength; n++) {
			System.out.print(" " + Glib20Library.g_list_nth_data(list, n).as(Integer.class).get());
		}
		System.out.println(); //should see 39, then 42
		
		// Free everything we allocated dynamically
		test.release();
		test2.release();
		Glib20Library.g_list_free(list);
	}

}
