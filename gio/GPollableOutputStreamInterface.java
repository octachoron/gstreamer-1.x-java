package gio;
import gio.GIOLibrary.GPollableOutputStream;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.CLong;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
/**
 * GPollableOutputStreamInterface:<br>
 * @g_iface: The parent interface.<br>
 * @can_poll: Checks if the #GPollableOutputStream instance is actually pollable<br>
 * @is_writable: Checks if the stream is writable<br>
 * @create_source: Creates a #GSource to poll the stream<br>
 * @write_nonblocking: Does a non-blocking write or returns<br>
 *   %G_IO_ERROR_WOULD_BLOCK<br>
 * * The interface for pollable output streams.<br>
 * * The default implementation of @can_poll always returns %TRUE.<br>
 * * The default implementation of @write_nonblocking calls<br>
 * g_pollable_output_stream_is_writable(), and then calls<br>
 * g_output_stream_write() if it returns %TRUE. This means you only<br>
 * need to override it if it is possible that your @is_writable<br>
 * implementation may return %TRUE when the stream is not actually<br>
 * writable.<br>
 * * Since: 2.28<br>
 * <i>native declaration : glib-2.0/gio/gpollableoutputstream.h:41</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GPollableOutputStreamInterface extends CPPObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GTypeInterface (Unsupported type) */
	/** C type : create_source_callback* */
	@Field(1) 
	public Pointer<GPollableOutputStreamInterface.create_source_callback > create_source() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : create_source_callback* */
	@Field(1) 
	public GPollableOutputStreamInterface create_source(Pointer<GPollableOutputStreamInterface.create_source_callback > create_source) {
		this.io.setPointerField(this, 1, create_source);
		return this;
	}
	/** <i>native declaration : glib-2.0/gio/gpollableoutputstream.h:37</i> */
	public static abstract class gboolean_callback extends Callback<gboolean_callback > {
		public final void apply(Pointer<GPollableOutputStream > stream) {
			apply(Pointer.getPeer(stream));
		}
		public abstract void apply(@Ptr long stream);
	};
	/** <i>native declaration : glib-2.0/gio/gpollableoutputstream.h:38</i> */
	public static abstract class gboolean_callback2 extends Callback<gboolean_callback2 > {
		public final void apply(Pointer<GPollableOutputStream > stream) {
			apply(Pointer.getPeer(stream));
		}
		public abstract void apply(@Ptr long stream);
	};
	/** <i>native declaration : glib-2.0/gio/gpollableoutputstream.h:39</i> */
	public static abstract class create_source_callback extends Callback<create_source_callback > {
		public final Pointer apply(Pointer<GPollableOutputStream > stream, Pointer<GCancellable > cancellable) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(stream), Pointer.getPeer(cancellable)));
		}
		@Ptr 
		public abstract long apply(@Ptr long stream, @Ptr long cancellable);
	};
	/** <i>native declaration : glib-2.0/gio/gpollableoutputstream.h:40</i> */
	public static abstract class gssize_callback extends Callback<gssize_callback > {
		public final void apply(Pointer<GPollableOutputStream > stream, Pointer<? > buffer, @CLong long count, Pointer<Pointer > error) {
			apply(Pointer.getPeer(stream), Pointer.getPeer(buffer), count, Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long stream, @Ptr long buffer, @CLong long count, @Ptr long error);
	};
}
