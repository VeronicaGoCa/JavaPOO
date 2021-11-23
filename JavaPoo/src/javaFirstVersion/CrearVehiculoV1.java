package javaFirstVersion;

public class CrearVehiculoV1 {

	public static void main(String[] args) {
		VehiculoV1 vehiculo = new VehiculoV1();
		vehiculo.color = "rojo";
		vehiculo.marca= "Nissan";
		vehiculo.modelo = "Minivan";
		vehiculo.numeroAsientos = 4;

		System.out.println("----Creando un vehiculo Minivan ------");
		System.out.println("Marca: " + vehiculo.marca);
		System.out.println("Color: " + vehiculo.color);
		System.out.println("Modelo: " + vehiculo.modelo);
		System.out.println("Numero de asientos: " + vehiculo.numeroAsientos);

		vehiculo.arrancar();
		vehiculo.acelerar();
		vehiculo.frenar();
		vehiculo.tocarMusica();
				
		vehiculo.color = "Verde";
		vehiculo.marca= "Toyota";
		vehiculo.modelo = "Convertible";
		vehiculo.numeroAsientos = 2;

		System.out.println("----Creando un vehiculo Convertible ------");
		System.out.println("Marca: " + vehiculo.marca);
		System.out.println("Color: " + vehiculo.color);
		System.out.println("Modelo: " + vehiculo.modelo);
		System.out.println("Numero de asientos: " + vehiculo.numeroAsientos);

		vehiculo.arrancar();
		vehiculo.acelerar();
		vehiculo.frenar();
		vehiculo.tocarMusica();

	}

}
