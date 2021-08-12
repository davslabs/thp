package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio_01 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Ingrese su nombre");
		String name = input.nextLine();
		
		System.out.println("Bienvenido "+ name);
		input.close();
	}

}
