package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio_02 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ingrese nota 1");
		double grade1 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese nota 2");
		double grade2 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese nota 3");
		double grade3 = Double.parseDouble(input.nextLine());
		
		double average = (grade1+grade2+grade3) / 3;
		
		System.out.println("El promedio es "+ average);
		input.close();
	}
}
