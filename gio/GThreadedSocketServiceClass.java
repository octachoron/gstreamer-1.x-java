package gio;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
/**
 * <i>native declaration : glib-2.0/gio/gthreadedsocketservice.h:19</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public class GThreadedSocketServiceClass extends CPPObject {
	static {
		BridJ.register();
	}
	/** C type : GSocketServiceClass */
	@Field(0) 
	public GSocketServiceClass parent_class() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : GSocketServiceClass */
	@Field(0) 
	public GThreadedSocketServiceClass parent_class(GSocketServiceClass parent_class) {
		this.io.setNativeObjectField(this, 0, parent_class);
		return this;
	}
	/**
	 * Padding for future expansion<br>
	 * C type : _g_reserved1_callback*
	 */
	@Field(1) 
	public Pointer<gio.GVfsClass._g_reserved1_callback > _g_reserved1() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * Padding for future expansion<br>
	 * C type : _g_reserved1_callback*
	 */
	@Field(1) 
	public GThreadedSocketServiceClass _g_reserved1(Pointer<gio.GVfsClass._g_reserved1_callback > _g_reserved1) {
		this.io.setPointerField(this, 1, _g_reserved1);
		return this;
	}
	/** C type : _g_reserved2_callback* */
	@Field(2) 
	public Pointer<gio.GVfsClass._g_reserved2_callback > _g_reserved2() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : _g_reserved2_callback* */
	@Field(2) 
	public GThreadedSocketServiceClass _g_reserved2(Pointer<gio.GVfsClass._g_reserved2_callback > _g_reserved2) {
		this.io.setPointerField(this, 2, _g_reserved2);
		return this;
	}
	/** C type : _g_reserved3_callback* */
	@Field(3) 
	public Pointer<gio.GVfsClass._g_reserved3_callback > _g_reserved3() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : _g_reserved3_callback* */
	@Field(3) 
	public GThreadedSocketServiceClass _g_reserved3(Pointer<gio.GVfsClass._g_reserved3_callback > _g_reserved3) {
		this.io.setPointerField(this, 3, _g_reserved3);
		return this;
	}
	/** C type : _g_reserved4_callback* */
	@Field(4) 
	public Pointer<gio.GVfsClass._g_reserved4_callback > _g_reserved4() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : _g_reserved4_callback* */
	@Field(4) 
	public GThreadedSocketServiceClass _g_reserved4(Pointer<gio.GVfsClass._g_reserved4_callback > _g_reserved4) {
		this.io.setPointerField(this, 4, _g_reserved4);
		return this;
	}
	/** C type : _g_reserved5_callback* */
	@Field(5) 
	public Pointer<gio.GVfsClass._g_reserved5_callback > _g_reserved5() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : _g_reserved5_callback* */
	@Field(5) 
	public GThreadedSocketServiceClass _g_reserved5(Pointer<gio.GVfsClass._g_reserved5_callback > _g_reserved5) {
		this.io.setPointerField(this, 5, _g_reserved5);
		return this;
	}
	/** <i>native declaration : glib-2.0/gio/gthreadedsocketservice.h:13</i> */
	public static abstract class gboolean_callback extends Callback<gboolean_callback > {
		public final void apply(Pointer<GThreadedSocketService > service, Pointer<GSocketConnection > connection, Pointer source_object) {
			apply(Pointer.getPeer(service), Pointer.getPeer(connection), Pointer.getPeer(source_object));
		}
		public abstract void apply(@Ptr long service, @Ptr long connection, @Ptr long source_object);
	};
	/** <i>native declaration : glib-2.0/gio/gthreadedsocketservice.h:14</i> */
	public static abstract class _g_reserved1_callback extends Callback<_g_reserved1_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gthreadedsocketservice.h:15</i> */
	public static abstract class _g_reserved2_callback extends Callback<_g_reserved2_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gthreadedsocketservice.h:16</i> */
	public static abstract class _g_reserved3_callback extends Callback<_g_reserved3_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gthreadedsocketservice.h:17</i> */
	public static abstract class _g_reserved4_callback extends Callback<_g_reserved4_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gthreadedsocketservice.h:18</i> */
	public static abstract class _g_reserved5_callback extends Callback<_g_reserved5_callback > {
		public abstract void apply();
	};
	public GThreadedSocketServiceClass() {
		super();
	}
	public GThreadedSocketServiceClass(Pointer pointer) {
		super(pointer);
	}
}
