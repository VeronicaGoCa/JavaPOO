package javaHerencia;

public class VehiculoAereo extends VehiculoPadre {
	public VehiculoAereo() {
		
	}
	
	public VehiculoAereo(String marca, String color, String modelo, int numeroAsientos) {
		super(marca, color, modelo, numeroAsientos);
	}

	public void mostrarTipoTransporte() {
		System.out.println("-----DETALLE: Vehiculo Aéreo");
	}
	
	@Override
	public void acelerar() {
		super.acelerar();
		System.out.println("El vehiculo aereo esta acelerando");
	}
}
