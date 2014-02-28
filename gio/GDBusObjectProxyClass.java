package gio;
import gio.GIOLibrary.gpointer;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GDBusObjectProxyClass:<br>
 * @parent_class: The parent class.<br>
 * * Class structure for #GDBusObjectProxy.<br>
 * * Since: 2.30<br>
 * <i>native declaration : glib-2.0/gio/gdbusobjectproxy.h:24</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GDBusObjectProxyClass extends StructObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GObjectClass (Unsupported type) */
	/**
	 * < private ><br>
	 * C type : gpointer[8]
	 */
	@Array({8}) 
	@Field(1) 
	public Pointer<gpointer > padding() {
		return this.io.getPointerField(this, 1);
	}
}
