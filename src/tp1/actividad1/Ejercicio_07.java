package tp1.actividad1;

import java.util.Scanner;

public class Ejercicio_07 {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		double terrainWidth, terrainHeight, valuePerSquareMeter, terrainTotalValue, 
		totalFence;
		
		System.out.println("Ingrese valor del ancho del terreno");
		terrainWidth = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese valor del largo del terreno");
		terrainHeight = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese valor del metro cuadrado");
		valuePerSquareMeter = Double.parseDouble(input.nextLine());
		
		terrainTotalValue = (terrainWidth * terrainHeight) * valuePerSquareMeter;
		totalFence = terrainWidth + terrainHeight;
		
		System.out.println("Valor por metro cuadrado: " + terrainTotalValue);
		System.out.println("Cantidad de alambre: " + totalFence);
		
		input.close();
	}

}
