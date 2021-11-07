package tp2.actividad3.ejercicio11;

public class Superheroe {
	
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	
	public Superheroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		
		setNombre(nombre);
		setFuerza(fuerza);
		setResistencia(resistencia);
		setSuperpoderes(superpoderes);
	}
	
	public RESULTADO competir(Superheroe heroe1, Superheroe heroe2) {
		RESULTADO resultado = null;
		int puntosHeroe1 = 0;
		int puntosHeroe2 = 0;
		
		
		if(heroe1.getFuerza() < heroe2.getFuerza()) {
			puntosHeroe2++;
		}else if(heroe1.getFuerza() > heroe2.getFuerza()) {
			puntosHeroe1++;
		}else {
			
		}
		
		if(heroe1.getResistencia() < heroe2.getResistencia()) {
			puntosHeroe2++;
		}else if(heroe1.getResistencia() > heroe2.getResistencia()) {
			puntosHeroe1++;
		}else {
			
		}
		
		if(heroe1.getSuperpoderes() < heroe2.getSuperpoderes()) {
			puntosHeroe2++;
		}else if(heroe1.getSuperpoderes() > heroe2.getSuperpoderes()) {
			puntosHeroe1++;
		}else {
			
		}
		
		if(puntosHeroe1 >= 2 && puntosHeroe1 > puntosHeroe2) {
			System.out.println(heroe1);
			resultado = RESULTADO.TRIUNFO;
		}else if(puntosHeroe1 < puntosHeroe2 && puntosHeroe2 >= 2) {
			System.out.println(heroe1);
			resultado = RESULTADO.DERROTA;
		}else if(puntosHeroe1 == 1 && puntosHeroe2 == 2 || puntosHeroe2 == 3 || puntosHeroe2 == 1 || puntosHeroe2 == 0){
			resultado = RESULTADO.EMPATE;
		}else if(puntosHeroe2 == 1 && puntosHeroe1 == 2 || puntosHeroe1 == 3 || puntosHeroe1 == 1 || puntosHeroe1 == 0) {
			resultado = RESULTADO.EMPATE;
		}
		
		return resultado;
	}
	

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFuerza() {
		return fuerza;
	}

	private void setFuerza(int fuerza) {
		if(fuerza < 0) {
			fuerza = 0;
		}else if(fuerza > 100) {
			fuerza = 100;
		}

		this.fuerza = fuerza;
	}

	public int getResistencia() {
		return resistencia;
	}

	private void setResistencia(int resistencia) {
		
		if(resistencia < 0) {
			resistencia = 0;
		}else if(resistencia > 100) {
			resistencia = 100;
		}
		this.resistencia = resistencia;
	}

	public int getSuperpoderes() {
		return superpoderes;
	}

	private void setSuperpoderes(int superpoderes) {
		
		if(superpoderes < 0) {
			superpoderes = 0;
		}else if(superpoderes > 100) {
			superpoderes = 100;
		}
		this.superpoderes = superpoderes;
	}

	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}
	
	
	
	

}
