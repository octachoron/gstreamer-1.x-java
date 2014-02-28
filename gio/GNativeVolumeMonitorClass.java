package gio;
import gio.GIOLibrary.GMount;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
/**
 * <i>native declaration : glib-2.0/gio/gnativevolumemonitor.h:10</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public class GNativeVolumeMonitorClass extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : GVolumeMonitorClass */
	@Field(0) 
	public GVolumeMonitorClass parent_class() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : GVolumeMonitorClass */
	@Field(0) 
	public GNativeVolumeMonitorClass parent_class(GVolumeMonitorClass parent_class) {
		this.io.setNativeObjectField(this, 0, parent_class);
		return this;
	}
	/** C type : get_mount_for_mount_path_callback* */
	@Field(1) 
	public Pointer<GNativeVolumeMonitorClass.get_mount_for_mount_path_callback > get_mount_for_mount_path() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : get_mount_for_mount_path_callback* */
	@Field(1) 
	public GNativeVolumeMonitorClass get_mount_for_mount_path(Pointer<GNativeVolumeMonitorClass.get_mount_for_mount_path_callback > get_mount_for_mount_path) {
		this.io.setPointerField(this, 1, get_mount_for_mount_path);
		return this;
	}
	/** <i>native declaration : glib-2.0/gio/gnativevolumemonitor.h:9</i> */
	public static abstract class get_mount_for_mount_path_callback extends Callback<get_mount_for_mount_path_callback > {
		public final Pointer<GMount > apply(Pointer<Byte > mount_path, Pointer<GCancellable > cancellable) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(mount_path), Pointer.getPeer(cancellable)), GMount.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long mount_path, @Ptr long cancellable);
	};
	public GNativeVolumeMonitorClass() {
		super();
	}
	public GNativeVolumeMonitorClass(Pointer pointer) {
		super(pointer);
	}
}
