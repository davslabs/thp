package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_34 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		double estatura;
		double acum = 0;
		int i = 0;

		do {
			System.out.println("Ingrese estatura");
			estatura = Double.parseDouble(input.nextLine());
			acum += estatura;
			i++;
		} while (estatura != 0);
		
		System.out.println("El promedio de estatura es de " + (double)(acum/i));
		
		input.close();
	}

}
