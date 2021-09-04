package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_25 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int ancho, alto;
		
		System.out.println("Ingrese ancho");
		ancho = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese alto");
		alto = Integer.parseInt(input.nextLine());

		for(int i = 0; i < alto; i++) {
			System.out.println("\n");
			for(int j = 0; j < ancho; j++) {
				System.out.println("X");
			}
		}
		
		input.close();
	}

}
