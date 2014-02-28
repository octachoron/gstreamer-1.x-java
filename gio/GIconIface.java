package gio;
import gio.GIOLibrary.GIcon;
import gio.GIOLibrary.GVariant;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
/**
 * GIconIface:<br>
 * @g_iface: The parent interface.<br>
 * @hash: A hash for a given #GIcon.<br>
 * @equal: Checks if two #GIcon<!-- -->s are equal.<br>
 * @to_tokens: Serializes a #GIcon into tokens. The tokens must not<br>
 * contain any whitespace. Don't implement if the #GIcon can't be<br>
 * serialized (Since 2.20).<br>
 * @from_tokens: Constructs a #GIcon from tokens. Set the #GError if<br>
 * the tokens are malformed. Don't implement if the #GIcon can't be<br>
 * serialized (Since 2.20).<br>
 * * GIconIface is used to implement GIcon types for various<br>
 * different systems. See #GThemedIcon and #GLoadableIcon for<br>
 * examples of how to implement this interface.<br>
 * <i>native declaration : glib-2.0/gio/gicon.h:36</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GIconIface extends CPPObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GTypeInterface (Unsupported type) */
	/** C type : from_tokens_callback* */
	@Field(1) 
	public Pointer<GIconIface.from_tokens_callback > from_tokens() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : from_tokens_callback* */
	@Field(1) 
	public GIconIface from_tokens(Pointer<GIconIface.from_tokens_callback > from_tokens) {
		this.io.setPointerField(this, 1, from_tokens);
		return this;
	}
	/** C type : serialize_callback* */
	@Field(2) 
	public Pointer<gio.GSocketControlMessageClass.serialize_callback > serialize() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : serialize_callback* */
	@Field(2) 
	public GIconIface serialize(Pointer<gio.GSocketControlMessageClass.serialize_callback > serialize) {
		this.io.setPointerField(this, 2, serialize);
		return this;
	}
	/** <i>native declaration : glib-2.0/gio/gicon.h:31</i> */
	public static abstract class guint_callback extends Callback<guint_callback > {
		public final void apply(Pointer<GIcon > icon) {
			apply(Pointer.getPeer(icon));
		}
		public abstract void apply(@Ptr long icon);
	};
	/** <i>native declaration : glib-2.0/gio/gicon.h:32</i> */
	public static abstract class gboolean_callback extends Callback<gboolean_callback > {
		public final void apply(Pointer<GIcon > icon1, Pointer<GIcon > icon2) {
			apply(Pointer.getPeer(icon1), Pointer.getPeer(icon2));
		}
		public abstract void apply(@Ptr long icon1, @Ptr long icon2);
	};
	/** <i>native declaration : glib-2.0/gio/gicon.h:33</i> */
	public static abstract class gboolean_callback2 extends Callback<gboolean_callback2 > {
		public final void apply(Pointer<GIcon > icon, Pointer tokens, Pointer<Integer > out_version) {
			apply(Pointer.getPeer(icon), Pointer.getPeer(tokens), Pointer.getPeer(out_version));
		}
		public abstract void apply(@Ptr long icon, @Ptr long tokens, @Ptr long out_version);
	};
	/** <i>native declaration : glib-2.0/gio/gicon.h:34</i> */
	public static abstract class from_tokens_callback extends Callback<from_tokens_callback > {
		public final Pointer<GIcon > apply(Pointer<Pointer<Byte > > tokens, int num_tokens, int version, Pointer<Pointer > error) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(tokens), num_tokens, version, Pointer.getPeer(error)), GIcon.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long tokens, int num_tokens, int version, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/gio/gicon.h:35</i> */
	public static abstract class serialize_callback extends Callback<serialize_callback > {
		public final Pointer<GVariant > apply(Pointer<GIcon > icon) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(icon)), GVariant.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long icon);
	};
}
