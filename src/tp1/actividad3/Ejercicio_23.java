package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_23 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
	
		System.out.println("Ingrese un número entero");
		num = Integer.parseInt(input.nextLine());
	
		for (int i = 1; i <=10 ; i++) {
			System.out.println(num*i);
		}

		input.close();
	}
}