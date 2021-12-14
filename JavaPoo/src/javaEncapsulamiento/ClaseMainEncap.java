package javaEncapsulamiento;

public class ClaseMainEncap {

	public static void main(String[] args) {
		/*
		 * Acceso a travez de los metodos get y set 
		 * */
		MuebleEncap mesa = new MuebleEncap();
		mesa.setColor("cafe");
		mesa.setMaterial("madera");
		mesa.setDescripcion("Mesa de cuatro patas");
		System.out.println(mesa.getColor());
		System.out.println(mesa.getMaterial());
		System.out.println(mesa.getDescripcion());
		
		/*
		 * Cosntructor
		 * */
		
		MuebleEncapConstr mesa1 = new MuebleEncapConstr("Carton prensado", "plomo", "Mesa de tres patas");
		System.out.println(mesa1.getDescripcion());
		System.out.println(mesa1.getColor());
		System.out.println(mesa1.getMaterial());

	}

}
