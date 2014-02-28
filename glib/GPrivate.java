package glib;
import glib.GLibLibrary.GDestroyNotify;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : glib-2.0/glib/gthread.h:39</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GLib") 
public abstract class GPrivate extends StructObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : gpointer (Unsupported type) */
	/** C type : GDestroyNotify */
	@Field(1) 
	public Pointer<GDestroyNotify > notify$() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : GDestroyNotify */
	@Field(1) 
	public GPrivate notify$(Pointer<GDestroyNotify > notify$) {
		this.io.setPointerField(this, 1, notify$);
		return this;
	}
	/**
	 * Failed to convert value future of type gpointer[2]<br>
	 * C type : gpointer[2]
	 */
}