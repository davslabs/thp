package tp2.actividad3.ejercicio14;

public class Acumulador {
	private int numero;

	public Acumulador() {
		this.setNumero(numero);
	}

	public int getNumero() {
		return numero;
	}

	private int setNumero(int numero) {
		return this.numero = numero;
	}
	
	public int incrementarValor(int numero) {
		this.setNumero(this.getNumero() + numero);
		return this.getNumero();
		
	}
	
	public int obtenerValor() {
		return this.getNumero();
	}

}
