package org.gstreamer.test;

import glib.GArray;
import glib.GObject;
import glib.GObjectClass;
import glib.GThread;
import glib.GTypeClass;
import glib.GTypeInfo;
import glib.GTypeInstance;
import glib.Glib20Library;
import glib.Glib20Library.GLogLevelFlags;
import glib.Gobject20Library;
import glib.Gobject20Library.GClassInitFunc;
import glib.Gobject20Library.GInstanceInitFunc;
import glib.Gthread20Library;
import glib.Gthread20Library.GThreadFunc;
import glib.Gthread20Library.GThreadPriority;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.junit.Test;

/**
 * Ported from GLib's own refcount/objects.c.
 * Version used: RHEL6's 2.28.4-1
 */
public class ObjectsRefcount {
	
	public static class GTest extends StructObject {
		public GTest() {
			super();
		}
		
		public GTest(Pointer pointer) {
			super(pointer);
		}
		
		@Field(0)
		public GObject object() {
			return this.io.getNativeObjectField(this, 0);
		}
		
		@Field(0)
		public GTest object(GObject object) {
			this.io.setNativeObjectField(this, 0, object);
			return this;
		}
	}
	
	public static class GTestClass extends StructObject {
		public GTestClass() {
			super();
		}
		
		public GTestClass(Pointer pointer) {
			super(pointer);
		}
		
		@Field(0)
		public GObjectClass parent_class() {
			return this.io.getNativeObjectField(this, 0);
		}
		
		@Field(0)
		public GTestClass parent_class(GObjectClass parent_class) {
			this.io.setNativeObjectField(this, 0, parent_class);
			return this;
		}
	}
	
	public static class GTestDisposeCallback extends GObjectClass.dispose_callback {
		@Override
		public void apply(Pointer<GObject> object) {
			Pointer<GTest> test = Gobject20Library.g_type_check_instance_cast(
				object.as(GTypeInstance.class),
				my_test_get_type()
			).as(GTest.class);
			
			Glib20Library.g_print(Pointer.pointerToCString("dispose %p!\n"), object);
			Gobject20Library.g_type_check_class_cast(
				parent_class.as(GTypeClass.class),
				Gobject20Library.g_object_get_type()
			).as(GObjectClass.class).get().dispose().get().apply(object.getPeer());
		}
	}
	
	public static class GTestInitCallback extends GInstanceInitFunc {
		@Override
		public void apply(long instance, long g_class) {
			Glib20Library.g_print(Pointer.pointerToCString("init %p\n"), Pointer.pointerToAddress(instance));
		}
	}
	
	
	public static class GTestClassInitCallback extends GClassInitFunc {
		@Override
		public void apply(long g_class, long class_data) {
			Pointer<GObjectClass> gobject_class = Pointer.pointerToAddress(g_class, GObjectClass.class);
			parent_class = Gobject20Library.g_type_class_ref(Gobject20Library.g_object_get_type())
				.as(GObjectClass.class);
			gobject_class.get().dispose(my_test_dispose.toPointer());
		}
	}
	
	public static void my_test_do_refcount(Pointer<GTest> test) {
		Gobject20Library.g_object_ref(test);
		Gobject20Library.g_object_unref(test);
	}
	
	public static class RunThreadCallback extends GThreadFunc {
		@Override
		public long apply(long data) {
			Pointer<GTest> test = Pointer.pointerToAddress(data).as(GTest.class);
			int i = 1;

			while (!stopping) {
				my_test_do_refcount(test);
				if ((i++ % 10000) == 0) {
					Glib20Library.g_print(Pointer.pointerToCString("."));
					
				}
				
				if (Gthread20Library.g_thread_get_initialized() != 0) {
					new Gthread20Library().g_thread_functions_for_glib_use().thread_yield().get().apply();
				}
			}
			
			return 0;
		}
	}
	
	private static boolean stopping;
	private static long test_type = 0;
	private static GTypeInfo test_info;
	private static GInstanceInitFunc my_test_init = new GTestInitCallback();
	private static GClassInitFunc my_test_class_init = new GTestClassInitCallback();
	private static GObjectClass.dispose_callback my_test_dispose = new GTestDisposeCallback();
	private static RunThreadCallback run_thread = new RunThreadCallback();
	private static Pointer<GObjectClass> parent_class = null;
	
	private static long my_test_get_type() {
		if (test_type == 0) {
			
			test_info = new GTypeInfo()
				.class_size((short) BridJ.sizeOf(GTestClass.class))
				.base_init(null)
				.base_finalize(null)
				.class_init(my_test_class_init.toPointer())
				.class_finalize(null)
				.class_data(null)
				.instance_size((short) BridJ.sizeOf(GTest.class))
				.n_preallocs((short) 0)
				.instance_init(my_test_init.toPointer());
			test_type = Gobject20Library.g_type_register_static(
				Gobject20Library.g_object_get_type(),
				Pointer.pointerToCString("GTest"),
				Pointer.pointerTo(test_info),
				Gobject20Library.GTypeFlags.fromValue(0));
		}
		return test_type;
	}
	
	@Test
	public void runTest() {
		int i;
		Pointer<GTest> test1, test2;
		Pointer<GArray> test_threads;
		final int n_threads = 5;
		
		Gthread20Library.g_thread_init(null);
		
		System.out.println("START: " + this.getClass().getName());
		Glib20Library.g_log_set_always_fatal(
			GLogLevelFlags.fromValue( (int)(
				GLogLevelFlags.G_LOG_LEVEL_WARNING.value()
				| GLogLevelFlags.G_LOG_LEVEL_CRITICAL.value()
				| Glib20Library.g_log_set_always_fatal(
					GLogLevelFlags.fromValue(
						(int)(GLogLevelFlags.G_LOG_FLAG_RECURSION.value()
						| GLogLevelFlags.G_LOG_LEVEL_ERROR.value())
					)
				).value()
			))
		);
		
		test1 = Gobject20Library.g_object_new(my_test_get_type(), null).as(GTest.class);
		test2 = Gobject20Library.g_object_new(my_test_get_type(), null).as(GTest.class);
		
		test_threads = Glib20Library.g_array_new(0, 0, (int) BridJ.sizeOf(Pointer.class));
		
		stopping = false;
		
		for (i = 0; i < n_threads; i++) {
			Pointer<GThread> thread;
			
			thread = Gthread20Library.g_thread_create_full(
					run_thread.toPointer(),
					test1,
					0,
					1,
					0,
					GThreadPriority.G_THREAD_PRIORITY_NORMAL,
					null
			);
			Glib20Library.g_array_append_vals(test_threads, Pointer.pointerToAddress(thread.getPeer()), 1);
			
			thread = Gthread20Library.g_thread_create_full(
					run_thread.toPointer(),
					test2,
					0,
					1,
					0,
					GThreadPriority.G_THREAD_PRIORITY_NORMAL,
					null
			);
			Glib20Library.g_array_append_vals(test_threads, Pointer.pointerToAddress(thread.getPeer()), 1);
		}
		
		Glib20Library.g_usleep(5000000);
		
		stopping = true;
		
		for (i = 0; i < 2 * n_threads; i++) {
			Pointer<GThread> thread;
			long thread_raw;
			
			thread_raw = test_threads.get(i).data().getPeer();
			thread = Pointer.pointerToAddress(thread_raw, Pointer.class).get(i);
			
			Gthread20Library.g_thread_join(thread);
		}
		
		System.out.println("stopped");
	}
}
