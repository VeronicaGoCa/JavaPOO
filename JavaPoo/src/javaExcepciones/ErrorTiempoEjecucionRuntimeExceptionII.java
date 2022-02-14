package javaExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorTiempoEjecucionRuntimeExceptionII {
	
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	/*try {
		dividir();
	}catch (Exception e) {
		System.out.println("Ocurrio Un Error");
	}*/
		
		try {
			dividir();
		}catch (ArithmeticException e) {
			System.out.println("No se permite division por cero");
		}catch (InputMismatchException e) {
			System.out.println("Debes ingresar un numero");
		}finally {
			entrada.close();
			System.out.println("Finalizando");
		}

	}

	private static void dividir() {
		System.out.println("Ingrese el primer numero");
		int num1 = entrada.nextInt();
		System.out.println("Ingrese el segundo numero");
		int num2 = entrada.nextInt();
		System.out.println("El resultado de la division es: " + num1/num2);
		
	}

}
