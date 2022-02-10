package javaClaseInterfaces;

public class VehiculoAereo extends Vehiculo implements InterfazVehiculoComp, InterfazVehiculoImpuestos {

	public VehiculoAereo(String marca, String color, String tipoVehiculo) {
		super(marca, color, tipoVehiculo);		
	}

	@Override
	public void frenar() {
		System.out.println("VEHICULO AEREO: " + this.getTipoVehiculo() + " de color= " + this.getColor() + "y marca = " + this.getMarca() + " esta frenando");
		
	}

	@Override
	public void acelerar() {
		System.out.println("VEHICULO AEREO: " + this.getTipoVehiculo() + " de color= " + this.getColor() + "y marca = " + this.getMarca() + " esta acelerando");
		
	}

	@Override
	public void detalleImpuesto() {
		System.out.println("El Vehiculo " + this.getTipoVehiculo() +" Cancelo sus impuestos");
		
	}

}
