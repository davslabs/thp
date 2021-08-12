package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio_04 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Ingrese valor por hora de trabajo");
		double salaryPerHour = Double.parseDouble(input.nextLine());

		System.out.println("Ingrese cantidad de horas de trabajo");
		int workingHours =  Integer.parseInt(input.nextLine());
		
		int workedHoursPerLaborer = (workingHours * 5) + (workingHours / 2);
		double salary = salaryPerHour * workedHoursPerLaborer;
		
		System.out.println("El salario semanal es de " + salary);
		input.close();
	}

}
