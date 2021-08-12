package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio_09 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		final double totalDegrees = 180.00;
		double degree1, degree2, degree3;
		
		System.out.println("Ingrese primer grado: ");
		degree1 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese segundo grado: ");
		degree2 = Double.parseDouble(input.nextLine());
		
		degree3 = totalDegrees - degree1 - degree2;
		
		System.out.println("El valor del angulo restante es : " + degree3);

		input.close();
	}

}
