package tp2.actividad1.ejercicio1;

public class TelefonoMovil {
	private int marca;
	private boolean encendido;
	
	public TelefonoMovil(int marca, boolean encendido) {
		this.marca = marca;
		this.encendido = encendido;
	}
	public int getMarca() {
		return marca;
	}
	public void setMarca(int marca) {
		this.marca = marca;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
}
