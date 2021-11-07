package tp2.actividad3.ejercicio10;

public class Fraccion {
	private int numerador;
	private int denominador;
	
	public Fraccion() {
		
	}
	
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public double valorReal() {
		double valorReal = 0;
		
		if(this.denominador != 0) {
			valorReal = (double)(this.numerador)/this.denominador;
		}
		
		return valorReal;
	}

	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
	}	
}
