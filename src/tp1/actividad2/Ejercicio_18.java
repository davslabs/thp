package tp1.actividad2;

import java.util.Scanner;

public class Ejercicio_18 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1,num2;
		boolean esDivisible = false;
		
		System.out.println("Ingrese un numero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un numero");
		num2 = Integer.parseInt(input.nextLine());
		
		if(num1>num2) {
			esDivisible = num1 % num2 == 0;
		} else {
			esDivisible = num2 % num1 == 0;
		}
		
		if(esDivisible && num1>num2) {
			System.out.println("El numero " + num1 + " es divisible por " + num2);	
		} else if(esDivisible && num2>=num1) {
			System.out.println("El numero " + num2 + " es divisible por " + num1);
		} else {
			if(num1>num2) {
				System.out.println("El numero " + num1 + " no es divisible por " + num2);
			} else {
				System.out.println("El numero " + num2 + " no es divisible por " + num1);
			}
		}
		
		input.close();
	}

}
