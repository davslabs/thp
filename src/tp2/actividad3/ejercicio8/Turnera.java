package tp2.actividad3.ejercicio8;

public class Turnera {
	
	private int turno = 0;

	
	public int otorgarProximoNumero() {
		turno++;
		return turno;
	}
	
	public void verUltimoNumeroOtorgado() {
		System.out.println("El ultimo turno otorgado es: " +this.turno);
	}
	
	public int resetearContador() {
		
		this.turno = 0;
		System.out.println("Reseteo del contador:");
		return this.turno;
	}
	
	public int resetearContador(int valor) {
		
		if(valor >= 0) {
			this.turno = valor;
			System.out.println("Reseteo del contador, nuevo valor: " + this.turno); 
		}
		
		return this.turno;
	}
	
	

}
