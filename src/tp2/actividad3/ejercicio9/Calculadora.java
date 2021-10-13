package tp2.actividad3.ejercicio9;

public class Calculadora {
	
	public static int sumar(int nroA, int nroB) {
		return nroA + nroB;
	}
	
	public static int restar(int nroA, int nroB) {
		return nroA - nroB;
	}
	
	public static int multiplicar(int nroA, int nroB) {
		return nroA * nroB;
	}
	
	public static int dividir(int nroA, int nroB) {
		int resultado = 0;
		
		if(nroB != 0) {
			resultado = (int)(nroA/nroB);
		}
		
		return resultado;
	}
}