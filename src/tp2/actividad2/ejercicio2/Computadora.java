package tp2.actividad2.ejercicio2;

public class Computadora {
	private boolean estado;
	private String marca;
	private TipoComputadora tipo;
	private Procesador procesador;
	private Lectora lectora;
	
	public Computadora(String marca, TipoComputadora tipo, Procesador procesador) {
		this.marca = marca;
		this.tipo = tipo;
		this.procesador = procesador;
		this.estado = false;
	}

	public Computadora(String marca, TipoComputadora tipo, Procesador procesador, Lectora lectora) {
		this.marca = marca;
		this.tipo = tipo;
		this.procesador = procesador;
		this.lectora = lectora;
		this.estado = false;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public TipoComputadora getTipo() {
		return tipo;
	}
	public void setTipo(TipoComputadora tipo) {
		this.tipo = tipo;
	}
	public Procesador getProcesador() {
		return procesador;
	}
	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}
	public Lectora getLectora() {
		return lectora;
	}
	public void setLectora(Lectora lectora) {
		this.lectora = lectora;
	}
	
	public void prender() {
		this.estado = true;
	}
	
	public void apagar() {
		if (this.estado) {
			this.estado = false;
		}
	}
	
	public void reiniciar() {
		this.apagar();
		this.prender();
	}
}
