package tp2.actividad3.ejercicio14;

public class Promedio {
	private int numero;
	private Contador i;
	private Acumulador acum;

	public Promedio(Contador i,Acumulador acum) {
		this.setNumero(numero);
		this.setI(i);
		this.setAcum(acum);  
	}

	
	public int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		this.numero = numero;
	}

	public Contador getI() {
		return i;
	}

	private void setI(Contador i) {
		this.i = i;
	}

	public Acumulador getAcum() {
		return acum;
	}

	private void setAcum(Acumulador j) {
		this.acum = j;
	}

	private int incrementarContador(Contador i) {
		return i.incrementarValor();
		 
	}
	
	
	private int incrementarAcumulador(Acumulador acum) {
		return acum.incrementarValor(numero);
		
	}
	
	public void incrementar(Acumulador acum) {
		this.incrementarAcumulador(acum);
		this.incrementarContador(i);
		
	}
	
	public double promedio() {
		return  acum.getNumero() / i.getNumero();
	}
	
	public double obtenerValor() {
		return this.promedio();
	}

}
