package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_28 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int cant = 0;
		int max = 0;
		int pos = 0;
		int num;
		
		System.out.println("Ingrese cant");
		cant = Integer.parseInt(input.nextLine());
		
		for(int i = 0; i < cant; i++) {
			System.out.println("Ingrese un numero");
			num = Integer.parseInt(input.nextLine());
			
			if(num > max) {
				pos = i;
				max = num;
			}
		}
		
		System.out.println("El mayor numero ingresado fue: " + max + " en la posicion: " + pos);
		
		input.close();
	}

}
