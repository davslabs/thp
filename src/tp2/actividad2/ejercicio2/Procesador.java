package tp2.actividad2.ejercicio2;

public class Procesador {
	private String marca;
	private String modelo;
	private int temperaturaActual;
	private int temperaturaMax;
	private static int TEMPERATURA_MAXIMA = 100;
	
	
	public Procesador() {
		this.temperaturaMax = TEMPERATURA_MAXIMA;
	}
	
	public Procesador(String marca, String modelo, int temperaturaActual, int temperaturaMax) {
		this.marca = marca;
		this.modelo = modelo;
		this.temperaturaActual = temperaturaActual;
		this.temperaturaMax = temperaturaMax;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getTemperaturaActual() {
		return temperaturaActual;
	}
	public void setTemperaturaActual(int temperaturaActual) {
		this.temperaturaActual = temperaturaActual;
	}
	
	public boolean alcanzoTemperaturaCritica() {
		return temperaturaActual >= temperaturaMax;
	}
}
