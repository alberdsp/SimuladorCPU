package modelo;

public class Pintar_objeto {
	
	
	public Pintar_objeto() {}
	
	/*
	 * imprime el minigráfico grant del resultado de los procesos
	 */
	public String pintar_grant(String nombre,int duracion) {
		
		int espacio =0;
		String strobjeto ="[";
		espacio = (duracion)/2;
		 for (int i=1; i <= espacio;i++) {
			 
			 strobjeto = strobjeto.concat("_");
			 
		 }
		 
		 strobjeto = strobjeto.concat(nombre);
		 
         for (int i=1; i <= espacio;i++) {
			 
			 strobjeto = strobjeto.concat("_");
			 
		 }
		
		
         strobjeto = strobjeto.concat("]");
		  
		
		
		
		
		
		return strobjeto;
	}
	/*
	 * pintar_duracion imprime la lina de tiempo progresiva
	 */
     public String pintar_linea_tiempo(String nombre,int duracion,String duracionacumulada) {
		
		int espacio =0;
		
		String strtiempos="  "; // variable para pintar las duraciones
		String strduracion= Integer.toString(duracion);
		
		espacio = (duracion)+1;
		 
		  // iteramos para rellenar el tiempo en el grant         
         
         for (int i=1; i < espacio;i++) {
			 
        	 strtiempos =  strtiempos.concat(" ");
			 
		 }
		 
         strtiempos =  strtiempos.concat(duracionacumulada);
		 
         
		  
		
		return strtiempos;
      
         
	}
     
     /*
      * imprime el resultado de tiempos medios y espera final
      */
     public String pintar_tiempos(String nombre,int duracion,String tespera) {
 		
 		
 		String strduracion = Integer.toString(duracion);
 		String strresultado= "Resultado ";
 		
 		
 		strresultado = strresultado.concat(nombre+" -> Tiempo de espera = " + tespera+ " Tiempo Total = "+ duracion);
 			 
   		
 		return strresultado;
       
          
 	}
     
     
     /*
      * imprime el el tiempo medio de espera
      */
     public String pintar_t_medio_espera(int tiempototal,int nprocesos) {
 		
 		
    	 String strtiempomedio= " El tiempo medio de proceso ha sido:   ";  
    	 
    	  strtiempomedio = strtiempomedio.concat(Integer.toString(tiempototal/nprocesos)+ " milisegundos.");
 		
 		
 	
 			 
   		
 		return strtiempomedio;
       
          
 	}
     
     

}
