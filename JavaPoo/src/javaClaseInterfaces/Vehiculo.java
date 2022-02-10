package javaClaseInterfaces;

public class Vehiculo {
	private String marca;
	private String color;
	private String tipoVehiculo;
	
	public Vehiculo(String marca, String color, String tipoVehiculo) {
		this.marca = marca;
		this.color = color;
		this.tipoVehiculo = tipoVehiculo;
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

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
}
