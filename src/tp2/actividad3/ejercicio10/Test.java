package tp2.actividad3.ejercicio10;

public class Test {

	public static void main(String[] args) {
		Fraccion f = new Fraccion(1,4);
		Fraccion f2 = new Fraccion(1,5);
//		int num1 = 1;
//		
		Fraccion resultado = CalculadoraFracciones.Sumar(f, f2);
		
		System.out.println(resultado);
	}

}
