package tp2.actividad3.ejercicio9;

import java.util.Scanner;

public class main {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int nroA, nroB = 0;
		int resultadoSuma, resultadoResta, resultadoDivision, resultadoMultiplicacion = 0;

		System.out.println("Ingrese valor para nroA");
		nroA = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese valor para nroB");
		nroB = Integer.parseInt(input.nextLine());
		
		resultadoSuma  = Calculadora.sumar(nroA, nroB);
		resultadoResta = Calculadora.restar(nroA, nroB);
		resultadoDivision = Calculadora.dividir(nroA, nroB);
		resultadoMultiplicacion = Calculadora.multiplicar(nroA, nroB);
		
		System.out.println("Suma: " + resultadoSuma);
		System.out.println("Resta: " + resultadoResta);
		System.out.println("Division: " + resultadoDivision);
		System.out.println("Multiplicacion: " + resultadoMultiplicacion);
	}

}
