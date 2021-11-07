package tp2.actividad2.ejercicio3;

public class Vehiculo {
	private static final int VELOCIDAD_MAXIMA = 180;
	private String marca;
	private String modelo;
	private Color color;
	private int velMaxima;
	public Vehiculo(String marca, String modelo, Color color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velMaxima = VELOCIDAD_MAXIMA;
	}
	
	public int getVelMaxima() {
		return velMaxima;
	}
	public void setVelMaxima(int velMaxima) {
		this.velMaxima = velMaxima;
	}
	public static int getVelocidadMaxima() {
		return VELOCIDAD_MAXIMA;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public Color getColor() {
		return color;
	}	
}
