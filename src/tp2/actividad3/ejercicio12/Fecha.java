package tp2.actividad3.ejercicio12;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;
	
	
	public Fecha(int dia, int mes, int anio) {
		
		setDia(dia);
		setMes(mes);
		setAnio(anio);
	}


	public int getDia() {
		return dia;
	}


	private void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	private void setMes(int mes) {
		this.mes = mes;
	}


	public int getAnio() {
		return anio;
	}


	private void setAnio(int anio) {
		this.anio = anio;
	}


	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	
	

}
