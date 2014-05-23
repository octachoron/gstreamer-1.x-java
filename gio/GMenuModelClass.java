package gio;
import gio.GIOLibrary.GHashTable;
import gio.GIOLibrary.GVariant;
import gio.GIOLibrary.GVariantType;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
/**
 * GMenuModelClass::get_item_links:<br>
 * @model: the #GMenuModel to query<br>
 * @item_index: The #GMenuItem to query<br>
 * @links: (out) (element-type utf8 GLib.MenuModel): Links from the item<br>
 * * Gets all the links associated with the item in the menu model.<br>
 * <i>native declaration : glib-2.0/gio/gmenumodel.h:39</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GMenuModelClass extends CPPObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GObjectClass (Unsupported type) */
	/** C type : get_n_items_callback* */
	@Field(1) 
	public Pointer<GMenuModelClass.get_n_items_callback > get_n_items() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : get_n_items_callback* */
	@Field(1) 
	public GMenuModelClass get_n_items(Pointer<GMenuModelClass.get_n_items_callback > get_n_items) {
		this.io.setPointerField(this, 1, get_n_items);
		return this;
	}
	/** C type : get_item_attributes_callback* */
	@Field(2) 
	public Pointer<GMenuModelClass.get_item_attributes_callback > get_item_attributes() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : get_item_attributes_callback* */
	@Field(2) 
	public GMenuModelClass get_item_attributes(Pointer<GMenuModelClass.get_item_attributes_callback > get_item_attributes) {
		this.io.setPointerField(this, 2, get_item_attributes);
		return this;
	}
	/** C type : iterate_item_attributes_callback* */
	@Field(3) 
	public Pointer<GMenuModelClass.iterate_item_attributes_callback > iterate_item_attributes() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : iterate_item_attributes_callback* */
	@Field(3) 
	public GMenuModelClass iterate_item_attributes(Pointer<GMenuModelClass.iterate_item_attributes_callback > iterate_item_attributes) {
		this.io.setPointerField(this, 3, iterate_item_attributes);
		return this;
	}
	/** C type : get_item_attribute_value_callback* */
	@Field(4) 
	public Pointer<GMenuModelClass.get_item_attribute_value_callback > get_item_attribute_value() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : get_item_attribute_value_callback* */
	@Field(4) 
	public GMenuModelClass get_item_attribute_value(Pointer<GMenuModelClass.get_item_attribute_value_callback > get_item_attribute_value) {
		this.io.setPointerField(this, 4, get_item_attribute_value);
		return this;
	}
	/** C type : get_item_links_callback* */
	@Field(5) 
	public Pointer<GMenuModelClass.get_item_links_callback > get_item_links() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : get_item_links_callback* */
	@Field(5) 
	public GMenuModelClass get_item_links(Pointer<GMenuModelClass.get_item_links_callback > get_item_links) {
		this.io.setPointerField(this, 5, get_item_links);
		return this;
	}
	/** C type : iterate_item_links_callback* */
	@Field(6) 
	public Pointer<GMenuModelClass.iterate_item_links_callback > iterate_item_links() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : iterate_item_links_callback* */
	@Field(6) 
	public GMenuModelClass iterate_item_links(Pointer<GMenuModelClass.iterate_item_links_callback > iterate_item_links) {
		this.io.setPointerField(this, 6, iterate_item_links);
		return this;
	}
	/** C type : get_item_link_callback* */
	@Field(7) 
	public Pointer<GMenuModelClass.get_item_link_callback > get_item_link() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : get_item_link_callback* */
	@Field(7) 
	public GMenuModelClass get_item_link(Pointer<GMenuModelClass.get_item_link_callback > get_item_link) {
		this.io.setPointerField(this, 7, get_item_link);
		return this;
	}
	/** <i>native declaration : glib-2.0/gio/gmenumodel.h:31</i> */
	public static abstract class gboolean_callback extends Callback<gboolean_callback > {
		public final void apply(Pointer<GMenuModel > model) {
			apply(Pointer.getPeer(model));
		}
		public abstract void apply(@Ptr long model);
	};
	/** <i>native declaration : glib-2.0/gio/gmenumodel.h:32</i> */
	public static abstract class get_n_items_callback extends Callback<get_n_items_callback > {
		public final int apply(Pointer<GMenuModel > model) {
			return apply(Pointer.getPeer(model));
		}
		public abstract int apply(@Ptr long model);
	};
	/** <i>native declaration : glib-2.0/gio/gmenumodel.h:33</i> */
	public static abstract class get_item_attributes_callback extends Callback<get_item_attributes_callback > {
		public final void apply(Pointer<GMenuModel > model, int item_index, Pointer<Pointer<GHashTable > > attributes) {
			apply(Pointer.getPeer(model), item_index, Pointer.getPeer(attributes));
		}
		public abstract void apply(@Ptr long model, int item_index, @Ptr long attributes);
	};
	/** <i>native declaration : glib-2.0/gio/gmenumodel.h:34</i> */
	public static abstract class iterate_item_attributes_callback extends Callback<iterate_item_attributes_callback > {
		public final Pointer<GMenuAttributeIter > apply(Pointer<GMenuModel > model, int item_index) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(model), item_index), GMenuAttributeIter.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long model, int item_index);
	};
	/** <i>native declaration : glib-2.0/gio/gmenumodel.h:35</i> */
	public static abstract class get_item_attribute_value_callback extends Callback<get_item_attribute_value_callback > {
		public final Pointer<GVariant > apply(Pointer<GMenuModel > model, int item_index, Pointer<Byte > attribute, Pointer<GVariantType > expected_type) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(model), item_index, Pointer.getPeer(attribute), Pointer.getPeer(expected_type)), GVariant.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long model, int item_index, @Ptr long attribute, @Ptr long expected_type);
	};
	/** <i>native declaration : glib-2.0/gio/gmenumodel.h:36</i> */
	public static abstract class get_item_links_callback extends Callback<get_item_links_callback > {
		public final void apply(Pointer<GMenuModel > model, int item_index, Pointer<Pointer<GHashTable > > links) {
			apply(Pointer.getPeer(model), item_index, Pointer.getPeer(links));
		}
		public abstract void apply(@Ptr long model, int item_index, @Ptr long links);
	};
	/** <i>native declaration : glib-2.0/gio/gmenumodel.h:37</i> */
	public static abstract class iterate_item_links_callback extends Callback<iterate_item_links_callback > {
		public final Pointer<GMenuLinkIter > apply(Pointer<GMenuModel > model, int item_index) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(model), item_index), GMenuLinkIter.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long model, int item_index);
	};
	/** <i>native declaration : glib-2.0/gio/gmenumodel.h:38</i> */
	public static abstract class get_item_link_callback extends Callback<get_item_link_callback > {
		public final Pointer<GMenuModel > apply(Pointer<GMenuModel > model, int item_index, Pointer<Byte > link) {
			return Pointer.pointerToAddress(apply(Pointer.getPeer(model), item_index, Pointer.getPeer(link)), GMenuModel.class);
		}
		@Ptr 
		public abstract long apply(@Ptr long model, int item_index, @Ptr long link);
	};
}