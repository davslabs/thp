package tp2.actividad3.ejercicio13;


public class Persona {
	private String nombre;
	private String apellido;
	private int dni;
	private Computadora computadora;
	
	
	public Persona(String nombre, String apellido, int dni, Computadora computadora) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.computadora = computadora;
	}
	
	public DvdRespuesta grabar(Dvd respuesta) {
		DvdRespuesta resultado = DvdRespuesta.SIN_DVD; 
		
		if(respuesta.graba() == false) {
			resultado = DvdRespuesta.UNIDAD_SIN_GRABADO;
		}else {
			resultado = DvdRespuesta.GRABACION_OK;
		}
		
		return resultado;
	}
	
	


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", computadora=" + computadora
				+ "]";
	}

}
