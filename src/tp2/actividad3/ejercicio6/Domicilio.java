package tp2.actividad3.ejercicio6;

public class Domicilio {
	private String calle;
	private String altura;
	private String barrio;
	
	public Domicilio(String calle, String altura, String barrio) {
		this.calle = calle;
		this.altura = altura;
		this.barrio = barrio;
	}

	public String getCalle() {
		return calle;
	}

	public String getAltura() {
		return altura;
	}

	public String getBarrio() {
		return barrio;
	}
}
