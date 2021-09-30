package tp1.actividad2;

import java.util.Scanner;

public class Ejercicio_21 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		
		System.out.println("Ingrese un numero entre 1 y 7");
		num = Integer.parseInt(input.nextLine());
		
		switch(num) {
			case 1:
				System.out.println("DOMINGO");
				break;
			case 2:
				System.out.println("LUNES");
				break;
			case 3:
				System.out.println("MARTES");
				break;
			case 4:
				System.out.println("MIERCOLES");
				break;
			case 5:
				System.out.println("JUEVES");
				break;
			case 6:
				System.out.println("VIERNES");
				break;
			case 7:
				System.out.println("SABADO");
				break;
			default:
				System.out.println("Numero fuera de rango");
		}

		input.close();
	}

}
