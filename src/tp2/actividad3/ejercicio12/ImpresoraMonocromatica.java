package tp2.actividad3.ejercicio12;

public class ImpresoraMonocromatica {
	
	private boolean encendida;
	private int cantHojas;
	private double nivelTinta;
	
	
	public ImpresoraMonocromatica(boolean encendida, int cantHojas) {
		
		this.setEncendida( encendida);
		this.setCantHojas(cantHojas);
		this.setNivelTinta(100);
	}
	
	public void imprimir(Documento documento) {
		
	  if(this.nivelTinta > 0 && this.cantHojas > 0) {	
        System.out.println(documento.getFecha() + "                     " + documento.getTitulo() +
        		          "\n"+ 
        		           documento.getTexto());
        
        int docu = documento.getTexto().length();  //.legt se usa para obtener la longitud de una cadena
         System.out.println("La cantidad de caracteres ingresados son: " +  docu);
        this.nivelSegunCantCaracteres(docu);
       
        
        int cantHojas = 0;
        do {        

           if(docu > 50) {
        	 this.nivelTinta--; 	
           }
        
           if(docu > 20) {
        	  this.cantHojas--;
        	  cantHojas++;
        	  
           }
        
           docu = docu-20;
           
        }while(docu > 20);
        this.recargarBandeja(cantHojas);
	  }else {
		  System.out.println("No se cuenta con el nivel necesario de tinta o de hojas en la impresora");
	  }
	  
	  
	  
    }
	
	private void nivelSegunCantCaracteres(int canDeCaracteres) {
		int rendimientoDeTIntaPorHoja = 50;
		double cantDeTintaUsada = canDeCaracteres/rendimientoDeTIntaPorHoja;
		System.out.println("\nLa cantidad de tinta usada es: " + cantDeTintaUsada);
	}
	
	private void recargarBandeja(int cantHojasImprimidas) {
		if(cantHojasImprimidas > 0) {
			if(cantHojasImprimidas <= 35) {
				System.out.println("\nCantidad de hojas en bandeja: " + cantHojasImprimidas);
			}else {
				System.out.println("\nExceso de hojas en bandeja");
			}
		}else {
			System.out.println("\nNo hay hojas en la bandeja");
		}
	}
	

	public boolean isEncendida() {
		return encendida;
	}

	private void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	public int getCantHojas() {
		return cantHojas;
	}

	private void setCantHojas(int cantHojas) {
		this.cantHojas = cantHojas;
	}

	public double getNivelTinta() {
		return nivelTinta;
	}

	private void setNivelTinta(double nivelTinta) {
		this.nivelTinta = nivelTinta;
	}

	@Override
	public String toString() {
		return "ImpresoraMonocromatica [encendida=" + encendida + ", cantHojas=" + cantHojas + ", nivelTinta="
				+ nivelTinta + "]";
	}
	
	

}
