package javaPackageFirst;

public class MueblePrivate {
	private String material;
	private String color;
	private String descripcion;
	
	private void mostrarMueble() {
		System.out.println(descripcion + " color: " + color + " Material: " + material);
	}
}
