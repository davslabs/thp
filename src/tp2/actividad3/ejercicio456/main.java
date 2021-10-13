package tp2.actividad3.ejercicio456;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = new Vehiculo("Giat", "Halio", "gris oscuro", 180);
		Persona persona = new Persona("Fulano", "Gomez", vehiculo, false);
		
		System.out.println(persona);
	}

}
