package tp1.actividad2;

import java.util.Scanner;

public class Ejercicio_13 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1,num2,num3;
		int maxNum;
		
		System.out.println("Ingrese un numero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un numero");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un numero");
		num3 = Integer.parseInt(input.nextLine());
		
		if(num1 > num2 && num1 > num3) {
			maxNum = num1;
		} else if(num2 > num3) {
			maxNum = num2;
		} else {
			maxNum = num3;
		}
		
		System.out.println("El maximo valor ingresado fue: " + maxNum);
		
		input.close();
	}

}
