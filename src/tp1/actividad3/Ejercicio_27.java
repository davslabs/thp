package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_27 {

	public static Scanner input = new Scanner(System.in);
	public final static int MAX_EDADES = 5;
	public static void main(String[] args) {
		int num, i;
		int acum = 0;
		
		for(i = 0; i < MAX_EDADES; i++) {
			System.out.println("Ingrese una edad");
			num = Integer.parseInt(input.nextLine());
			acum += num;
		}
		
		System.out.println("El promedio fue de " + (double)(acum/i));
		
		input.close();
	}

}
