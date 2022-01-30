package javaArrayList;

import java.util.ArrayList;

public class ClaseMain {

	public static void main(String[] args) {
		System.out.println("---------Primer ejemplo de ArrayList------");
		Vehiculo vehiculo1 = new Vehiculo("toyota", "rojo", 4);
		Vehiculo vehiculo2 = new Vehiculo("nissan", "rojo", 4);
		Vehiculo vehiculo3 = new Vehiculo("ford", "rojo", 4);
		
		ArrayList<Vehiculo> lista = new ArrayList<>();
		lista.add(vehiculo1);
		lista.add(vehiculo2);
		lista.add(vehiculo3);
		//lista.add(23);
		//lista.add("motor");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}	

		System.out.println("-----Segundo ejemplo ArrayList------");
		
		GarageVehiculo garage = new GarageVehiculo("Garage los angeles");
		garage.setVehiculo(vehiculo1);
		garage.setVehiculo(vehiculo2);
		garage.setVehiculo(vehiculo3);
		System.out.println(garage);
		garage.mostrarVehiculos();
		
		GarageVehiculo garage2 = new GarageVehiculo("Garage las flores");
		Vehiculo vehiculo4 = new Vehiculo("Novita", "rojo", 4);
		garage2.setVehiculo(vehiculo4);
		System.out.println(garage2);
		garage2.mostrarVehiculos();
		
		System.out.println("-----Tercer ejemplo ArrayList------");
		Mueble mueble = new Mueble("Mesa", "Cafe");
		Mueble mueble2 = new Mueble("Silla", "Cafe");
		Mueble mueble3 = new Mueble("Pupitre", "Cafe");
		
		ArrayList<Mueble> lista2 = new ArrayList<>();
		lista2.add(mueble);
		lista2.add(mueble2);
		lista2.add(mueble3);
		
		ClaseMain principal = new ClaseMain();
		principal.listar(lista2);
		
		
		ArrayList<Libro> lista3 = new ArrayList<>();
		Libro libro = new Libro("Deitel", "Programando en Java");
		lista3.add(libro);
		principal.listar(lista3);
		
	}
	
	private void listar(ArrayList<?> lista) {
		
		for (Object al : lista) {
			if (al instanceof Mueble) {
				System.out.println((Mueble)al);
			}else if(al instanceof Libro) {
				System.out.println((Libro)al);
			}
		}
		
	}

}
