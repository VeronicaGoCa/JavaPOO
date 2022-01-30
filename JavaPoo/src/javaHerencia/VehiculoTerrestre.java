package javaHerencia;

public class VehiculoTerrestre extends VehiculoPadre{
	
	public VehiculoTerrestre() {
		
	}
	public VehiculoTerrestre(String marca, String color, String modelo, int numeroAsientos) {
		super(marca, color, modelo, numeroAsientos);
	}
	
	public void mostrarTipoTransporte() {
		System.out.println("-------DETALLE: Vehiculo Terrestre");
	}
	
	@Override
	public void acelerar() {
		super.acelerar();
		System.out.println("El vehiculo  terrestre esta acelerando");
	}
}
