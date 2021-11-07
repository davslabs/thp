package tp2.actividad3.ejercicio14;

public class Test {

	public static void main(String[] args) {
		
		Contador contador = new Contador();
		Acumulador acumulador = new Acumulador();
		Promedio prom = new Promedio(contador, acumulador);
		contador.incrementarValor();
		contador.incrementarValor();
		contador.incrementarValor();
		contador.incrementarValor();
		acumulador.incrementarValor(30);
		acumulador.incrementarValor(50);
		
		
		System.out.println(contador.obtenerValor());
		System.out.println(acumulador.obtenerValor());
		System.out.println(prom.obtenerValor());

	}

}
