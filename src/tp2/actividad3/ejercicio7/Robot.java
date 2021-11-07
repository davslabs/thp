package tp2.actividad3.ejercicio7;

public class Robot {
	
	private String nombre;

	public Robot(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void saludar() {
		System.out.println("Hola, mi nombre es " + nombre + " ¿en que puedo ayudarte? " );
	}
	
	public void saludar(Persona nombrePersona) {
		
		System.out.println("Hola " + nombrePersona.getNombre() +", mi nombre es " + this.nombre + " ¿en que puedo ayudarte?, ");
	}

}
