package tp1.actividad2;

import java.util.Scanner;

public class Ejercicio_16 {

	public static Scanner input = new Scanner(System.in);   
	public static void main(String[] args) {
		int cantInscriptos, cantAsientos;
		
		System.out.println("Ingrese cantidad de inscriptos: ");
		cantInscriptos = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese cantidad de asientos: ");
		cantAsientos = Integer.parseInt(input.nextLine());
		
		if(cantInscriptos > cantAsientos) {
			System.out.println("No alcanzan los asientos. Se necesitan " + (cantInscriptos - cantAsientos) + " asientos.");
		} else {
			System.out.println("Los asientos alcanzan");
		}
		

		input.close();
	}

}
