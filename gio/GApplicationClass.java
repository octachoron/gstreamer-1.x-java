package gio;
import gio.GIOLibrary.GDBusConnection;
import gio.GIOLibrary.GFile;
import gio.GIOLibrary.GVariant;
import gio.GIOLibrary.gpointer;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.cpp.CPPObject;
/**
 * <i>native declaration : glib-2.0/gio/gapplication.h:61</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("GIO") 
public abstract class GApplicationClass extends CPPObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : GObjectClass (Unsupported type) */
	/**
	 * signals<br>
	 * C type : startup_callback*
	 */
	@Field(1) 
	public Pointer<GApplicationClass.startup_callback > startup() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * signals<br>
	 * C type : startup_callback*
	 */
	@Field(1) 
	public GApplicationClass startup(Pointer<GApplicationClass.startup_callback > startup) {
		this.io.setPointerField(this, 1, startup);
		return this;
	}
	/** C type : activate_callback* */
	@Field(2) 
	public Pointer<GApplicationClass.activate_callback > activate() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : activate_callback* */
	@Field(2) 
	public GApplicationClass activate(Pointer<GApplicationClass.activate_callback > activate) {
		this.io.setPointerField(this, 2, activate);
		return this;
	}
	/** C type : open_callback* */
	@Field(3) 
	public Pointer<GApplicationClass.open_callback > open() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : open_callback* */
	@Field(3) 
	public GApplicationClass open(Pointer<GApplicationClass.open_callback > open) {
		this.io.setPointerField(this, 3, open);
		return this;
	}
	/** C type : command_line_callback* */
	@Field(4) 
	public Pointer<GApplicationClass.command_line_callback > command_line() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : command_line_callback* */
	@Field(4) 
	public GApplicationClass command_line(Pointer<GApplicationClass.command_line_callback > command_line) {
		this.io.setPointerField(this, 4, command_line);
		return this;
	}
	/** C type : before_emit_callback* */
	@Field(5) 
	public Pointer<GApplicationClass.before_emit_callback > before_emit() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : before_emit_callback* */
	@Field(5) 
	public GApplicationClass before_emit(Pointer<GApplicationClass.before_emit_callback > before_emit) {
		this.io.setPointerField(this, 5, before_emit);
		return this;
	}
	/** C type : after_emit_callback* */
	@Field(6) 
	public Pointer<GApplicationClass.after_emit_callback > after_emit() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : after_emit_callback* */
	@Field(6) 
	public GApplicationClass after_emit(Pointer<GApplicationClass.after_emit_callback > after_emit) {
		this.io.setPointerField(this, 6, after_emit);
		return this;
	}
	/** C type : add_platform_data_callback* */
	@Field(7) 
	public Pointer<GApplicationClass.add_platform_data_callback > add_platform_data() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : add_platform_data_callback* */
	@Field(7) 
	public GApplicationClass add_platform_data(Pointer<GApplicationClass.add_platform_data_callback > add_platform_data) {
		this.io.setPointerField(this, 7, add_platform_data);
		return this;
	}
	/** C type : quit_mainloop_callback* */
	@Field(8) 
	public Pointer<GApplicationClass.quit_mainloop_callback > quit_mainloop() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : quit_mainloop_callback* */
	@Field(8) 
	public GApplicationClass quit_mainloop(Pointer<GApplicationClass.quit_mainloop_callback > quit_mainloop) {
		this.io.setPointerField(this, 8, quit_mainloop);
		return this;
	}
	/** C type : run_mainloop_callback* */
	@Field(9) 
	public Pointer<GApplicationClass.run_mainloop_callback > run_mainloop() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : run_mainloop_callback* */
	@Field(9) 
	public GApplicationClass run_mainloop(Pointer<GApplicationClass.run_mainloop_callback > run_mainloop) {
		this.io.setPointerField(this, 9, run_mainloop);
		return this;
	}
	/** C type : shutdown_callback* */
	@Field(10) 
	public Pointer<GApplicationClass.shutdown_callback > shutdown() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : shutdown_callback* */
	@Field(10) 
	public GApplicationClass shutdown(Pointer<GApplicationClass.shutdown_callback > shutdown) {
		this.io.setPointerField(this, 10, shutdown);
		return this;
	}
	/** C type : dbus_unregister_callback* */
	@Field(11) 
	public Pointer<GApplicationClass.dbus_unregister_callback > dbus_unregister() {
		return this.io.getPointerField(this, 11);
	}
	/** C type : dbus_unregister_callback* */
	@Field(11) 
	public GApplicationClass dbus_unregister(Pointer<GApplicationClass.dbus_unregister_callback > dbus_unregister) {
		this.io.setPointerField(this, 11, dbus_unregister);
		return this;
	}
	/**
	 * < private ><br>
	 * C type : gpointer[9]
	 */
	@Array({9}) 
	@Field(12) 
	public Pointer<gpointer > padding() {
		return this.io.getPointerField(this, 12);
	}
	/** <i>native declaration : glib-2.0/gio/gapplication.h:48</i> */
	public static abstract class startup_callback extends Callback<startup_callback > {
		public final void apply(Pointer<GApplication > application) {
			apply(Pointer.getPeer(application));
		}
		public abstract void apply(@Ptr long application);
	};
	/** <i>native declaration : glib-2.0/gio/gapplication.h:49</i> */
	public static abstract class activate_callback extends Callback<activate_callback > {
		public final void apply(Pointer<GApplication > application) {
			apply(Pointer.getPeer(application));
		}
		public abstract void apply(@Ptr long application);
	};
	/** <i>native declaration : glib-2.0/gio/gapplication.h:50</i> */
	public static abstract class open_callback extends Callback<open_callback > {
		public final void apply(Pointer<GApplication > application, Pointer<Pointer<GFile > > files, int n_files, Pointer<Byte > hint) {
			apply(Pointer.getPeer(application), Pointer.getPeer(files), n_files, Pointer.getPeer(hint));
		}
		public abstract void apply(@Ptr long application, @Ptr long files, int n_files, @Ptr long hint);
	};
	/** <i>native declaration : glib-2.0/gio/gapplication.h:51</i> */
	public static abstract class command_line_callback extends Callback<command_line_callback > {
		public final int apply(Pointer<GApplication > application, Pointer<GApplicationCommandLine > command_line) {
			return apply(Pointer.getPeer(application), Pointer.getPeer(command_line));
		}
		public abstract int apply(@Ptr long application, @Ptr long command_line);
	};
	/** <i>native declaration : glib-2.0/gio/gapplication.h:52</i> */
	public static abstract class gboolean_callback extends Callback<gboolean_callback > {
		public final void apply(Pointer<GApplication > application, Pointer<Pointer<Pointer<Byte > > > arguments, Pointer<Integer > exit_status) {
			apply(Pointer.getPeer(application), Pointer.getPeer(arguments), Pointer.getPeer(exit_status));
		}
		public abstract void apply(@Ptr long application, @Ptr long arguments, @Ptr long exit_status);
	};
	/** <i>native declaration : glib-2.0/gio/gapplication.h:53</i> */
	public static abstract class before_emit_callback extends Callback<before_emit_callback > {
		public final void apply(Pointer<GApplication > application, Pointer<GVariant > platform_data) {
			apply(Pointer.getPeer(application), Pointer.getPeer(platform_data));
		}
		public abstract void apply(@Ptr long application, @Ptr long platform_data);
	};
	/** <i>native declaration : glib-2.0/gio/gapplication.h:54</i> */
	public static abstract class after_emit_callback extends Callback<after_emit_callback > {
		public final void apply(Pointer<GApplication > application, Pointer<GVariant > platform_data) {
			apply(Pointer.getPeer(application), Pointer.getPeer(platform_data));
		}
		public abstract void apply(@Ptr long application, @Ptr long platform_data);
	};
	/** <i>native declaration : glib-2.0/gio/gapplication.h:55</i> */
	public static abstract class add_platform_data_callback extends Callback<add_platform_data_callback > {
		public final void apply(Pointer<GApplication > application, Pointer builder) {
			apply(Pointer.getPeer(application), Pointer.getPeer(builder));
		}
		public abstract void apply(@Ptr long application, @Ptr long builder);
	};
	/** <i>native declaration : glib-2.0/gio/gapplication.h:56</i> */
	public static abstract class quit_mainloop_callback extends Callback<quit_mainloop_callback > {
		public final void apply(Pointer<GApplication > application) {
			apply(Pointer.getPeer(application));
		}
		public abstract void apply(@Ptr long application);
	};
	/** <i>native declaration : glib-2.0/gio/gapplication.h:57</i> */
	public static abstract class run_mainloop_callback extends Callback<run_mainloop_callback > {
		public final void apply(Pointer<GApplication > application) {
			apply(Pointer.getPeer(application));
		}
		public abstract void apply(@Ptr long application);
	};
	/** <i>native declaration : glib-2.0/gio/gapplication.h:58</i> */
	public static abstract class shutdown_callback extends Callback<shutdown_callback > {
		public final void apply(Pointer<GApplication > application) {
			apply(Pointer.getPeer(application));
		}
		public abstract void apply(@Ptr long application);
	};
	/** <i>native declaration : glib-2.0/gio/gapplication.h:59</i> */
	public static abstract class gboolean_callback2 extends Callback<gboolean_callback2 > {
		public final void apply(Pointer<GApplication > application, Pointer<GDBusConnection > connection, Pointer<Byte > object_path, Pointer<Pointer > error) {
			apply(Pointer.getPeer(application), Pointer.getPeer(connection), Pointer.getPeer(object_path), Pointer.getPeer(error));
		}
		public abstract void apply(@Ptr long application, @Ptr long connection, @Ptr long object_path, @Ptr long error);
	};
	/** <i>native declaration : glib-2.0/gio/gapplication.h:60</i> */
	public static abstract class dbus_unregister_callback extends Callback<dbus_unregister_callback > {
		public final void apply(Pointer<GApplication > application, Pointer<GDBusConnection > connection, Pointer<Byte > object_path) {
			apply(Pointer.getPeer(application), Pointer.getPeer(connection), Pointer.getPeer(object_path));
		}
		public abstract void apply(@Ptr long application, @Ptr long connection, @Ptr long object_path);
	};
}
