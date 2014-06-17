package org.gstreamer.test;

import glib.GObject;
import glib.GObjectClass;
import glib.GObjectConstructParam;
import glib.Gobject20Library;
import glib.Gobject20Library.GClassInitFunc;
import glib.Gobject20Library.GInstanceInitFunc;

import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;

/**
 * Ported from GLib's own singleton.c.
 * Version used: RHEL6's 2.28.4-1
 */
public class Singleton {

	public static class MySingleton extends StructObject {
		public MySingleton() {
			super();
		}
		
		public MySingleton(Pointer pointer) {
			super(pointer);
		}
		
		@Field(0)
		public GObject parent_instance() {
			return this.io.getNativeObjectField(this, 0);
		}
		
		@Field(0)
		public MySingleton parent_instance(GObject parent_instance) {
			this.io.setNativeObjectField(this, 0, parent_instance);
			return this;
		}
	}
	
	public static class MySingletonClass extends StructObject {
		public MySingletonClass() {
			super();
		}
		
		public MySingletonClass(Pointer pointer) {
			super(pointer);
		}
		
		@Field(0)
		public GObjectClass parent_class() {
			return this.io.getNativeObjectField(this, 0);
		}
		
		@Field(0)
		public MySingletonClass parent_instance(GObjectClass parent_class) {
			this.io.setNativeObjectField(this, 0, parent_class);
			return this;
		}
	}
	
	private static Pointer<MySingleton> the_one_and_only = null;
	
	private static Pointer<?> my_singleton_parent_class = null;
	
	public static class MySingletonConstructorCallback extends GObjectClass.constructor_callback {
		public Pointer<GObject> apply(long type, //size_t in the original
				int n_construct_properties,
				Pointer<GObjectConstructParam> construct_properties) {
			if (the_one_and_only == null) {
				return my_singleton_parent_class
					.as(GObjectClass.class)
					.get()
					.constructor()
					.get()
					.apply(type, n_construct_properties, construct_properties);
			} else {
				return Gobject20Library.g_object_ref(the_one_and_only).as(GObject.class);
			}
		}
	}
	
	public static class MySingletonInitCallback extends GInstanceInitFunc {
		@Override
		public void apply(long instance, long g_class) {
			assert the_one_and_only == null : "Singleton instance not null in Singleton test";
			the_one_and_only = Pointer.pointerToAddress(instance).as(MySingleton.class);
		}
	}
	
	public static class MySingletonClassInitCallback extends GClassInitFunc {
		@Override
		public void apply(long g_class, long class_data) {
			my_singleton_parent_class = Gobject20Library.g_type_class_peek_parent(Pointer.pointerToAddress(g_class));
			my_singleton_parent_class.as(GObjectClass.class).get().constructor(
				Pointer.pointerTo(new MySingletonConstructorCallback()).as(GObjectClass.constructor_callback.class)
			);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Singleton test started");
		
		Pointer<MySingleton> singleton, obj;
		
		long my_singleton_gtype;
		MySingletonClassInitCallback my_singleton_class_init = new MySingletonClassInitCallback();
		MySingletonInitCallback my_singleton_init = new MySingletonInitCallback();
		
		Gobject20Library.g_type_init_with_debug_flags(
				Gobject20Library.GTypeDebugFlags.fromValue(
						(int) (Gobject20Library.GTypeDebugFlags.G_TYPE_DEBUG_OBJECTS.value
								| Gobject20Library.GTypeDebugFlags.G_TYPE_DEBUG_SIGNALS.value)
				)
		);
		
		// Registering our type here, because we can not use macros
		my_singleton_gtype = Gobject20Library.g_type_register_static_simple(
			Gobject20Library.g_object_get_type(),
			Pointer.pointerToCString("MySingleton"),
			(int) BridJ.sizeOf(MySingletonClass.class),
			Pointer.pointerTo(my_singleton_class_init).as(Gobject20Library.GClassInitFunc.class),
			(int) BridJ.sizeOf(MySingleton.class),
			Pointer.pointerTo(my_singleton_init).as(Gobject20Library.GInstanceInitFunc.class),
			Gobject20Library.GTypeFlags.fromValue(0)
		);
		
		
		// create the singleton
		singleton = Gobject20Library.g_object_new(my_singleton_gtype, null).as(MySingleton.class);
		assert singleton != null : "singleton == null in Singleton test";
		// assert _singleton_ creation
		obj = Gobject20Library.g_object_new(my_singleton_gtype, null).as(MySingleton.class);
		assert singleton == obj;
		Gobject20Library.g_object_unref(obj);
		// shutdown
		Gobject20Library.g_object_unref(singleton);
		System.out.println("Singleton test completed without error");
	}

}
