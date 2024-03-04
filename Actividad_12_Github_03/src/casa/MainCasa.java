package casa;

public class MainCasa {

	public static void main(String[] args) {
		Direccion d1 = new Direccion();
		d1.setCodigo_postal(28041);
		d1.setNombre_localidad("Madrid");
		d1.setNombre_via("Orense 62");
		d1.setTipoVia(TipoVia.CALLE);
		Habitacion h1 = new Habitacion();
		h1.setMetrosCuadrados(10);
		h1.setNombre("Elenon");
		h1.setTipoHabitacion(TipoHabitacion.SALON);
		Jardin j1 = new Jardin();
		j1.setMetroCuadrado(200);
		j1.setNumeroPlantas(800);
		Casa c1 = new Casa(d1, 1000000, false, 50000, j1, h1);
		
		Direccion d2 = new Direccion();
		d2.setCodigo_postal(28044);
		d2.setNombre_localidad("Madrid");
		d2.setNombre_via("Orense 63");
		d2.setTipoVia(TipoVia.CALLE);
		Habitacion h2 = new Habitacion();
		h1.setMetrosCuadrados(3);
		h1.setNombre("Aleksandron");
		h1.setTipoHabitacion(TipoHabitacion.COCINA);
		Casa c2 = new Casa(d2, 1000, true, 50,null, h2);
		
		c1.esChalet();
		c1.calcular_metros_cuadrados_1();
		c1.precioConIva();
		
		c2.esChalet();
		c2.calcular_metros_cuadrados_1();
		c2.precioConIva();
	}

}
