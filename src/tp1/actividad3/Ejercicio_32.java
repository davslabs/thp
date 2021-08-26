package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_32 {

	public static Scanner input = new Scanner(System.in);
	public static final int NOTA_MAX = 10;
	public static final int NOTA_MIN = 4;
	
	public static void main(String[] args) {
		int nota;
		do {
			System.out.println("Ingrese una nota:");
			nota = Integer.parseInt(input.nextLine());
		} while(nota < NOTA_MIN && nota > NOTA_MAX && nota != 2);
		System.out.println("** NOTA INGRESADA CORRECTAMENTE");
		System.out.println("La nota es: " + nota);
		
		input.close();
	}

}
