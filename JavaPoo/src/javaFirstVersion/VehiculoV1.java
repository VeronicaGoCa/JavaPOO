package javaFirstVersion;

public class VehiculoV1 {
	String marca;
	String color;
	String modelo;
	int numeroAsientos;

	void iniciandoParametros(String marca, String color, String modelo, int numeroAsientos) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.numeroAsientos =numeroAsientos;
	}

	void frenar() {
		System.out.println("El Vehiculo fue frenado");
	}

	void acelerar() {
		System.out.println("El Vehiculo esta acelerando");
	}

	void arrancar() {
		System.out.println("El Vehiculo esta arrancando");
	}

	void tocarMusica() {
		System.out.println("Tocando musica");
	}

	void mostrarResultados() {
		System.out.println("Marca: " + marca);
		System.out.println("Color: " + color);
		System.out.println("Modelo: " + modelo);
		System.out.println("Numero de asientos: " + numeroAsientos);
	}
}
