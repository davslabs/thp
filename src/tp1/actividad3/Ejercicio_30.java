package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_30 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1;
		int num2;
		char operacion;
		
		do {
			System.out.println("Ingrese un caracter para la operacion: [+,-,*,/,'F' para salir]");
			operacion = input.nextLine().toUpperCase().charAt(0);
		} while(
			operacion != '+' &&
			operacion != '-' &&
			operacion != '*' &&
			operacion != '/' &&
			operacion != 'F');
		
		while(operacion != 'F') {
			System.out.println("Ingrese numero 1: ");
			num1 = Integer.parseInt(input.nextLine());
			
			System.out.println("Ingrese numero 2: ");
			num2 = Integer.parseInt(input.nextLine());
			
			switch(operacion) {
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
			
			do {
				System.out.println("Ingrese un caracter para la operacion: [+,-,*,/,'F' para salir]");
				operacion = input.nextLine().toUpperCase().charAt(0);
			} while(
				operacion != '+' &&
				operacion != '-' &&
				operacion != '*' &&
				operacion != '/' &&
				operacion != 'F');	
		}

		input.close();
	}

}
