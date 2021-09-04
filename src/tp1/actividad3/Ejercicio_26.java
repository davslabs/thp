package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_26 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		
		System.out.println("Ingrese un numero natural entero");
		num = Integer.parseInt(input.nextLine());
		
		for(int i = 0; i < num; i ++) {
			if((i * 3) % 5 != 0) {
				System.out.println(i*3);
			}
		}

		input.close();
	}

}
