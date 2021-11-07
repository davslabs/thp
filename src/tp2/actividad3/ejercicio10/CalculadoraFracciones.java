package tp2.actividad3.ejercicio10;

public class CalculadoraFracciones {
	
	public static Fraccion Sumar(Fraccion fraccion, int numeroEntero) {
		double valorReal = fraccion.valorReal() + numeroEntero;
		String s = String.valueOf(valorReal);
		
		int valorDecimal = s.length() - 1 - s.indexOf('.');
		int denominador = 1;
		
		for (int i = 0; i < valorDecimal; i++) {
			valorReal *= 10;
			denominador *= 10;
		}
		
		int num = (int) Math.round(valorReal);
		int denominadorComun = obtenerDenominadorComun(num, denominador);
				
		return new Fraccion((num/denominadorComun), (denominador/denominadorComun));
	}
	
	public static Fraccion Sumar(Fraccion fraccionA, Fraccion fraccionB) {
		int numerador = fraccionA.getNumerador() * fraccionB.getDenominador() + 
				fraccionA.getDenominador() * fraccionB.getNumerador();
		int denominador = fraccionA.getDenominador() * fraccionB.getDenominador();
	
		return simplificar(numerador, denominador);
	}
	
	private static Fraccion simplificar(int numerador, int denominador) {
		int u = Math.abs(numerador); //valor absoluto del numerador
		int v = Math.abs(denominador); //valor absoluto del denominador

		if (v != 0) {
			int r;
			while (v != 0) {
				r = u % v;
				u = v;
				v = r;
			}
		}
		
		return new Fraccion((numerador/u),(denominador/u));
	}
	
    public static int obtenerDenominadorComun(int n1, int n2) {
        if(n2==0) {
            return n1;
        }
        
        return obtenerDenominadorComun(n2, n1 % n2);
    }
}
