package tp1.actividad2;

import java.util.Scanner;

public class Ejercicio_12 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1;
		int num2;
		
		System.out.println("Ingrese un numero entero:");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un numero entero:");
		num2 = Integer.parseInt(input.nextLine());
		
		if(num1>num2) {
			System.out.println("El mayor es: " + num1);
		} else if (num2>num1) { 
			System.out.println("El mayor es: " + num2);
		} else {
			System.out.println("Los numeros son iguales");
		}
		
		input.close();
	}

}
