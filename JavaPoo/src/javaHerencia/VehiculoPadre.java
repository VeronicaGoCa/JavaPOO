package javaHerencia;

public class VehiculoPadre {
	private String marca;
	private String color;
	private String modelo;
	private int numeroAsientos;	
	
	public VehiculoPadre(String marca, String color, String modelo, int numeroAsientos) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.numeroAsientos = numeroAsientos;
	}

	public VehiculoPadre() {
		
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeroAsientos() {
		return numeroAsientos;
	}
	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}
	
	public void frenar() {
		System.out.println("El vehiculo esta frenando" );
	}

	public void acelerar() {
		System.out.println("El vehiculo esta acelerando");
	}

	public void arrancar() {
		System.out.println("El vehiculo esta arrancando");
	}
}
