package javaArrayList;

import java.util.ArrayList;

public class GarageVehiculo {
	private String nomGarage;
	private ArrayList<Vehiculo> vehiculo;
	
	public GarageVehiculo(String nomGarage) {
		this.nomGarage = nomGarage;
		this.vehiculo = new ArrayList<>();
	}
	
	public void setVehiculo(Vehiculo ve) {
		vehiculo.add(ve);
	}
	
	public void  mostrarVehiculos() {
		for(Vehiculo ve : vehiculo) {
			System.out.println(ve);
		}
	}

	@Override
	public String toString() {
		return "GarageVehiculo [Nombre de Garage=" + nomGarage + "]";
	}
	
	
}
