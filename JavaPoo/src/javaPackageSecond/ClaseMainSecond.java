package javaPackageSecond;

import javaPackageFirst.MuebleDefault;
import javaPackageFirst.MueblePrivate;
import javaPackageFirst.MuebleProtect;
import javaPackageFirst.MueblePublic;

public class ClaseMainSecond {

	public static void main(String[] args) {
		/*
		 * Modificador de acceso default
		 * */
		MuebleDefault silla = new MuebleDefault();
		//silla.
		
		/*
		 * Modificador de acceso public
		 * */
		
		MueblePublic silla2 = new MueblePublic();
		silla2.color = "azul";
		silla2.material = "madera";
		silla2.descripcion = "silla de cuadro patas";
		silla2.mostrarMueble();
		
		/*
		 * Modificador de acceso private
		 * */
		MueblePrivate silla3 = new MueblePrivate();
		//silla3.

		/*
		 * Modificador de acceso protected
		 * */
		
		MuebleProtect silla4 = new MuebleProtect();
		//silla4.
	}

}
