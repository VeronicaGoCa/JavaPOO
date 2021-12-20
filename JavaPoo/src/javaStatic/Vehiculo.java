package javaStatic;

public class Vehiculo {
	private String marca;
	private String modelo;
	private double precioInicial;
	private static double porcentajeImportacion;
	
	public Vehiculo(String marca, String modelo, double precioInicial) {
		this.marca = marca;
		this.modelo = modelo;
		this.precioInicial = precioInicial;
	}
	
	public static void setPorcentajeImportacion(double porcetajeImportacion) {
		Vehiculo.porcentajeImportacion = porcetajeImportacion;	
		
	}
	
	public double precioTotal() {
		
		return precioInicial + (precioInicial * porcentajeImportacion);
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", precioInicial=" + precioInicial + "]";
	}
	
	
	
}
