package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_35 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String nombre;
		String personaMasJoven = "";
		int edad;
		int minEdad = Integer.MAX_VALUE;
		
		do {
			System.out.println("Ingrese nombre");
			nombre = input.nextLine();
			
			if(nombre.charAt(0) != '*') {
				System.out.println("Ingrese edad");
				edad = Integer.parseInt(input.nextLine());
				
				if(edad < minEdad) {
					minEdad = edad;
					personaMasJoven = nombre;
				}
			}

		} while(nombre.charAt(0) != '*');
		
		if(personaMasJoven != "") {
			System.out.println("La persona mas joven ingresada fue: " + personaMasJoven);
		} else {
			System.out.println("No se ingresaron datos");
		}
		
		input.close();
	}

}
