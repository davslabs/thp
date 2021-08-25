package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_31_A {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		char operacion;
		boolean opcionValida = false;
		
		do {
			System.out.println("Deseas continuar con la operacion?");
			operacion = input.nextLine().charAt(0);
			opcionValida = operacion == 'S' || operacion == 's' || operacion == 'N' || operacion == 'n';
		} while(!opcionValida);
		
		input.close();
	}
}
