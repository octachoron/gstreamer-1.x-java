package gio;
import gio.GIOLibrary.GAsyncReadyCallback;
import gio.GIOLibrary.GAsyncResult;
import gio.GIOLibrary.gpointer;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
/**
 * <i>native declaration : glib-2.0/gio/giostream.h:47</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GIOStreamClass extends CPPObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GObjectClass (Unsupported type) */
	/** C type : get_input_stream_callback* */
	@Field(1) 
	public Pointer<GIOStreamClass.get_input_stream_callback > get_input_stream() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : get_input_stream_callback* */
	@Field(1) 
	public GIOStreamClass get_input_stream(Pointer<GIOStreamClass.get_input_stream_callback > get_input_stream) {
		this.io.setPointerField(this, 1, get_input_stream);
		return this;
	}
	/** C type : get_output_stream_callback* */
	@Field(2) 
	public Pointer<GIOStreamClass.get_output_stream_callback > get_output_stream() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : get_output_stream_callback* */
	@Field(2) 
	public GIOStreamClass get_output_stream(Pointer<GIOStreamClass.get_output_stream_callback > get_output_stream) {
		this.io.setPointerField(this, 2, get_output_stream);
		return this;
	}
	/** C type : close_async_callback* */
	@Field(3) 
	public Pointer<GIOStreamClass.close_async_callback > close_async() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : close_async_callback* */
	@Field(3) 
	public GIOStreamClass close_async(Pointer<GIOStreamClass.close_async_callback > close_async) {
		this.io.setPointerField(this, 3, close_async);
		return this;
	}
	/**
	 * Padding for future expansion<br>
	 * C type : _g_reserved1_callback*
	 */
	@Field(4) 
	public Pointer<gio.GVfsClass._g_reserved1_callback > _g_reserved1() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * Padding for future expansion<br>
	 * C type : _g_reserved1_callback*
	 */
	@Field(4) 
	public GIOStreamClass _g_reserved1(Pointer<gio.GVfsClass._g_reserved1_callback > _g_reserved1) {
		this.io.setPointerField(this, 4, _g_reserved1);
		return this;
	}
	/** C type : _g_reserved2_callback* */
	@Field(5) 
	public Pointer<gio.GVfsClass._g_reserved2_callback > _g_reserved2() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : _g_reserved2_callback* */
	@Field(5) 
	public GIOStreamClass _g_reserved2(Pointer<gio.GVfsClass._g_reserved2_callback > _g_reserved2) {
		this.io.setPointerField(this, 5, _g_reserved2);
		return this;
	}
	/** C type : _g_reserved3_callback* */
	@Field(6) 
	public Pointer<gio.GVfsClass._g_reserved3_callback > _g_reserved3() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : _g_reserved3_callback* */
	@Field(6) 
	public GIOStreamClass _g_reserved3(Pointer<gio.GVfsClass._g_reserved3_callback > _g_reserved3) {
		this.io.setPointerField(this, 6, _g_reserved3);
		return this;
	}
	/** C type : _g_reserved4_callback* */
	@Field(7) 
	public Pointer<gio.GVfsClass._g_reserved4_callback > _g_reserved4() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : _g_reserved4_callback* */
	@Field(7) 
	public GIOStreamClass _g_reserved4(Pointer<gio.GVfsClass._g_reserved4_callback > _g_reserved4) {
		this.io.setPointerField(this, 7, _g_reserved4);
		return this;
	}
	/** C type : _g_reserved5_callback* */
	@Field(8) 
	public Pointer<gio.GVfsClass._g_reserved5_callback > _g_reserved5() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : _g_reserved5_callback* */
	@Field(8) 
	public GIOStreamClass _g_reserved5(Pointer<gio.GVfsClass._g_reserved5_callback > _g_reserved5) {
		this.io.setPointerField(this, 8, _g_reserved5);
		return this;
	}
	/** C type : _g_reserved6_callback* */
	@Field(9) 
	public Pointer<gio.GVfsClass._g_reserved6_callback > _g_reserved6() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : _g_reserved6_callback* */
	@Field(9) 
	public GIOStreamClass _g_reserved6(Pointer<gio.GVfsClass._g_reserved6_callback > _g_reserved6) {
		this.io.setPointerField(this, 9, _g_reserved6);
		return this;
	}
	/** C type : _g_reserved7_callback* */
	@Field(10) 
	public Pointer<gio.GSocketClass._g_reserved7_callback > _g_reserved7() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : _g_reserved7_callback* */
	@Field(10) 
	public GIOStreamClass _g_reserved7(Pointer<gio.GSocketClass._g_reserved7_callback > _g_reserved7) {
		this.io.setPointerField(this, 10, _g_reserved7);
		return this;
	}
	/** C type : _g_reserved8_callback* */
	@Field(11) 
	public Pointer<gio.GSocketClass._g_reserved8_callback > _g_reserved8() {
		return this.io.getPointerField(this, 11);
	}
	/** C type : _g_reserved8_callback* */
	@Field(11) 
	public GIOStreamClass _g_reserved8(Pointer<gio.GSocketClass._g_reserved8_callback > _g_reserved8) {
		this.io.setPointerField(this, 11, _g_reserved8);
		return this;
	}
	/** C type : _g_reserved9_callback* */
	@Field(12) 
	public Pointer<gio.GSocketClass._g_reserved9_callback > _g_reserved9() {
		return this.io.getPointerField(this, 12);
	}
	/** C type : _g_reserved9_callback* */
	@Field(12) 
	public GIOStreamClass _g_reserved9(Pointer<gio.GSocketClass._g_reserved9_callback > _g_reserved9) {
		this.io.setPointerField(this, 12, _g_reserved9);
		return this;
	}
	/** C type : _g_reserved10_callback* */
	@Field(13) 
	public Pointer<gio.GSocketClass._g_reserved10_callback > _g_reserved10() {
		return this.io.getPointerField(this, 13);
	}
	/** C type : _g_reserved10_callback* */
	@Field(13) 
	public GIOStreamClass _g_reserved10(Pointer<gio.GSocketClass._g_reserved10_callback > _g_reserved10) {
		this.io.setPointerField(this, 13, _g_reserved10);
		return this;
	}
	/** <i>native declaration : glib-2.0/gio/giostream.h:32</i> */
	public static abstract class get_input_stream_callback extends Callback<get_input_stream_callback > {
		public final Pointer<GInputStream > apply(Pointer<GIOStream > stream) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(stream)), GInputStream.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long stream);
	};
	/** <i>native declaration : glib-2.0/gio/giostream.h:33</i> */
	public static abstract class get_output_stream_callback extends Callback<get_output_stream_callback > {
		public final Pointer<GOutputStream > apply(Pointer<GIOStream > stream) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(stream)), GOutputStream.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long stream);
	};
	/** <i>native declaration : glib-2.0/gio/giostream.h:34</i> */
	public static abstract class gboolean_callback extends Callback<gboolean_callback > {
		public final void apply(Pointer<GIOStream > stream, Pointer<GCancellable > cancellable, Pointer<Pointer > error) {
			apply(Pointer.getPeer(stream), Pointer.getPeer(cancellable), Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long stream, @Ptr long cancellable, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/gio/giostream.h:35</i> */
	public static abstract class close_async_callback extends Callback<close_async_callback > {
		public final void apply(Pointer<GIOStream > stream, int io_priority, Pointer<GCancellable > cancellable, Pointer<GAsyncReadyCallback > callback, gpointer user_data) {
			apply(Pointer.getPeer(stream), io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), user_data);
		}
		public abstract void apply(@Ptr long stream, int io_priority, @Ptr long cancellable, @Ptr long callback, gpointer user_data);
	};
	/** <i>native declaration : glib-2.0/gio/giostream.h:36</i> */
	public static abstract class gboolean_callback2 extends Callback<gboolean_callback2 > {
		public final void apply(Pointer<GIOStream > stream, Pointer<GAsyncResult > result, Pointer<Pointer > error) {
			apply(Pointer.getPeer(stream), Pointer.getPeer(result), Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long stream, @Ptr long result, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/gio/giostream.h:37</i> */
	public static abstract class _g_reserved1_callback extends Callback<_g_reserved1_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/giostream.h:38</i> */
	public static abstract class _g_reserved2_callback extends Callback<_g_reserved2_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/giostream.h:39</i> */
	public static abstract class _g_reserved3_callback extends Callback<_g_reserved3_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/giostream.h:40</i> */
	public static abstract class _g_reserved4_callback extends Callback<_g_reserved4_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/giostream.h:41</i> */
	public static abstract class _g_reserved5_callback extends Callback<_g_reserved5_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/giostream.h:42</i> */
	public static abstract class _g_reserved6_callback extends Callback<_g_reserved6_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/giostream.h:43</i> */
	public static abstract class _g_reserved7_callback extends Callback<_g_reserved7_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/giostream.h:44</i> */
	public static abstract class _g_reserved8_callback extends Callback<_g_reserved8_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/giostream.h:45</i> */
	public static abstract class _g_reserved9_callback extends Callback<_g_reserved9_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/giostream.h:46</i> */
	public static abstract class _g_reserved10_callback extends Callback<_g_reserved10_callback > {
		public abstract void apply();
	};
}
