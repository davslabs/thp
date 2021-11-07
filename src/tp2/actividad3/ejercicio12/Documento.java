package tp2.actividad3.ejercicio12;

public class Documento {
	
	private Fecha fecha;
	private String titulo;
	private String texto;
	
	
	public Documento(Fecha fecha, String titulo, String texto) {
		
		setFecha(fecha);
		setTitulo(titulo);
		setTexto(texto);
	}


	public Fecha getFecha() {
		return fecha;
	}


	private void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}


	public String getTitulo() {
		return titulo;
	}


	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getTexto() {
		return texto;
	}


	private void setTexto(String texto) {
		this.texto = texto;
	}


	@Override
	public String toString() {
		return "Documento [fecha=" + fecha + ", titulo=" + titulo + ", texto=" + texto + "]";
	}
	
	
	
}
