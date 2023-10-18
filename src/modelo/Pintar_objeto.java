package modelo;

public class Pintar_objeto {
	
	
	public Pintar_objeto() {}
	
	
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
	
     public String pintar_duracion(String nombre,int duracion,String duracionacumulada) {
		
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

}
