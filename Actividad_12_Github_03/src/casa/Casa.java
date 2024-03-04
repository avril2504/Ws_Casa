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

	//Metodo 2:
	public boolean esChalet () {
		if (this.jardin != null) {
			System.out.println("La casa es un chalet");
			return true;
		}else {
			System.out.println("La casa no es un chalet");
			return false;
		}
	}
	
	//Metodo 1:
	/**
	 * Este metodo calcula los metros cuadrdos de la casa utilizando
	 * los metros cuadrados de la habitacion y del jardin
	 */
	public void calcular_metros_cuadrados_1() {
		double suma = 0.0;
		suma += this.habitacion.getMetrosCuadrados();
		suma += this.jardin.getMetroCuadrado();
		suma = this.metrosCuadrados;
		System.out.println("Los metros cuadrados totales de la casa son: " + suma);
	}

	//Metodo 3:
	public void precioConIva() {
		if (this.segundaMano == true) {
			double precioSegundaMano = precio * 0.05;
			this.precio= precioSegundaMano;
		}else {
			double precioNueva = precio * 0.10;
			this.precio = precioNueva;
		}
			
	}

	

}
