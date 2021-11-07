package tp2.actividad1.ejercicio1;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public String mostrarComoCadena() {
		return this.dia + "/" + this.mes + "/" + this.anio;
	}
	
	public int mostrarDiasTranscurridos(Fecha fecha) {
		return fecha.dia - this.dia;
	}
}
