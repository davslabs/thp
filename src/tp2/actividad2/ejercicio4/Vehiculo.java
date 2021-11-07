package tp2.actividad2.ejercicio4;

public class Vehiculo {
	private static final int VELOCIDAD_MAXIMA = 180;
	private final String marca;
	private final String modelo;
	private final Color color;
	private int velMaxima;
	private boolean encendido;
	private int velocidadActual;

	public Vehiculo(final String marca, final String modelo, final Color color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velMaxima = VELOCIDAD_MAXIMA;
		this.encendido = false;
		this.velocidadActual = 0;
	}

	public int getVelMaxima() {
		return velMaxima;
	}
	public void setVelMaxima(final int velMaxima) {
		this.velMaxima = velMaxima;
	}
	public static int getVelocidadMaxima() {
		return VELOCIDAD_MAXIMA;
	}
	public int getVelocidadActual() {
		return velocidadActual;
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
	public boolean isEncendido() {
		return encendido;
	}
	public void encender() {
		if(!isEncendido()) {
			this.encendido = true;
			System.out.println("El vehiculo se ha encendido");
		}
	}
	public void apagar() {
		if(isEncendido()) {
			this.encendido = false;
			System.out.println("El vehiculo se ha apagado");
		}
	}
	public void acelerar(final int velocidad) {
		if(velocidad <= this.velMaxima) {
			this.velocidadActual = velocidad;
		}
	}
	public void frenar(final int velocidad) {
		if(velocidad > 0 && this.velocidadActual > 0) {
			if(velocidad >= this.velocidadActual) {
				this.velocidadActual = 0;
			}else {
				this.velocidadActual = this.velocidadActual - velocidad;
			}
		}
		
		if(this.velocidadActual == 0) {
			System.out.println("El vehiculo se ha frenado");
		}
	}
	public void girar(Direccion direccion, int anguloDeGiro) {
		if(anguloDeGiro <= 90 && anguloDeGiro >= 0) {
			String dir;
			if(direccion == Direccion.IZQUIERDA) {
				dir = "izquierda";
			} else {
				dir = "derecha";
			}
			System.out.println("Girando hacia la " + dir + " con un angulo de " + anguloDeGiro);
		}
	}
}
