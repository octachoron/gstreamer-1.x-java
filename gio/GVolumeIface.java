package gio;
import gio.GIOLibrary.GAsyncReadyCallback;
import gio.GIOLibrary.GAsyncResult;
import gio.GIOLibrary.GDrive;
import gio.GIOLibrary.GFile;
import gio.GIOLibrary.GIcon;
import gio.GIOLibrary.GMount;
import gio.GIOLibrary.GMountMountFlags;
import gio.GIOLibrary.GMountUnmountFlags;
import gio.GIOLibrary.GVolume;
import gio.GIOLibrary.gpointer;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
import org.bridj.util.DefaultParameterizedType;
/**
 * <i>native declaration : glib-2.0/gio/gvolume.h:84</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GVolumeIface extends CPPObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GTypeInterface (Unsupported type) */
	/** C type : changed_callback* */
	@Field(1) 
	public Pointer<GVolumeIface.changed_callback > changed() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : changed_callback* */
	@Field(1) 
	public GVolumeIface changed(Pointer<GVolumeIface.changed_callback > changed) {
		this.io.setPointerField(this, 1, changed);
		return this;
	}
	/** C type : removed_callback* */
	@Field(2) 
	public Pointer<GVolumeIface.removed_callback > removed() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : removed_callback* */
	@Field(2) 
	public GVolumeIface removed(Pointer<GVolumeIface.removed_callback > removed) {
		this.io.setPointerField(this, 2, removed);
		return this;
	}
	/** C type : get_name_callback* */
	@Field(3) 
	public Pointer<GVolumeIface.get_name_callback > get_name() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : get_name_callback* */
	@Field(3) 
	public GVolumeIface get_name(Pointer<GVolumeIface.get_name_callback > get_name) {
		this.io.setPointerField(this, 3, get_name);
		return this;
	}
	/** C type : get_icon_callback* */
	@Field(4) 
	public Pointer<GVolumeIface.get_icon_callback > get_icon() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : get_icon_callback* */
	@Field(4) 
	public GVolumeIface get_icon(Pointer<GVolumeIface.get_icon_callback > get_icon) {
		this.io.setPointerField(this, 4, get_icon);
		return this;
	}
	/** C type : get_uuid_callback* */
	@Field(5) 
	public Pointer<GVolumeIface.get_uuid_callback > get_uuid() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : get_uuid_callback* */
	@Field(5) 
	public GVolumeIface get_uuid(Pointer<GVolumeIface.get_uuid_callback > get_uuid) {
		this.io.setPointerField(this, 5, get_uuid);
		return this;
	}
	/** C type : get_drive_callback* */
	@Field(6) 
	public Pointer<GVolumeIface.get_drive_callback > get_drive() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : get_drive_callback* */
	@Field(6) 
	public GVolumeIface get_drive(Pointer<GVolumeIface.get_drive_callback > get_drive) {
		this.io.setPointerField(this, 6, get_drive);
		return this;
	}
	/** C type : get_mount_callback* */
	@Field(7) 
	public Pointer<GVolumeIface.get_mount_callback > get_mount() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : get_mount_callback* */
	@Field(7) 
	public GVolumeIface get_mount(Pointer<GVolumeIface.get_mount_callback > get_mount) {
		this.io.setPointerField(this, 7, get_mount);
		return this;
	}
	/** C type : mount_fn_callback* */
	@Field(8) 
	public Pointer<GVolumeIface.mount_fn_callback > mount_fn() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : mount_fn_callback* */
	@Field(8) 
	public GVolumeIface mount_fn(Pointer<GVolumeIface.mount_fn_callback > mount_fn) {
		this.io.setPointerField(this, 8, mount_fn);
		return this;
	}
	/** C type : eject_callback* */
	@Field(9) 
	public Pointer<GVolumeIface.eject_callback > eject() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : eject_callback* */
	@Field(9) 
	public GVolumeIface eject(Pointer<GVolumeIface.eject_callback > eject) {
		this.io.setPointerField(this, 9, eject);
		return this;
	}
	/** C type : get_identifier_callback* */
	@Field(10) 
	public Pointer<GVolumeIface.get_identifier_callback > get_identifier() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : get_identifier_callback* */
	@Field(10) 
	public GVolumeIface get_identifier(Pointer<GVolumeIface.get_identifier_callback > get_identifier) {
		this.io.setPointerField(this, 10, get_identifier);
		return this;
	}
	/** C type : enumerate_identifiers_callback* */
	@Field(11) 
	public Pointer<GVolumeIface.enumerate_identifiers_callback > enumerate_identifiers() {
		return this.io.getPointerField(this, 11);
	}
	/** C type : enumerate_identifiers_callback* */
	@Field(11) 
	public GVolumeIface enumerate_identifiers(Pointer<GVolumeIface.enumerate_identifiers_callback > enumerate_identifiers) {
		this.io.setPointerField(this, 11, enumerate_identifiers);
		return this;
	}
	/** C type : get_activation_root_callback* */
	@Field(12) 
	public Pointer<GVolumeIface.get_activation_root_callback > get_activation_root() {
		return this.io.getPointerField(this, 12);
	}
	/** C type : get_activation_root_callback* */
	@Field(12) 
	public GVolumeIface get_activation_root(Pointer<GVolumeIface.get_activation_root_callback > get_activation_root) {
		this.io.setPointerField(this, 12, get_activation_root);
		return this;
	}
	/** C type : eject_with_operation_callback* */
	@Field(13) 
	public Pointer<GVolumeIface.eject_with_operation_callback > eject_with_operation() {
		return this.io.getPointerField(this, 13);
	}
	/** C type : eject_with_operation_callback* */
	@Field(13) 
	public GVolumeIface eject_with_operation(Pointer<GVolumeIface.eject_with_operation_callback > eject_with_operation) {
		this.io.setPointerField(this, 13, eject_with_operation);
		return this;
	}
	/** C type : get_sort_key_callback* */
	@Field(14) 
	public Pointer<GVolumeIface.get_sort_key_callback > get_sort_key() {
		return this.io.getPointerField(this, 14);
	}
	/** C type : get_sort_key_callback* */
	@Field(14) 
	public GVolumeIface get_sort_key(Pointer<GVolumeIface.get_sort_key_callback > get_sort_key) {
		this.io.setPointerField(this, 14, get_sort_key);
		return this;
	}
	/** C type : get_symbolic_icon_callback* */
	@Field(15) 
	public Pointer<GVolumeIface.get_symbolic_icon_callback > get_symbolic_icon() {
		return this.io.getPointerField(this, 15);
	}
	/** C type : get_symbolic_icon_callback* */
	@Field(15) 
	public GVolumeIface get_symbolic_icon(Pointer<GVolumeIface.get_symbolic_icon_callback > get_symbolic_icon) {
		this.io.setPointerField(this, 15, get_symbolic_icon);
		return this;
	}
	/** <i>native declaration : glib-2.0/gio/gvolume.h:63</i> */
	public static abstract class changed_callback extends Callback<changed_callback > {
		public final void apply(Pointer<GVolume > volume) {
			apply(Pointer.getPeer(volume));
		}
		public abstract void apply(@Ptr long volume);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:64</i> */
	public static abstract class removed_callback extends Callback<removed_callback > {
		public final void apply(Pointer<GVolume > volume) {
			apply(Pointer.getPeer(volume));
		}
		public abstract void apply(@Ptr long volume);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:65</i> */
	public static abstract class get_name_callback extends Callback<get_name_callback > {
		public final Pointer<Byte > apply(Pointer<GVolume > volume) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(volume)), Byte.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long volume);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:66</i> */
	public static abstract class get_icon_callback extends Callback<get_icon_callback > {
		public final Pointer<GIcon > apply(Pointer<GVolume > volume) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(volume)), GIcon.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long volume);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:67</i> */
	public static abstract class get_uuid_callback extends Callback<get_uuid_callback > {
		public final Pointer<Byte > apply(Pointer<GVolume > volume) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(volume)), Byte.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long volume);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:68</i> */
	public static abstract class get_drive_callback extends Callback<get_drive_callback > {
		public final Pointer<GDrive > apply(Pointer<GVolume > volume) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(volume)), GDrive.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long volume);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:69</i> */
	public static abstract class get_mount_callback extends Callback<get_mount_callback > {
		public final Pointer<GMount > apply(Pointer<GVolume > volume) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(volume)), GMount.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long volume);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:70</i> */
	public static abstract class gboolean_callback extends Callback<gboolean_callback > {
		public final void apply(Pointer<GVolume > volume) {
			apply(Pointer.getPeer(volume));
		}
		public abstract void apply(@Ptr long volume);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:71</i> */
	public static abstract class gboolean_callback2 extends Callback<gboolean_callback2 > {
		public final void apply(Pointer<GVolume > volume) {
			apply(Pointer.getPeer(volume));
		}
		public abstract void apply(@Ptr long volume);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:72</i> */
	public static abstract class mount_fn_callback extends Callback<mount_fn_callback > {
		public final void apply(Pointer<GVolume > volume, IntValuedEnum<GMountMountFlags > flags, Pointer<GMountOperation > mount_operation, Pointer<GCancellable > cancellable, Pointer<GAsyncReadyCallback > callback, gpointer user_data) {
			apply(Pointer.getPeer(volume), (int)flags.value(), Pointer.getPeer(mount_operation), Pointer.getPeer(cancellable), Pointer.getPeer(callback), user_data);
		}
		public abstract void apply(@Ptr long volume, int flags, @Ptr long mount_operation, @Ptr long cancellable, @Ptr long callback, gpointer user_data);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:73</i> */
	public static abstract class gboolean_callback3 extends Callback<gboolean_callback3 > {
		public final void apply(Pointer<GVolume > volume, Pointer<GAsyncResult > result, Pointer<Pointer > error) {
			apply(Pointer.getPeer(volume), Pointer.getPeer(result), Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long volume, @Ptr long result, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:74</i> */
	public static abstract class eject_callback extends Callback<eject_callback > {
		public final void apply(Pointer<GVolume > volume, IntValuedEnum<GMountUnmountFlags > flags, Pointer<GCancellable > cancellable, Pointer<GAsyncReadyCallback > callback, gpointer user_data) {
			apply(Pointer.getPeer(volume), (int)flags.value(), Pointer.getPeer(cancellable), Pointer.getPeer(callback), user_data);
		}
		public abstract void apply(@Ptr long volume, int flags, @Ptr long cancellable, @Ptr long callback, gpointer user_data);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:75</i> */
	public static abstract class gboolean_callback4 extends Callback<gboolean_callback4 > {
		public final void apply(Pointer<GVolume > volume, Pointer<GAsyncResult > result, Pointer<Pointer > error) {
			apply(Pointer.getPeer(volume), Pointer.getPeer(result), Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long volume, @Ptr long result, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:76</i> */
	public static abstract class get_identifier_callback extends Callback<get_identifier_callback > {
		public final Pointer<Byte > apply(Pointer<GVolume > volume, Pointer<Byte > kind) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(volume), Pointer.getPeer(kind)), Byte.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long volume, @Ptr long kind);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:77</i> */
	public static abstract class enumerate_identifiers_callback extends Callback<enumerate_identifiers_callback > {
		public final Pointer<Pointer<Byte > > apply(Pointer<GVolume > volume) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(volume)), DefaultParameterizedType.paramType(Pointer.class, Byte.class));
		}
		@Ptr 
		public abstract long apply(@Ptr long volume);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:78</i> */
	public static abstract class gboolean_callback5 extends Callback<gboolean_callback5 > {
		public final void apply(Pointer<GVolume > volume) {
			apply(Pointer.getPeer(volume));
		}
		public abstract void apply(@Ptr long volume);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:79</i> */
	public static abstract class get_activation_root_callback extends Callback<get_activation_root_callback > {
		public final Pointer<GFile > apply(Pointer<GVolume > volume) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(volume)), GFile.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long volume);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:80</i> */
	public static abstract class eject_with_operation_callback extends Callback<eject_with_operation_callback > {
		public final void apply(Pointer<GVolume > volume, IntValuedEnum<GMountUnmountFlags > flags, Pointer<GMountOperation > mount_operation, Pointer<GCancellable > cancellable, Pointer<GAsyncReadyCallback > callback, gpointer user_data) {
			apply(Pointer.getPeer(volume), (int)flags.value(), Pointer.getPeer(mount_operation), Pointer.getPeer(cancellable), Pointer.getPeer(callback), user_data);
		}
		public abstract void apply(@Ptr long volume, int flags, @Ptr long mount_operation, @Ptr long cancellable, @Ptr long callback, gpointer user_data);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:81</i> */
	public static abstract class gboolean_callback6 extends Callback<gboolean_callback6 > {
		public final void apply(Pointer<GVolume > volume, Pointer<GAsyncResult > result, Pointer<Pointer > error) {
			apply(Pointer.getPeer(volume), Pointer.getPeer(result), Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long volume, @Ptr long result, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:82</i> */
	public static abstract class get_sort_key_callback extends Callback<get_sort_key_callback > {
		public final Pointer<Byte > apply(Pointer<GVolume > volume) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(volume)), Byte.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long volume);
	};
	/** <i>native declaration : glib-2.0/gio/gvolume.h:83</i> */
	public static abstract class get_symbolic_icon_callback extends Callback<get_symbolic_icon_callback > {
		public final Pointer<GIcon > apply(Pointer<GVolume > volume) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(volume)), GIcon.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long volume);
	};
}
