package casa;

public class Casa {
	
	//Atributos
	private Direccion direccion;
	private double precio;
	private boolean segundaMano;
	private double metrosCuadrados;
	private Jardin jardin;
	private Habitacion habitacion;
	
	//To String
	@Override
	public String toString() {
		return "Casa [direccion=" + direccion + ", precio=" + precio + ", segundaMano=" + segundaMano
				+ ", metrosCuadrados=" + metrosCuadrados + ", jardin=" + jardin + ", habitacion=" + habitacion + "]";
	}
	
	//Constructor
	public Casa(Direccion direccion, double precio, boolean segundaMano, double metrosCuadrados, Jardin jardin,
			Habitacion habitacion) {
		super();
		this.direccion = direccion;
		this.precio = precio;
		this.segundaMano = segundaMano;
		this.metrosCuadrados = metrosCuadrados;
		this.jardin = jardin;
		this.habitacion = habitacion;
	}
	
	//Setters and Getters
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isSegundaMano() {
		return segundaMano;
	}
	public void setSegundaMano(boolean segundaMano) {
		this.segundaMano = segundaMano;
	}
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public Jardin getJardin() {
		return jardin;
	}
	public void setJardin(Jardin jardin) {
		this.jardin = jardin;
	}
	public Habitacion getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	
	//Metodos:
	
	
	

}
