package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_31_B {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		boolean opcionValida = false;
		
		while(!opcionValida) {
			System.out.println("Deseas continuar con la operacion?");
			char operacion = input.nextLine().charAt(0);
			opcionValida = operacion == 'S' || operacion == 's' || operacion == 'N' || operacion == 'n';
		}
		
		input.close();
	}

}
