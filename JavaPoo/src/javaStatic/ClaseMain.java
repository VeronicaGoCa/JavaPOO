package javaStatic;

public class ClaseMain {

	public static void main(String[] args) {
		System.out.println("------Primer ejemplo static--------");
		
		System.out.println(AreaCirculo.pi);
		System.out.println(AreaCirculo.calcularArea(2.5));
		
		System.out.println("------Ejemplo de toString--------");
		
		Vehiculo vehiculo = new Vehiculo("Nissan", "2000", 35000);
		System.out.println(vehiculo);
		
		System.out.println("------Segundo ejemplo static--------");
		Vehiculo.setPorcentajeImportacion(0.12);
		
		Vehiculo vehiculo2 = new Vehiculo("Toyota", "1999", 30000);
		System.out.println(vehiculo2);
		System.out.println("Precio total: " + vehiculo2.precioTotal());
		
		Vehiculo vehiculo3 = new Vehiculo("Ford", "2020", 50000);
		System.out.println(vehiculo3);
		//vehiculo3.setPorcentajeImportacion(0.12);
		System.out.println("Precio total: " + vehiculo3.precioTotal());
	}

}
