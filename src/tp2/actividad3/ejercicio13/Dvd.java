package tp2.actividad3.ejercicio13;

public class Dvd {
	
	private String marca;
	private boolean graba = false;
	private int capacidad;
	
	
	public Dvd(String marca, boolean graba, int capacidad) {
		
		this.setMarca(marca);
		this.graba = graba;
		this.setCapacidad(capacidad);
	}
	
	
	
	public String getMarca() {
		return marca;
	}



	private void setMarca(String marca) {
		this.marca = marca;
	}



	public int getCapacidad() {
		return capacidad;
	}



	private void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}



	public boolean graba() {
		return graba == true;
	}



	@Override
	public String toString() {
		return "Dvd [marca=" + marca + ", graba=" + graba + ", capacidad=" + capacidad + "]";
	}

	
	

}
