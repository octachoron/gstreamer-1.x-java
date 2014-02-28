package gio;
import gio.GIOLibrary.GSocketConnectable;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
/**
 * GSocketConnectableIface:<br>
 * @g_iface: The parent interface.<br>
 * @enumerate: Creates a #GSocketAddressEnumerator<br>
 * @proxy_enumerate: Creates a #GProxyAddressEnumerator<br>
 * * Provides an interface for returning a #GSocketAddressEnumerator<br>
 * and #GProxyAddressEnumerator<br>
 * <i>native declaration : glib-2.0/gio/gsocketconnectable.h:20</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GSocketConnectableIface extends StructObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GTypeInterface (Unsupported type) */
	/** C type : enumerate_callback* */
	@Field(1) 
	public Pointer<GSocketConnectableIface.enumerate_callback > enumerate() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : enumerate_callback* */
	@Field(1) 
	public GSocketConnectableIface enumerate(Pointer<GSocketConnectableIface.enumerate_callback > enumerate) {
		this.io.setPointerField(this, 1, enumerate);
		return this;
	}
	/** C type : proxy_enumerate_callback* */
	@Field(2) 
	public Pointer<GSocketConnectableIface.proxy_enumerate_callback > proxy_enumerate() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : proxy_enumerate_callback* */
	@Field(2) 
	public GSocketConnectableIface proxy_enumerate(Pointer<GSocketConnectableIface.proxy_enumerate_callback > proxy_enumerate) {
		this.io.setPointerField(this, 2, proxy_enumerate);
		return this;
	}
	/** <i>native declaration : glib-2.0/gio/gsocketconnectable.h:18</i> */
	public static abstract class enumerate_callback extends Callback<enumerate_callback > {
		public final Pointer<GSocketAddressEnumerator > apply(Pointer<GSocketConnectable > connectable) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(connectable)), GSocketAddressEnumerator.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long connectable);
	};
	/** <i>native declaration : glib-2.0/gio/gsocketconnectable.h:19</i> */
	public static abstract class proxy_enumerate_callback extends Callback<proxy_enumerate_callback > {
		public final Pointer<GSocketAddressEnumerator > apply(Pointer<GSocketConnectable > connectable) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(connectable)), GSocketAddressEnumerator.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long connectable);
	};
}
