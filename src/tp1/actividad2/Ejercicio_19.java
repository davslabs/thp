package tp1.actividad2;

import java.util.Scanner;

public class Ejercicio_19 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num;
		boolean esDeUnSoloDigito, esImpar, estaEnAmbos, noEstaEnNinguno = false;
		
		System.out.println("Ingrese un numero");
		num = Integer.parseInt(input.nextLine());
		
		esDeUnSoloDigito = num >= 0 && num < 10;
		esImpar = num % 2 != 0;
		estaEnAmbos = esDeUnSoloDigito && esImpar;
		noEstaEnNinguno = !esDeUnSoloDigito && !esImpar;
		
		if(esImpar) {
			System.out.println("El numero es impar");
		}
		
		if(esDeUnSoloDigito) {
			System.out.println("Es de un solo digito");
		}
		
		if(estaEnAmbos) {
			System.out.println("El numero pertenece a ambos conjuntos");
		}
		
		if(noEstaEnNinguno) {
			System.out.println("El numero no pertenece a a ninguno de los conjuntos");
		}
		
		input.close();

	}

}
