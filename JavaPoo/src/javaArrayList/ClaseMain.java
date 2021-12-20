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

	}

}
