package tp2.actividad2.ejercicio5;

public class Test {

	public static void main(String[] args) {
		Automovil auto = new Automovil("FORD", "FIESTA", "ABCD123", 40);
		auto.setRendimientoPorLitro(10.0);
	
		boolean pudoCargar = auto.cargarCombustible(40);
		if(pudoCargar) {
			System.out.println("Pudo cargar combustible");
		} else {
			System.out.println("No pudo cargar combustible");
		}
		
		System.out.println("Viajando el auto 345KM. Cantidad efectiva recorrida: " + auto.viajar(395));
		
		if(auto.pocoCombustible()) {
			System.out.println("Queda poco combustible. Combustible restante: " + auto.getCantidadDeCombustible() + "L");
		}
		
		System.out.println("Viajando el auto 50KM. Cantidad efectiva recorrida: " + auto.viajar(50));
		
		System.out.println(auto.toString());
	}

}
