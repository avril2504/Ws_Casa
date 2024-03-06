package casa;

import java.util.ArrayList;

public class MainCasa {

	public static void main(String[] args) {
		
		Direccion d1 = new Direccion();
		d1.setCodigo_postal(28041);
		d1.setNombre_localidad("Madrid");
		d1.setNombre_via("Orense 62");
		d1.setTipoVia(TipoVia.CALLE);
		
		Habitacion h1 = new Habitacion();
		h1.setMetrosCuadrados(100);
		h1.setNombre("Elenon");
		h1.setTipoHabitacion(TipoHabitacion.SALON);
		Habitacion h2 = new Habitacion();
		h2.setMetrosCuadrados(50);
		h2.setNombre("Cocina");
		h2.setTipoHabitacion(TipoHabitacion.COCINA);
		Habitacion h3 = new Habitacion();
		h3.setMetrosCuadrados(45);
		h3.setNombre("Cuerto1");
		h3.setTipoHabitacion(TipoHabitacion.SALA_ESTAR);
		Habitacion h4 = new Habitacion();
		h4.setMetrosCuadrados(10);
		h4.setNombre("Banio Primera Planta");
		h4.setTipoHabitacion(TipoHabitacion.BANIO);
		
		ArrayList<Habitacion>listaHabitaciones = new ArrayList<Habitacion>();
		listaHabitaciones.add(h1);
		listaHabitaciones.add(h2);
		listaHabitaciones.add(h3);
		listaHabitaciones.add(h4);
		
		
		Jardin j1 = new Jardin();
		j1.setMetroCuadrado(200);
		j1.setNumeroPlantas(800);
		
		Casa c1 = new Casa(d1, 1000000, false, 50000, j1, listaHabitaciones);
		
		
		Direccion d2 = new Direccion();
		d2.setCodigo_postal(28044);
		d2.setNombre_localidad("Madrid");
		d2.setNombre_via("Orense 63");
		d2.setTipoVia(TipoVia.CALLE);
		
		Habitacion h1_2 = new Habitacion();
		h1_2.setMetrosCuadrados(2);
		h1_2.setNombre("Banion");
		h1_2.setTipoHabitacion(TipoHabitacion.BANIO);
		Habitacion h2_2 = new Habitacion();
		h2_2.setMetrosCuadrados(10);
		h2_2.setNombre("Cuarto");
		h2_2.setTipoHabitacion(TipoHabitacion.SALON);
		Habitacion h3_2 = new Habitacion();
		h3_2.setMetrosCuadrados(10);
		h3_2.setNombre("Sala");
		h3_2.setTipoHabitacion(TipoHabitacion.SALA_ESTAR);
		Habitacion h4_2 = new Habitacion();
		h4_2.setMetrosCuadrados(10);
		h4_2.setNombre("Cocina");
		h4_2.setTipoHabitacion(TipoHabitacion.COCINA);
		
		
		ArrayList<Habitacion>listaHabitaciones2 = new ArrayList<Habitacion>();
		listaHabitaciones2.add(h1_2);
		listaHabitaciones2.add(h2_2);
		listaHabitaciones2.add(h3_2);
		listaHabitaciones2.add(h4_2);
		
		Casa c2 = new Casa(d2, 1000, true, 50,null, listaHabitaciones2);
		
		
		c1.esChalet();
		c1.calcular_metros_cuadrados_1();
		c1.precioConIva();
		
		c2.esChalet();
		c2.calcular_metros_cuadrados_1();
		c2.precioConIva();
	}

}
