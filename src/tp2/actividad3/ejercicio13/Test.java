package tp2.actividad3.ejercicio13;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	
			
	        Procesador procesador = new Procesador("INTEL", "tl2", 100);
	        
	        Dvd dvd = new Dvd("Philip", true, 120);
	        
	        Computadora computadora = new Computadora("HP", TIpo.Laptop,procesador , dvd);
	        
			Persona persona = new Persona("Sebastian", "Alfonso", 42755978, computadora);
			
			//el metodo mostrar comutadora lo remplace como el toString
			System.out.println(persona);
	        System.out.println(procesador.nivelDeTemperatura());
	        System.out.println(persona.grabar(dvd));
	        
	}

}
