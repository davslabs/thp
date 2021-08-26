package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_24 {

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num1;
		int num2;
		
		System.out.println("Ingrese el primer número entero");
		num1 = Integer.parseInt(input.nextLine());
		
		do {
		System.out.println("Ingrese el segundo número entero menor o igual al primero");
		num2 = Integer.parseInt(input.nextLine());}
		while
			(num2 > num1);
		
		for (int i = num1;  i>= num2; i--) {
			System.out.println(i);
		}
		
		for (int i = num1 -1;  (i> num2); i--) {
			System.out.println(i);
		}
		
		input.close();
	}
}