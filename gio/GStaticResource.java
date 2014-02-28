package gio;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.CLong;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : glib-2.0/gio/gresource.h:10</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GStaticResource extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : const guint8* */
	@Field(0) 
	public Pointer<Byte > data() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : const guint8* */
	@Field(0) 
	public GStaticResource data(Pointer<Byte > data) {
		this.io.setPointerField(this, 0, data);
		return this;
	}
	/** C type : gsize */
	@CLong 
	@Field(1) 
	public long data_len() {
		return this.io.getCLongField(this, 1);
	}
	/** C type : gsize */
	@CLong 
	@Field(1) 
	public GStaticResource data_len(long data_len) {
		this.io.setCLongField(this, 1, data_len);
		return this;
	}
	/** Conversion Error : GResource* (failed to convert type to Java (undefined type)) */
	/** C type : GStaticResource* */
	@Field(3) 
	public Pointer<GStaticResource > next() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : GStaticResource* */
	@Field(3) 
	public GStaticResource next(Pointer<GStaticResource > next) {
		this.io.setPointerField(this, 3, next);
		return this;
	}
	/**
	 * Failed to convert value padding of type gpointer<br>
	 * C type : gpointer
	 */
}
