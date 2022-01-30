package javaHerencia;

public class ClaseMain {

	public static void main(String[] args) {
		/*Herencia*/
		VehiculoTerrestre automovil = new VehiculoTerrestre();
		automovil.mostrarTipoTransporte();
		automovil.setColor("rojo");
		automovil.setMarca("Toyota");
		System.out.println("Color: "+automovil.getColor());
		System.out.println("Marca: "+automovil.getMarca());
		
		/*Sobreescritura de metodos*/
		automovil.acelerar();

		/*Herencia*/
		VehiculoAereo avion = new VehiculoAereo();
		avion.mostrarTipoTransporte();
		avion.setColor("plomo");
		avion.setMarca("F-22 Raptor");
		System.out.println("Color: "+avion.getColor());
		System.out.println("Marca: "+avion.getMarca());
		avion.acelerar();
		
		/*sobreescritura de constructor*/
		VehiculoTerrestre automovil2 = new VehiculoTerrestre("Nissan", "azul", "2000", 12);
		automovil2.mostrarTipoTransporte();
		System.out.println("Color: "+automovil2.getColor());
		System.out.println("Marca: "+automovil2.getMarca());
		System.out.println("Modelo: "+automovil2.getModelo());
		System.out.println("Numero de Asientos: "+automovil2.getNumeroAsientos());
		
	}

}
