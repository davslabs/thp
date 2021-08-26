package tp1.actividad3;

import java.util.Scanner;

public class Ejercicio_38 {

	public static Scanner input = new Scanner(System.in);
	public static final String USUARIO = "admin";
	public static final String PASSWORD = "123456";
	public static final int MAX_CANT_INTENTOS = 3;
	
	public static void main(String[] args) {
		String username;
		String pass;
		int contador = 0;
		boolean credencialesValidas = false;
		
		do {
			System.out.println("Ingrese usuario: ");
			username = input.nextLine();
			System.out.println("Ingrese password: ");
			pass = input.nextLine();
			
			credencialesValidas = (username.equals(USUARIO) && pass.equals(PASSWORD));
			
			if(!credencialesValidas) {
				System.out.println("Usuario y contraseña invalidos.");
			}
			
			contador++;
		} while(
			(contador < MAX_CANT_INTENTOS) &&
			!credencialesValidas);
		
		if(credencialesValidas) {
			System.out.println("Acceso Concedido");
		} else {
			System.out.println("Se ha bloqueado la cuenta");
		}
		
		input.close();
	}
}
