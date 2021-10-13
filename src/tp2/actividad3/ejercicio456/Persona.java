package tp2.actividad3.ejercicio456;

public class Persona {
	private String nombre;
	private String apellido;
	private Vehiculo vehiculo;
	private boolean sabeConducir;
	
	public Persona() {
		this.nombre = "";
		this.apellido = "";
		this.vehiculo = new Vehiculo();
		this.sabeConducir = false;
	}
	
	public Persona(String nombre, String apellido, Vehiculo vehiculo, boolean sabeConducir) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.vehiculo = vehiculo;
		this.sabeConducir = sabeConducir;
	}
	
	public void ponerNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void ponerApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String obtenerNombreCompleto() {
		return nombre + " " + apellido;
	}

	public Vehiculo ponerVehiculo() {
		return vehiculo;
	}

	public void obtenerVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public void ponerSabeConducir(boolean sabeConducir) {
		this.sabeConducir = sabeConducir;
	}
	
	public String obtenerSabeConducir() {
		String mensaje = "";
		if(sabeConducir) {
			mensaje = "Sabe conducir";
		} else {
			mensaje = "No sabe conducir";
		}
		
		return mensaje;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", vehiculo=" + vehiculo + ", sabeConducir="
				+ sabeConducir + "]";
	}
}
