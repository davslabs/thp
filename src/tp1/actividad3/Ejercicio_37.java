package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_37 {

	public static Scanner input = new Scanner(System.in);
	public static int MAX_VALORES = 12;
	public static void main(String[] args) {
		double sueldo;
		double sueldoPercibido = 0;
		int contador = 0;
		
		do {
			System.out.println("Ingrese sueldo mensual percibido: ");
			sueldo = Double.parseDouble(input.nextLine());
			
			if(sueldo >= 0) {
				sueldoPercibido = sueldoPercibido + sueldo;
				//sueldoPercibido += sueldo; (es lo mismo)
			}
			
			contador++;
		} while(
			(sueldo >= 0) &&
			(contador < MAX_VALORES));

		System.out.println("El sueldo percibido anual por el empleado fue de : $" + sueldoPercibido);
		
		input.close();
	}

}
