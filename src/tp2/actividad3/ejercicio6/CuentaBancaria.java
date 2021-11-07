package tp2.actividad3.ejercicio6;

import java.util.Date;

public class CuentaBancaria {
	private static final int MIN_CBU = 60000;
	private static final int MAX_CBU = 90000;
	private int claveBancariaUniforme;
	private TipoCuenta tipoCuenta;
	private double saldo;
	private Date fechaApertura;
	private Persona titular;
	
	public CuentaBancaria(TipoCuenta tipoCuenta, Persona titular) {
		this.tipoCuenta = tipoCuenta;
		this.titular = titular;
		this.saldo = 0.0;
		this.fechaApertura = CuentaBancaria.obtenerFechaDeHoy();
		this.claveBancariaUniforme = CuentaBancaria.generarCBU();
	}	
		
	public int getClaveBancariaUniforme() {
		return claveBancariaUniforme;
	}

	public TipoCuenta getTipoCuenta() {
		return tipoCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Date getFechaApertura() {
		return fechaApertura;
	}

	public Persona getTitular() {
		return titular;
	}
	
	public void depositar(double saldo) {
		if(saldo > 0) {
			this.saldo += saldo;
		}
	}
	
	public boolean extraer(double saldo) {
		boolean pudoExtraer = false;
		if(saldo > 0 && this.saldo >= saldo) {
			this.saldo -= saldo;
			pudoExtraer = true;
		}
		
		return pudoExtraer;
	}

	private static Date obtenerFechaDeHoy() {
		return new Date();
	}
	
	private static int generarCBU() {
		return (int)Math.floor(Math.random()*(MAX_CBU-MIN_CBU+1)+MIN_CBU);
	}
}
