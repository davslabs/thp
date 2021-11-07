package tp2.actividad3.ejercicio13;

public class Procesador {
	private String marca;
	private String modelo;
	private int nivelActualTem;
	
	
	public Procesador(String marca, String modelo, int nivelActualTem) {

		this.marca = marca;
		this.modelo = modelo;
		this.nivelActualTem = nivelActualTem;
	}
	

	public boolean nivelDeTemperatura() {
		boolean critico = false;
		
		//Si el nivel de temperatura es mayor a 100 es nivel critico
		if(nivelActualTem > 100) {
			System.out.println("Nivel critico del procesador?");
			critico = true;
		}else {
			System.out.println("Nivel critico del procesador?");
		}
		return critico;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", nivelActualTem=" + nivelActualTem + "]";
	}
	

}
