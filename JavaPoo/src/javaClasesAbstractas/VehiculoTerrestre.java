package javaClasesAbstractas;

public class VehiculoTerrestre extends VehiculoPadre {

	public VehiculoTerrestre(String marca, String color, String tipoVehiculo) {
		super(marca, color, tipoVehiculo);
		
	}

	@Override
	public void frenar() {
		System.out.println("VEHICULO TERRESTRE: "+ this.getTipoVehiculo() +"  de color = " + this.getColor() + " y marca = " + this.getMarca() + " esta frenando");
		
	}

	@Override
	public void acelerar() {
		System.out.println("VEHICULO TERRESTRE: "+ this.getTipoVehiculo() +"  de color = " + this.getColor() + " y marca = " + this.getMarca() + " esta acelerando");
		
	}
	

}
