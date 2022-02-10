package javaClasesAbstractas;

public class ClaseMain {
	
	public static void main(String[] args) {
		
		System.out.println("-------Aplicando clases abstractas-----");
		
		VehiculoTerrestre automovilTerrestre = new VehiculoTerrestre("Toyota", "azul", "Minibus");
		automovilTerrestre.acelerar();
		
		VehiculoAereo automovilAereo = new VehiculoAereo("F-22 Raptor", "blanco", "Avion");
		automovilAereo.acelerar();
		
		System.out.println("----------------------------------------------");
		System.out.println("----->> Primer Ejemplo por principio de sustitucion-----");
		
		VehiculoPadre automovilTerrestre2 = new VehiculoTerrestre("Nissan", "blanco", "bus");
		automovilTerrestre.acelerar();
		
		VehiculoPadre automovilAereo2 = new VehiculoAereo("F-100 Raptor", "plomo", "Avion2");
		automovilAereo.acelerar();
		
		System.out.println("----------------------------------------------");
		System.out.println("----->> Segundo Ejemplo por principio de sustitucion-----");
		
		VehiculoPadre vehiculoPadre[] = new VehiculoPadre[2];
		//String array[] = new String[2];
		vehiculoPadre[0] =  automovilTerrestre2;
		vehiculoPadre[1] = automovilAereo2;
		
		for (VehiculoPadre vp : vehiculoPadre) {
			vp.acelerar();
		}
		
	}

}
