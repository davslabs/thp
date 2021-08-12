package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio_03 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ingrese un numero");
		int num = Integer.parseInt(input.nextLine());
		
		int multNum = num * 5;
		double divNum = num / 2;
		
		System.out.println("El numero multiplicado es igual a " + multNum);
		System.out.println("El numero dividido es igual a " + divNum);
		input.close();
	}

}
