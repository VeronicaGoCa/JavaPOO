package javaPackageFirst;

public class MuebleProtect {
	protected String material;
	protected String color;
	protected String descripcion;
	
	protected void mostrarMueble() {
		System.out.println(descripcion + " color: " + color + " Material: " + material);
	}
}
