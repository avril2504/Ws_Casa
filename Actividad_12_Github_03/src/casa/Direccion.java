package casa;

public class Direccion {
	private String nombre_localidad;
	private String nombre_via;
	private long codigo_postal;
	private TipoVia tipoVia;
	
	public String getNombre_localidad() {
		return nombre_localidad;
	}
	public void setNombre_localidad(String nombre_localidad) {
		this.nombre_localidad = nombre_localidad;
	}
	public String getNombre_via() {
		return nombre_via;
	}
	public void setNombre_via(String nombre_via) {
		this.nombre_via = nombre_via;
	}
	public long getCodigo_postal() {
		return codigo_postal;
	}
	public void setCodigo_postal(long codigo_postal) {
		this.codigo_postal = codigo_postal;
	}
	public TipoVia getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(TipoVia tipoVia) {
		this.tipoVia = tipoVia;
	}
	@Override
	public String toString() {
		return "Direccion [nombre_localidad=" + nombre_localidad + ", nombre_via=" + nombre_via + ", codigo_postal="
				+ codigo_postal + ", tipoVia=" + tipoVia + "]";
	}
	public Direccion(String nombre_localidad, String nombre_via, long codigo_postal, TipoVia tipoVia) {
		super();
		this.nombre_localidad = nombre_localidad;
		this.nombre_via = nombre_via;
		this.codigo_postal = codigo_postal;
		this.tipoVia = tipoVia;
	}
	public Direccion() {
		super();
	}
	
	
}
