package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio_05 {
	
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1, num2, aux;
		
		System.out.println("Ingrese num1: ");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese num2: ");
		num2 = Integer.parseInt(input.nextLine());
		
		aux = num1;
		num1 = num2;
		num2 = aux;
		
		System.out.println("Los numeros cambiados: " + num1 + " y " + num2);
		input.close();
	}

}
