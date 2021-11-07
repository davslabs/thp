package tp2.actividad3.ejercicio8;

public class Test {

	public static void main(String[] args) {
		
		Turnera turno = new Turnera();
		
		System.out.println( turno.otorgarProximoNumero());
		System.out.println( turno.otorgarProximoNumero());
		System.out.println( turno.otorgarProximoNumero());
		System.out.println( turno.otorgarProximoNumero());
		System.out.println( turno.otorgarProximoNumero());

		turno.verUltimoNumeroOtorgado();
		
		System.out.println(turno.resetearContador());
		turno.resetearContador(3);
		turno.verUltimoNumeroOtorgado();


	}

}
