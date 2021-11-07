package tp2.actividad2.ejercicio3;

public class Persona {
	private String nombre;
	private String apellido;
	private Boolean sabeConducir;
	private Vehiculo vehiculo;
	
	public Persona(String nombre, String apellido, Boolean sabeConducir) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sabeConducir = sabeConducir;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Boolean getSabeConducir() {
		return sabeConducir;
	}

	public void setSabeConducir(Boolean sabeConducir) {
		this.sabeConducir = sabeConducir;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}	
}
