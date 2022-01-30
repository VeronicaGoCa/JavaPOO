package javaArrayList;

public class Mueble {
	private String tipoMueble;
	private String color;
	
	public Mueble(String tipoMueble, String color) {
		this.tipoMueble = tipoMueble;
		this.color = color;
	}

	
	public String getTipoMueble() {
		return tipoMueble;
	}

	public void setTipoMueble(String tipoMueble) {
		this.tipoMueble = tipoMueble;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Mueble [tipoMueble=" + tipoMueble + ", color=" + color + "]";
	}

}
