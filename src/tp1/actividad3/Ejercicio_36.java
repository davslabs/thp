package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_36 {

	public static Scanner input = new Scanner(System.in);
	public static final int CORTE = 20;
	public static void main(String[] args) {
		int num;
		int contador;
		int prom;
		int acu;
		
		num = acu = prom = contador = 0;
		
		do {
			System.out.println("Ingrese un numero: ");
			num = Integer.parseInt(input.nextLine());
			contador++;
			acu += num;
			prom = acu / contador;
		} while(prom < CORTE);
		
		System.out.println("Se leyeron " + contador + " numeros.");
		
		input.close();
	}

}
