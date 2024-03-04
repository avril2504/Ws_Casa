package casa;

public class Habitacion {
	private String nombre;
	private double metrosCuadrados;
	private TipoHabitacion tipoHabitacion;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public TipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}
	public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	@Override
	public String toString() {
		return "Habitacion [nombre=" + nombre + ", metrosCuadrados=" + metrosCuadrados + ", tipoHabitacion="
				+ tipoHabitacion + "]";
	}
	

}
