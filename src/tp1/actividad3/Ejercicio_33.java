package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_33 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		int max; 
		int min;
		
		num = max = min = 0;
	
		do {
			System.out.println("Ingrese un numero");
			num = Integer.parseInt(input.nextLine());
			
			if(max == 0 && min == 0) {
				max = num;
				min = num;
			}
			
			if(num > max) {
				max = num;
			} else if(num < min && num != 0) {
				min = num;
			}
			
		} while (num != 0);
		
		System.out.println("El numero maximo es: " + max);
		System.out.println("El numero minimo es: " + min);
		
		input.close();
	}
}
