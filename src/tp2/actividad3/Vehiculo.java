package tp2.actividad3;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String color;
	private int velocidadMaxima;
	
	public Vehiculo() {}

	public Vehiculo(String marca, String modelo, String color, int velocidadMaxima) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidadMaxima = velocidadMaxima;
	}

	public String obtenerMarca() {
		return marca;
	}

	public void ponerMarca(String marca) {
		this.marca = marca;
	}

	public String obtenerModelo() {
		return modelo;
	}

	public void ponerModelo(String modelo) {
		this.modelo = modelo;
	}

	public String obtenerColor() {
		return color;
	}

	public void ponerColor(String color) {
		this.color = color;
	}

	public String obtenerVelocidadMaxima() {
		return velocidadMaxima + "Km/h";
	}

	public void ponerVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", velocidadMaxima="
				+ velocidadMaxima + "]";
	}
}
