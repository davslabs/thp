package tp1.actividad2;

import java.util.Scanner;

public class Ejercicio_11 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		
		System.out.println("Ingrese un numero entero");
		n = Integer.parseInt(input.nextLine());
		
		if(n % 2 == 0) {
			System.out.println("El numero ingresado es par");
		} else {
			System.out.println("El numero ingresado es impar");
		}

		input.close();
	}

}
