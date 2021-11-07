package tp2.actividad2.ejercicio4;

import java.util.Scanner;

public class Test {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int velocidad = 0;
		Vehiculo vehiculo = new Vehiculo("GIAT", "HALIO", Color.GRIS_OSCURO);
		Persona persona = new Persona("Fulano", "Gomez", true);
		persona.setVehiculo(vehiculo);
		
		if(!vehiculo.isEncendido()) {
			System.out.println("El vehiculo se encuentra apagado");
			System.out.println("Encendiendo vehiculo...");
			vehiculo.encender();
		}

		System.out.println("Acelarando vehiculo...");
		
		do {
			System.out.println("Apriete el pedal para acelerar");
			velocidad = Integer.parseInt(input.nextLine());
			vehiculo.acelerar(velocidad);
			if(vehiculo.getVelocidadActual() < 0) {
				System.out.println("La velocidad ingresada debe ser menor a la velocidad maxima tolerada por el vehiculo y mayor a 0");
			}
		} while(vehiculo.getVelocidadActual() < 0);
		
		System.out.println("Vehiculo en marcha, a una velocidad de " + vehiculo.getVelocidadActual());
		System.out.println("Girando el vehiculo...");
		vehiculo.girar(Direccion.DERECHA, 45);
		System.out.println("Frenando el vehiculo...");
	
		do {
			vehiculo.frenar(10);	
		} while(vehiculo.getVelocidadActual() > 0);
		
		vehiculo.apagar();
		
		input.close();
	}

}
