package javaPackageFirst;

public class MueblePublic {
	public String material;
	public String color;
	public String descripcion;
	
	public void mostrarMueble() {
		System.out.println(descripcion + " color: " + color + " Material: " + material);
	}
}
