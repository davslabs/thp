package tp2.actividad2.ejercicio5;

public class Automovil {
	private static final double PORCENTAJE_CAPACIDAD_MIN = 0.15;
	private String marca;
	private String modelo;
	private String patente;
	private double capacidadTanque;
	private double cantidadDeCombustible;
	private double rendimientoPorLitro;
	
	public Automovil(String marca, String modelo, String patente, double capacidadTanque) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.capacidadTanque = capacidadTanque;
		this.cantidadDeCombustible = 0;
	}

	public int viajar(int cantKilometros) {
		double recorridoEfectivo = 0.0;
		
		if(this.cantidadDeCombustible > 0) {
			double consumoTotal = this.calcularConsumo(cantKilometros);
			double combustibleActual = this.cantidadDeCombustible;
			double combustibleRestante = this.consumirCombustible(consumoTotal);
			double combustibleEmpleado = combustibleActual - combustibleRestante;
			recorridoEfectivo = this.calcularDistancia(combustibleEmpleado);
		}

		return (int)recorridoEfectivo;
	}
	
	
	
	public double getCantidadDeCombustible() {
		return cantidadDeCombustible;
	}

	public void setRendimientoPorLitro(double rendimientoPorLitro) {
		this.rendimientoPorLitro = rendimientoPorLitro;
	}

	public boolean cargarCombustible(double cantLitros) {
		boolean pudoCargar = false;
		if(cantLitros > 0 && cantLitros <= this.espacioDisponible()) {
			this.cantidadDeCombustible = cantLitros;
			pudoCargar = true;
		}
		
		return pudoCargar;
	}
	
	public boolean pocoCombustible() {
		return this.cantidadDeCombustible < (this.capacidadTanque * PORCENTAJE_CAPACIDAD_MIN);
	}

	private double calcularConsumo(int cantKilometros) {
		return (double)(cantKilometros)/this.rendimientoPorLitro;
	}
	
	private double calcularDistancia(double cantLitros) {
		return cantLitros * this.rendimientoPorLitro; //L * km/L
	}
	
	private double espacioDisponible() {
		return this.capacidadTanque - this.cantidadDeCombustible;
	}
	
	private double consumirCombustible(double cantLitros) {
		if(cantLitros > this.cantidadDeCombustible) {
			this.cantidadDeCombustible = 0;
		} else {
			this.cantidadDeCombustible = this.cantidadDeCombustible - cantLitros;
		}
		
		return this.cantidadDeCombustible;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", capacidadTanque="
				+ capacidadTanque + ", cantidadDeCombustible=" + cantidadDeCombustible + ", rendimientoPorLitro="
				+ rendimientoPorLitro + ", pocoCombustible()=" + pocoCombustible() + ", espacioDisponible()="
				+ espacioDisponible() + "]";
	}	
}
