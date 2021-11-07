package tp2.actividad3.ejercicio14;

public class Contador {
	private int numero;

	public Contador() {
		this.setNumero(numero);
	}

	public int getNumero() {
		return numero;
	}

	private int setNumero(int numero) {
		return this.numero = numero;
	}
	
	public int incrementarValor() {
		this.setNumero(numero+1);
		return this.getNumero();
	}
	
	public int obtenerValor() {
		return this.getNumero();
		}

	@Override
	public String toString() {
		return "Contador [numero=" + numero + "]";
	}

}
