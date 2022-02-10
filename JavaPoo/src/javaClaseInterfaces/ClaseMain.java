package javaClaseInterfaces;

public class ClaseMain {
	public static void main(String[] args) {
		
		VehiculoTerrestre automovilTerrestre = new VehiculoTerrestre("Toyota", "azul", "Minibus");
		automovilTerrestre.acelerar();
		
		VehiculoAereo automovilAereo = new VehiculoAereo("F-22 Raptor", "blanco", "Avion");
		automovilAereo.acelerar();
		automovilAereo.detalleImpuesto();
	}
}
