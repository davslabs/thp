package tp2.actividad3.ejercicio6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		Domicilio domicilio = new Domicilio("Yatay", "240", "Almagro");
		CuentaBancaria cuenta1 = generarCuentaPersona("Fulano", "Gomez", "12345678", "15/11/1989", domicilio, TipoCuenta.CAJA_AHORRO);
		CuentaBancaria cuenta2 = generarCuentaPersona("Mengana", "Torres", "90129356", "09/09/1994", domicilio, TipoCuenta.CUENTA_CORRIENTE);
		
		cuenta1.depositar(1000);
		System.out.println("Saldo depositado cuenta1: " + cuenta1.getSaldo());
		cuenta2.depositar(500);
		System.out.println("Saldo depositado cuenta2: " + cuenta2.getSaldo());
		
		if(cuenta1.extraer(1500)) {
			System.out.println("Pudo extraer");
		} else {
			System.out.println("Intentando extraer nuevamente");
			boolean pudoExtraer = cuenta1.extraer(500);
			if(pudoExtraer) {
				System.out.println("Pudo extraer");
			} else {
				System.out.println("No pudo extraer");
			}
		}
		
	}
	
	private static Date obtenerFechaNacimiento(String fecha) throws ParseException {
		return new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
	}
	
	private static CuentaBancaria generarCuentaPersona(String nombre, String apellido, String dni, String fechaNacimiento, Domicilio domicilio, TipoCuenta tipoCuenta) throws ParseException {
		Persona persona = new Persona(nombre, apellido, dni, obtenerFechaNacimiento(fechaNacimiento));
		persona.setDomicilio(domicilio);
		
		return new CuentaBancaria(tipoCuenta, persona);
	}
}
