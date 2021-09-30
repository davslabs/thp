package tp1.actividad2;

import java.util.Scanner;

public class Ejercicio_17 {
	
	public static Scanner input = new Scanner(System.in);
	public static final int MAX_EDAD = 120;
	public static final int MIN_EDAD = 1;
	public static final int EDAD_JUBILATORIA_HOMBRE = 65;
	public static final int EDAD_JUBILATORIA_MUJER = 60;
	
	public static void main(String[] args) {	
		int edad, edadJubilatoria;
		char genero;
		boolean edadValida, generoValido;
		
		System.out.println("Ingresar edad");
		edad = Integer.parseInt(input.nextLine());
		System.out.println("Ingresar genero");
		genero = input.nextLine().toUpperCase().charAt(0);
		
		edadValida = edad < 120 && edad > 1;
		generoValido = genero == 'F' || genero  == 'M';
		
		if(edadValida && generoValido) {
			edadJubilatoria = genero == 'M' ? 
					EDAD_JUBILATORIA_HOMBRE : 
					EDAD_JUBILATORIA_MUJER;
			if(edad > edadJubilatoria) {
				System.out.println("Se puede jubilar");
			} else {
				System.out.println("Fuera de la edad minima jubilatoria");
			}
		} else if(!edadValida) {
			System.out.println("Edad fuera de rango");
		} else {
			System.out.println("Genero invalido");
		}
		
		input.close();
	}

}
