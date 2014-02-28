package gio;
import gio.GIOLibrary.GAsyncReadyCallback;
import gio.GIOLibrary.GAsyncResult;
import gio.GIOLibrary.GFileInfo;
import gio.GIOLibrary.gpointer;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
/**
 * <i>native declaration : glib-2.0/gio/gfileiostream.h:50</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public class GFileIOStreamClass extends CPPObject {
	static {
		BridJ.register();
	}
	/** C type : GIOStreamClass */
	@Field(0) 
	public GIOStreamClass parent_class() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : GIOStreamClass */
	@Field(0) 
	public GFileIOStreamClass parent_class(GIOStreamClass parent_class) {
		this.io.setNativeObjectField(this, 0, parent_class);
		return this;
	}
	/** C type : query_info_callback* */
	@Field(1) 
	public Pointer<gio.GFileOutputStreamClass.query_info_callback > query_info() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : query_info_callback* */
	@Field(1) 
	public GFileIOStreamClass query_info(Pointer<gio.GFileOutputStreamClass.query_info_callback > query_info) {
		this.io.setPointerField(this, 1, query_info);
		return this;
	}
	/** C type : query_info_async_callback* */
	@Field(2) 
	public Pointer<gio.GFileOutputStreamClass.query_info_async_callback > query_info_async() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : query_info_async_callback* */
	@Field(2) 
	public GFileIOStreamClass query_info_async(Pointer<gio.GFileOutputStreamClass.query_info_async_callback > query_info_async) {
		this.io.setPointerField(this, 2, query_info_async);
		return this;
	}
	/** C type : query_info_finish_callback* */
	@Field(3) 
	public Pointer<gio.GFileOutputStreamClass.query_info_finish_callback > query_info_finish() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : query_info_finish_callback* */
	@Field(3) 
	public GFileIOStreamClass query_info_finish(Pointer<gio.GFileOutputStreamClass.query_info_finish_callback > query_info_finish) {
		this.io.setPointerField(this, 3, query_info_finish);
		return this;
	}
	/** C type : get_etag_callback* */
	@Field(4) 
	public Pointer<gio.GFileOutputStreamClass.get_etag_callback > get_etag() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : get_etag_callback* */
	@Field(4) 
	public GFileIOStreamClass get_etag(Pointer<gio.GFileOutputStreamClass.get_etag_callback > get_etag) {
		this.io.setPointerField(this, 4, get_etag);
		return this;
	}
	/**
	 * Padding for future expansion<br>
	 * C type : _g_reserved1_callback*
	 */
	@Field(5) 
	public Pointer<gio.GVfsClass._g_reserved1_callback > _g_reserved1() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * Padding for future expansion<br>
	 * C type : _g_reserved1_callback*
	 */
	@Field(5) 
	public GFileIOStreamClass _g_reserved1(Pointer<gio.GVfsClass._g_reserved1_callback > _g_reserved1) {
		this.io.setPointerField(this, 5, _g_reserved1);
		return this;
	}
	/** C type : _g_reserved2_callback* */
	@Field(6) 
	public Pointer<gio.GVfsClass._g_reserved2_callback > _g_reserved2() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : _g_reserved2_callback* */
	@Field(6) 
	public GFileIOStreamClass _g_reserved2(Pointer<gio.GVfsClass._g_reserved2_callback > _g_reserved2) {
		this.io.setPointerField(this, 6, _g_reserved2);
		return this;
	}
	/** C type : _g_reserved3_callback* */
	@Field(7) 
	public Pointer<gio.GVfsClass._g_reserved3_callback > _g_reserved3() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : _g_reserved3_callback* */
	@Field(7) 
	public GFileIOStreamClass _g_reserved3(Pointer<gio.GVfsClass._g_reserved3_callback > _g_reserved3) {
		this.io.setPointerField(this, 7, _g_reserved3);
		return this;
	}
	/** C type : _g_reserved4_callback* */
	@Field(8) 
	public Pointer<gio.GVfsClass._g_reserved4_callback > _g_reserved4() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : _g_reserved4_callback* */
	@Field(8) 
	public GFileIOStreamClass _g_reserved4(Pointer<gio.GVfsClass._g_reserved4_callback > _g_reserved4) {
		this.io.setPointerField(this, 8, _g_reserved4);
		return this;
	}
	/** C type : _g_reserved5_callback* */
	@Field(9) 
	public Pointer<gio.GVfsClass._g_reserved5_callback > _g_reserved5() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : _g_reserved5_callback* */
	@Field(9) 
	public GFileIOStreamClass _g_reserved5(Pointer<gio.GVfsClass._g_reserved5_callback > _g_reserved5) {
		this.io.setPointerField(this, 9, _g_reserved5);
		return this;
	}
	/** <i>native declaration : glib-2.0/gio/gfileiostream.h:36</i> */
	public static abstract class goffset_callback extends Callback<goffset_callback > {
		public final void apply(Pointer<GFileIOStream > stream) {
			apply(Pointer.getPeer(stream));
		}
		public abstract void apply(@Ptr long stream);
	};
	/** <i>native declaration : glib-2.0/gio/gfileiostream.h:37</i> */
	public static abstract class gboolean_callback extends Callback<gboolean_callback > {
		public final void apply(Pointer<GFileIOStream > stream) {
			apply(Pointer.getPeer(stream));
		}
		public abstract void apply(@Ptr long stream);
	};
	/** <i>native declaration : glib-2.0/gio/gfileiostream.h:38</i> */
	public static abstract class gboolean_callback2 extends Callback<gboolean_callback2 > {
		/**
		 * SKIPPED:<br>
		 * <i>native declaration : glib-2.0/gio/gfileiostream.h:18</i><br>
		 * gboolean_callback(GFileIOStream* stream, goffset offset, GSeekType type, GCancellable* cancellable, GError** error);<br>
		 * Conversion Error : GSeekType (Unsupported type)
		 */
		/**
		 * SKIPPED:<br>
		 * <i>native declaration : glib-2.0/gio/gfileiostream.h:18</i><br>
		 * gboolean_callback(GFileIOStream* stream, goffset offset, GSeekType type, GCancellable* cancellable, GError** error);<br>
		 * Conversion Error : GSeekType (Unsupported type)
		 */
	};
	/** <i>native declaration : glib-2.0/gio/gfileiostream.h:39</i> */
	public static abstract class gboolean_callback3 extends Callback<gboolean_callback3 > {
		public final void apply(Pointer<GFileIOStream > stream) {
			apply(Pointer.getPeer(stream));
		}
		public abstract void apply(@Ptr long stream);
	};
	/** <i>native declaration : glib-2.0/gio/gfileiostream.h:40</i> */
	public static abstract class gboolean_callback4 extends Callback<gboolean_callback4 > {
		public final void apply(Pointer<GFileIOStream > stream, long size, Pointer<GCancellable > cancellable, Pointer<Pointer > error) {
			apply(Pointer.getPeer(stream), size, Pointer.getPeer(cancellable), Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long stream, long size, @Ptr long cancellable, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/gio/gfileiostream.h:41</i> */
	public static abstract class query_info_callback extends Callback<query_info_callback > {
		public final Pointer<GFileInfo > apply(Pointer<GFileIOStream > stream, Pointer<Byte > attributes, Pointer<GCancellable > cancellable, Pointer<Pointer > error) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(stream), Pointer.getPeer(attributes), Pointer.getPeer(cancellable), Pointer.getPeer(error)), GFileInfo.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long stream, @Ptr long attributes, @Ptr long cancellable, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/gio/gfileiostream.h:42</i> */
	public static abstract class query_info_async_callback extends Callback<query_info_async_callback > {
		public final void apply(Pointer<GFileIOStream > stream, Pointer<Byte > attributes, int io_priority, Pointer<GCancellable > cancellable, Pointer<GAsyncReadyCallback > callback, gpointer user_data) {
			apply(Pointer.getPeer(stream), Pointer.getPeer(attributes), io_priority, Pointer.getPeer(cancellable), Pointer.getPeer(callback), user_data);
		}
		public abstract void apply(@Ptr long stream, @Ptr long attributes, int io_priority, @Ptr long cancellable, @Ptr long callback, gpointer user_data);
	};
	/** <i>native declaration : glib-2.0/gio/gfileiostream.h:43</i> */
	public static abstract class query_info_finish_callback extends Callback<query_info_finish_callback > {
		public final Pointer<GFileInfo > apply(Pointer<GFileIOStream > stream, Pointer<GAsyncResult > result, Pointer<Pointer > error) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(stream), Pointer.getPeer(result), Pointer.getPeer(error)), GFileInfo.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long stream, @Ptr long result, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/gio/gfileiostream.h:44</i> */
	public static abstract class get_etag_callback extends Callback<get_etag_callback > {
		public final Pointer<Byte > apply(Pointer<GFileIOStream > stream) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(stream)), Byte.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long stream);
	};
	/** <i>native declaration : glib-2.0/gio/gfileiostream.h:45</i> */
	public static abstract class _g_reserved1_callback extends Callback<_g_reserved1_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gfileiostream.h:46</i> */
	public static abstract class _g_reserved2_callback extends Callback<_g_reserved2_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gfileiostream.h:47</i> */
	public static abstract class _g_reserved3_callback extends Callback<_g_reserved3_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gfileiostream.h:48</i> */
	public static abstract class _g_reserved4_callback extends Callback<_g_reserved4_callback > {
		public abstract void apply();
	};
	/** <i>native declaration : glib-2.0/gio/gfileiostream.h:49</i> */
	public static abstract class _g_reserved5_callback extends Callback<_g_reserved5_callback > {
		public abstract void apply();
	};
	public GFileIOStreamClass() {
		super();
	}
	public GFileIOStreamClass(Pointer pointer) {
		super(pointer);
	}
}
