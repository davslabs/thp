package tp2.actividad3.ejercicio6;

import java.util.Date;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private Domicilio domicilio;
	
	public Persona(String nombre, String dni, String apellido, Date fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public Domicilio getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
}
