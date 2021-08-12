package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio_08 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		double n1, n2;
		
		System.out.println("Ingrese el primer numero: ");
		n1 = Double.parseDouble(input.nextLine());
		System.out.println("Ingrese el segundo numero: ");
		n2 = Double.parseDouble(input.nextLine());
		
		System.out.println("La suma de ambos numeros es: " + (n1+n2));
		
		System.out.println("La resta de ambos numeros es: " + (n1-n2));

		System.out.println("El producto de ambos numeros es: "+ (n1*n2));

		System.out.println("La division de ambos numeros es: "+ (n1/n2));

		input.close();
	}

}
