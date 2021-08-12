package tp1.actividad2;

import java.util.Scanner;

public class Ejercicio_20 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1;
		int num2;
		char operation;
		
		System.out.println("Ingrese numero 1: ");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese numero 2: ");
		num2 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese la operacion");
		operation = input.next().charAt(0);
		
		switch(operation) {
			case '+':
				System.out.println("El resultado de la operacion es " + (num1+num2));
				break;
			case '-':
				System.out.println("El resultado de la operacion es " + (num1-num2));
				break;
			case '*':
				System.out.println("El resultado de la operacion es " + (num1*num2));
				break;
			case '/':
				if(num2 == 0) {
					System.out.println("ERROR");
				} else {
					System.out.println("El resultado de la operacion es " + ((double)num1/(double)num2)); 
				}
				break;
			default:
				System.out.println("Operacion invalida");
				break;
		}
		
				
		input.close();
	}

}
