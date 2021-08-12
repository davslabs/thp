package tp1.actividad2;

import java.util.Scanner;

public class Ejercicio_14 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		final int EDAD_REQUERIDA = 7;
		final double ALTURA_REQUERIDA = 1.50;
		
		int edad;
		double altura;
		
		System.out.println("Ingrese su edad: ");
		edad = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese su altura: ");
		altura = Double.parseDouble(input.nextLine());
		
		if (edad >= EDAD_REQUERIDA && altura > ALTURA_REQUERIDA) {
		   System.out.println("Podes entrar a la montaña");
		}
		else {
		   System.out.println("No podes entrar a la montaña");
		}
		
		input.close();
	}
}
