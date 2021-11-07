package tp2.actividad3.ejercicio13;

public class Computadora {
	
	private String marca;
	private TIpo tipo;
	private Procesador procesador;
	private Dvd dvd;
	
	
	public Computadora(String marca, TIpo tipo, Procesador procesador, Dvd dvd) {

		this.marca = marca;
		this.tipo = tipo;
		this.procesador = procesador;
		this.dvd = dvd;
	}

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", tipo=" + tipo + ", procesador=" + procesador + ", dvd=" + dvd + "]";
	}
	
	
	


}
