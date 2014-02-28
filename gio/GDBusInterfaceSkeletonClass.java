package gio;
import gio.GIOLibrary.GDBusMethodInvocation;
import gio.GIOLibrary.GVariant;
import gio.GIOLibrary.gpointer;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
/**
 * GDBusInterfaceSkeletonClass:<br>
 * @parent_class: The parent class.<br>
 * @get_info: Returns a #GDBusInterfaceInfo. See g_dbus_interface_skeleton_get_info() for details.<br>
 * @get_vtable: Returns a #GDBusInterfaceVTable. See g_dbus_interface_skeleton_get_vtable() for details.<br>
 * @get_properties: Returns a #GVariant with all properties. See g_dbus_interface_skeleton_get_properties().<br>
 * @flush: Emits outstanding changes, if any. See g_dbus_interface_skeleton_flush().<br>
 * @g_authorize_method: Signal class handler for the #GDBusInterfaceSkeleton::g-authorize-method signal.<br>
 * * Class structure for #GDBusInterfaceSkeleton.<br>
 * * Since: 2.30<br>
 * <i>native declaration : glib-2.0/gio/gdbusinterfaceskeleton.h:46</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GDBusInterfaceSkeletonClass extends CPPObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GObjectClass (Unsupported type) */
	/**
	 * Virtual Functions<br>
	 * C type : get_info_callback*
	 */
	@Field(1) 
	public Pointer<GDBusInterfaceSkeletonClass.get_info_callback > get_info() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * Virtual Functions<br>
	 * C type : get_info_callback*
	 */
	@Field(1) 
	public GDBusInterfaceSkeletonClass get_info(Pointer<GDBusInterfaceSkeletonClass.get_info_callback > get_info) {
		this.io.setPointerField(this, 1, get_info);
		return this;
	}
	/** C type : get_vtable_callback* */
	@Field(2) 
	public Pointer<GDBusInterfaceSkeletonClass.get_vtable_callback > get_vtable() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : get_vtable_callback* */
	@Field(2) 
	public GDBusInterfaceSkeletonClass get_vtable(Pointer<GDBusInterfaceSkeletonClass.get_vtable_callback > get_vtable) {
		this.io.setPointerField(this, 2, get_vtable);
		return this;
	}
	/** C type : get_properties_callback* */
	@Field(3) 
	public Pointer<GDBusInterfaceSkeletonClass.get_properties_callback > get_properties() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : get_properties_callback* */
	@Field(3) 
	public GDBusInterfaceSkeletonClass get_properties(Pointer<GDBusInterfaceSkeletonClass.get_properties_callback > get_properties) {
		this.io.setPointerField(this, 3, get_properties);
		return this;
	}
	/** C type : flush_callback* */
	@Field(4) 
	public Pointer<GDBusInterfaceSkeletonClass.flush_callback > flush() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : flush_callback* */
	@Field(4) 
	public GDBusInterfaceSkeletonClass flush(Pointer<GDBusInterfaceSkeletonClass.flush_callback > flush) {
		this.io.setPointerField(this, 4, flush);
		return this;
	}
	/**
	 * < private ><br>
	 * C type : gpointer[8]
	 */
	@Array({8}) 
	@Field(5) 
	public Pointer<gpointer > vfunc_padding() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * < private ><br>
	 * C type : gpointer[8]
	 */
	@Array({8}) 
	@Field(6) 
	public Pointer<gpointer > signal_padding() {
		return this.io.getPointerField(this, 6);
	}
	/** <i>native declaration : glib-2.0/gio/gdbusinterfaceskeleton.h:41</i> */
	public static abstract class get_info_callback extends Callback<get_info_callback > {
		public final Pointer<GDBusInterfaceInfo > apply(Pointer<GDBusInterfaceSkeleton > interface_) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(interface_)), GDBusInterfaceInfo.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long interface_);
	};
	/** <i>native declaration : glib-2.0/gio/gdbusinterfaceskeleton.h:42</i> */
	public static abstract class get_vtable_callback extends Callback<get_vtable_callback > {
		public final Pointer<GDBusInterfaceVTable > apply(Pointer<GDBusInterfaceSkeleton > interface_) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(interface_)), GDBusInterfaceVTable.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long interface_);
	};
	/** <i>native declaration : glib-2.0/gio/gdbusinterfaceskeleton.h:43</i> */
	public static abstract class get_properties_callback extends Callback<get_properties_callback > {
		public final Pointer<GVariant > apply(Pointer<GDBusInterfaceSkeleton > interface_) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(interface_)), GVariant.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long interface_);
	};
	/** <i>native declaration : glib-2.0/gio/gdbusinterfaceskeleton.h:44</i> */
	public static abstract class flush_callback extends Callback<flush_callback > {
		public final void apply(Pointer<GDBusInterfaceSkeleton > interface_) {
			apply(Pointer.getPeer(interface_));
		}
		public abstract void apply(@Ptr long interface_);
	};
	/** <i>native declaration : glib-2.0/gio/gdbusinterfaceskeleton.h:45</i> */
	public static abstract class gboolean_callback extends Callback<gboolean_callback > {
		public final void apply(Pointer<GDBusInterfaceSkeleton > interface_, Pointer<GDBusMethodInvocation > invocation) {
			apply(Pointer.getPeer(interface_), Pointer.getPeer(invocation));
		}
		public abstract void apply(@Ptr long interface_, @Ptr long invocation);
	};
}
