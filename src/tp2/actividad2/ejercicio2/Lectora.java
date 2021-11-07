package tp2.actividad2.ejercicio2;

public class Lectora {
	private String marca;
	private boolean puedeGrabar;
	
	public Lectora(String marca, boolean puedeGrabar) {
		this.marca = marca;
		this.puedeGrabar = puedeGrabar;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isPuedeGrabar() {
		return puedeGrabar;
	}
	public void setPuedeGrabar(boolean puedeGrabar) {
		this.puedeGrabar = puedeGrabar;
	}
}
