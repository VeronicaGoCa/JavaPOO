package javaArrayList;

public class Vehiculo {
	private String marca;
	private String color;
	private int numeroAsientos;
	
	public Vehiculo(String marca, String color, int numeroAsientos) {
		this.marca = marca;
		this.color = color;
		this.numeroAsientos = numeroAsientos;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", color=" + color + ", numeroAsientos=" + numeroAsientos + "]";
	}
	
	
	
	
}
