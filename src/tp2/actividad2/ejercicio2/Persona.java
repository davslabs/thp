package tp2.actividad2.ejercicio2;

public class Persona {
	private String nombre;
	private String apellido;
	private String dni;
	private Computadora computadora;
	
	public Persona(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	public Persona(String nombre, String apellido, String dni, Computadora computadora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.computadora = computadora;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Computadora getComputadora() {
		return computadora;
	}

	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}

	public void trabajar() {
		
	}
	
	public void descansar() {
		
	}
}
