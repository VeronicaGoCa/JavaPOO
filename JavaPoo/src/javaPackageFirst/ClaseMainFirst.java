package javaPackageFirst;

public class ClaseMainFirst {

	public static void main(String[] args) {
		/*
		 * Modificador de acceso Default
		 * */
		MuebleDefault mesa = new MuebleDefault();
		mesa.color = "cafe";
		mesa.material = "madera";
		mesa.descripcion = "Mesa de cuatro patas";
		mesa.mostrarMueble();
		
		/*
		 * Modificador de acceso public
		 * */
		
		MueblePublic mesa2 = new MueblePublic();
		mesa2.color="Plomo";
		mesa2.material = "Venesta";
		mesa2.descripcion = "Mesa de tres patas";
		mesa2.mostrarMueble();
		
		/*
		 * Modificador de acceso private
		 * */
		
		MueblePrivate mesa3 = new MueblePrivate();
		//mesa3.color="roja";
		
		/*
		 * Modificador de acceso protected
		 * */
		
		MuebleProtect mesa4 = new MuebleProtect();
		mesa4.color="negro";
		mesa4.material = "carton";
		mesa4.descripcion = "Mesa circular de dos patas";
		mesa4.mostrarMueble();

	}

}
