package javaClasesGenericas;

import javaArrayList.Vehiculo;

public class ClaseMain {

	public static void main(String[] args) {
		System.out.println("----Primer Ejemplo-----");
		ClaseGenericaI<String> obj = new ClaseGenericaI<>("Maria");
		obj.mostrarObjeto();
		
		ClaseGenericaI<Integer> obj2 = new ClaseGenericaI<>(454);
		obj2.mostrarObjeto();
		
		Vehiculo vehiculo = new Vehiculo("Nissan", "Rojo", 4);
		ClaseGenericaI<Vehiculo> obj3 = new ClaseGenericaI<>(vehiculo);
		obj3.mostrarObjeto();
		
		System.out.println("----Segundo Ejemplo-----");
		ClaseGenericaII<String, Integer, Vehiculo> cg = new ClaseGenericaII<>("Juana", 78, vehiculo);
		cg.mostrarTipo();
		
		System.out.println("----Tercer Ejemplo-----");
		ClaseGenericaIII<String> obj4 = new ClaseGenericaIII<>();
		obj4.setVarGenerico("Materia: Matematica");
		System.out.println(obj4.getVarGenerico());
		
		Profesor profesor = new Profesor("Juana", 23);
		ClaseGenericaIII<Profesor> obj5 = new ClaseGenericaIII<>();
		obj5.setVarGenerico(profesor);
		System.out.println("Nombre del Profesor: "+ obj5.getVarGenerico().getNombre());
		System.out.println("Edad del profesor: "+obj5.getVarGenerico().getEdad());
		
	}

}
