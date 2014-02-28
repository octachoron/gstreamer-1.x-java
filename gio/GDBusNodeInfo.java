package gio;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * GDBusNodeInfo:<br>
 * @ref_count: The reference count or -1 if statically allocated.<br>
 * @path: The path of the node or %NULL if omitted. Note that this may be a relative path. See the D-Bus specification for more details.<br>
 * @interfaces: (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusInterfaceInfo structures or %NULL if there are no interfaces.<br>
 * @nodes: (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusNodeInfo structures or %NULL if there are no nodes.<br>
 * @annotations: (array zero-terminated=1): A pointer to a %NULL-terminated array of pointers to #GDBusAnnotationInfo structures or %NULL if there are no annotations.<br>
 * * Information about nodes in a remote object hierarchy.<br>
 * * Since: 2.26<br>
 * <i>native declaration : glib-2.0/gio/gdbusintrospection.h:122</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public class GDBusNodeInfo extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * < public ><br>
	 * C type : volatile gint
	 */
	@Field(0) 
	public int ref_count() {
		return this.io.getIntField(this, 0);
	}
	/**
	 * < public ><br>
	 * C type : volatile gint
	 */
	@Field(0) 
	public GDBusNodeInfo ref_count(int ref_count) {
		this.io.setIntField(this, 0, ref_count);
		return this;
	}
	/** C type : gchar* */
	@Field(1) 
	public Pointer<Byte > path() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : gchar* */
	@Field(1) 
	public GDBusNodeInfo path(Pointer<Byte > path) {
		this.io.setPointerField(this, 1, path);
		return this;
	}
	/** C type : GDBusInterfaceInfo** */
	@Field(2) 
	public Pointer<Pointer<GDBusInterfaceInfo > > interfaces() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : GDBusInterfaceInfo** */
	@Field(2) 
	public GDBusNodeInfo interfaces(Pointer<Pointer<GDBusInterfaceInfo > > interfaces) {
		this.io.setPointerField(this, 2, interfaces);
		return this;
	}
	/** C type : GDBusNodeInfo** */
	@Field(3) 
	public Pointer<Pointer<GDBusNodeInfo > > nodes() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : GDBusNodeInfo** */
	@Field(3) 
	public GDBusNodeInfo nodes(Pointer<Pointer<GDBusNodeInfo > > nodes) {
		this.io.setPointerField(this, 3, nodes);
		return this;
	}
	/** C type : GDBusAnnotationInfo** */
	@Field(4) 
	public Pointer<Pointer<GDBusAnnotationInfo > > annotations() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : GDBusAnnotationInfo** */
	@Field(4) 
	public GDBusNodeInfo annotations(Pointer<Pointer<GDBusAnnotationInfo > > annotations) {
		this.io.setPointerField(this, 4, annotations);
		return this;
	}
	public GDBusNodeInfo() {
		super();
	}
	public GDBusNodeInfo(Pointer pointer) {
		super(pointer);
	}
}
