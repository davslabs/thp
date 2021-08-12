package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio_10 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String name1, name2, name3;
		double totalCapital, capital1, capital2, capital3;
		
		System.out.println("Ingrese nombre 1: ");
		name1 = input.nextLine();
		System.out.println("Ingrese capital aportado: ");
		capital1 = Double.parseDouble(input.nextLine());

		System.out.println("Ingrese nombre 2: ");
		name2 = input.nextLine();
		System.out.println("Ingrese capital aportado: ");
		capital2 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese nombre 3: ");
		name3 = input.nextLine();
		System.out.println("Ingrese capital aportado: ");
		capital3 = Double.parseDouble(input.nextLine());
		
		totalCapital = capital1+capital2+capital3;
		
		System.out.println("El total aportado es de " + totalCapital);
		System.out.println("El porcentaje aportado por " + name1 + " es de " + ((capital1 * 100.00)/totalCapital));
		System.out.println("El porcentaje aportado por " + name2 + " es de " + ((capital2 * 100.00)/totalCapital));
		System.out.println("El porcentaje aportado por " + name3 + " es de " + ((capital3 * 100.00)/totalCapital));
		
		input.close();
	}

}
