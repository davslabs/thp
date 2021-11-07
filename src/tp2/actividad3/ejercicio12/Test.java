package tp2.actividad3.ejercicio12;

public class Test {

	public static void main(String[] args) {
		
		Fecha F = new Fecha(07,10,2021);
		Documento D = new Documento(F, "AZUL", "dddddddddddd ddddddddddddddddddddddddddd ddddddddd dddddddddddddddd dddd\n"
				+ "ddddddddddddddddd ddddddddddddddd ddd22 3" );  
		ImpresoraMonocromatica I = new ImpresoraMonocromatica(true, 100); 
        I.imprimir(D);
        System.out.println(I);
	}

}
