package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio_06 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		final double salary = 44000.00;
		double totalAmount;
		double totalGain;
		
		System.out.println("Ingrese el monto total de las ventas: ");
		totalAmount = Double.parseDouble(input.nextLine());
		
		totalGain = (totalAmount * 0.16) + salary;
		
		System.out.println("Importe total a cobrar: " + totalGain);
		
		input.close();
	}

}
