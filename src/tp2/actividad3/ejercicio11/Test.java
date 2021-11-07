package tp2.actividad3.ejercicio11;

public class Test {

	public static void main(String[] args) {
		
		Superheroe heroe1 = new Superheroe("Iron Man", 80, 20, 80);
		Superheroe heroe2 = new Superheroe("BAtMan", 90, 20, 80);
		
		System.out.println(heroe1.competir(heroe1, heroe2));
		System.out.println(heroe2);
		

	}

}
