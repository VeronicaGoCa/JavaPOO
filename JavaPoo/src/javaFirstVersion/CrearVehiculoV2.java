package javaFirstVersion;

public class CrearVehiculoV2 {

	public static void main(String[] args) {
		VehiculoV1 vehiculo = new VehiculoV1();
		vehiculo.iniciandoParametros("Nissan", "rojo", "Minivan", 4);
		System.out.println("----Creando un vehiculo Minivan ------");
		vehiculo.mostrarResultados();
		vehiculo.arrancar();
		vehiculo.acelerar();
		vehiculo.frenar();
		vehiculo.tocarMusica();

		vehiculo.iniciandoParametros("Toyota", "verde", "Convertible", 2);
		System.out.println("----Creando un vehiculo Convertible ------");
		vehiculo.mostrarResultados();
		vehiculo.arrancar();
		vehiculo.acelerar();
		vehiculo.frenar();
		vehiculo.tocarMusica();
		System.out.println(vehiculo.precioVehiculo("Toyota"));

	}

}
