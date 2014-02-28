package gio;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : glib-2.0/gio/gsocket.h:26</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GSocketClass extends StructObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GObjectClass (Unsupported type) */
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
	public GSocketClass _g_reserved1(Pointer<gio.GVfsClass._g_reserved1_callback > _g_reserved1) {
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
	public GSocketClass _g_reserved2(Pointer<gio.GVfsClass._g_reserved2_callback > _g_reserved2) {
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
	public GSocketClass _g_reserved3(Pointer<gio.GVfsClass._g_reserved3_callback > _g_reserved3) {
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
	public GSocketClass _g_reserved4(Pointer<gio.GVfsClass._g_reserved4_callback > _g_reserved4) {
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
	public GSocketClass _g_reserved5(Pointer<gio.GVfsClass._g_reserved5_callback > _g_reserved5) {
		this.io.setPointerField(this, 5, _g_reserved5);
		return this;
	}
	/** C type : _g_reserved6_callback* */
	@Field(6) 
	public Pointer<gio.GVfsClass._g_reserved6_callback > _g_reserved6() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : _g_reserved6_callback* */
	@Field(6) 
	public GSocketClass _g_reserved6(Pointer<gio.GVfsClass._g_reserved6_callback > _g_reserved6) {
		this.io.setPointerField(this, 6, _g_reserved6);
		return this;
	}
	/** C type : _g_reserved7_callback* */
	@Field(7) 
	public Pointer<GSocketClass._g_reserved7_callback > _g_reserved7() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : _g_reserved7_callback* */
	@Field(7) 
	public GSocketClass _g_reserved7(Pointer<GSocketClass._g_reserved7_callback > _g_reserved7) {
		this.io.setPointerField(this, 7, _g_reserved7);
		return this;
	}
	/** C type : _g_reserved8_callback* */
	@Field(8) 
	public Pointer<GSocketClass._g_reserved8_callback > _g_reserved8() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : _g_reserved8_callback* */
	@Field(8) 
	public GSocketClass _g_reserved8(Pointer<GSocketClass._g_reserved8_callback > _g_reserved8) {
		this.io.setPointerField(this, 8, _g_reserved8);
		return this;
	}
	/** C type : _g_reserved9_callback* */
	@Field(9) 
	public Pointer<GSocketClass._g_reserved9_callback > _g_reserved9() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : _g_reserved9_callback* */
	@Field(9) 
	public GSocketClass _g_reserved9(Pointer<GSocketClass._g_reserved9_callback > _g_reserved9) {
		this.io.setPointerField(this, 9, _g_reserved9);
		return this;
	}
	/** C type : _g_reserved10_callback* */
	@Field(10) 
	public Pointer<GSocketClass._g_reserved10_callback > _g_reserved10() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : _g_reserved10_callback* */
	@Field(10) 
	public GSocketClass _g_reserved10(Pointer<GSocketClass._g_reserved10_callback > _g_reserved10) {
		this.io.setPointerField(this, 10, _g_reserved10);
		return this;
	}
	/** <i>native declaration : glib-2.0/gio/gsocket.h:16</i> */
	public static abstract class _g_reserved1_callback extends Callback<_g_reserved1_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gsocket.h:17</i> */
	public static abstract class _g_reserved2_callback extends Callback<_g_reserved2_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gsocket.h:18</i> */
	public static abstract class _g_reserved3_callback extends Callback<_g_reserved3_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gsocket.h:19</i> */
	public static abstract class _g_reserved4_callback extends Callback<_g_reserved4_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gsocket.h:20</i> */
	public static abstract class _g_reserved5_callback extends Callback<_g_reserved5_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gsocket.h:21</i> */
	public static abstract class _g_reserved6_callback extends Callback<_g_reserved6_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gsocket.h:22</i> */
	public static abstract class _g_reserved7_callback extends Callback<_g_reserved7_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gsocket.h:23</i> */
	public static abstract class _g_reserved8_callback extends Callback<_g_reserved8_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gsocket.h:24</i> */
	public static abstract class _g_reserved9_callback extends Callback<_g_reserved9_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gsocket.h:25</i> */
	public static abstract class _g_reserved10_callback extends Callback<_g_reserved10_callback > {
		public abstract void apply();
	};
}
