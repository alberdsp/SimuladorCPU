package modelo;

import java.util.Collections;
import java.util.List;

public class Procesador {

	public Procesador() {

	}

	/*
	 * Método fcfs , recibimos una lista con los objetos proceso y lealizamos la
	 * ordenaciñon e impresión
	 */

	public void fcfs(List<Fcfs> procesos) {

		// declaramos la variable que pintará el diagrama

		String grant = ""; // dibujará el diagrama grant
		String strduracion= ""; // imprimirá la línea de tiempo de los procesos
		String strtiempos =""; // imprimirá el resumen de los tiempos de proceso
		
		// Ordenamos la lista de procesos por la propiedad tllegada

		Collections.sort(procesos, (p1, p2) -> Integer.compare(p1.getTllegada(), p2.getTllegada()));

		// instanciamos la clase que crea los strings a imprimir
		Pintar_objeto pintaobjeto = new Pintar_objeto();
		String nombre;
		int duracionacumulada=0;
		int tiempoesperasuma = 0;
	
		
		// recorremos para concatenar los procesos y pintarlos
		for (Fcfs proceso : procesos) {
            
					
			// establecemos el tiempo de espera
			proceso.setTespera(duracionacumulada);			
			duracionacumulada = duracionacumulada +proceso.getDuracion();
			// acumulamos el tiempo de espera total 
			tiempoesperasuma = tiempoesperasuma + proceso.getTespera();
			// almacenamos la cadenas que luego imprimiran por pantalla
			grant = grant.concat(pintaobjeto.pintar_grant(proceso.getNombre(), proceso.getDuracion()));
	        strduracion = strduracion.concat(pintaobjeto.pintar_linea_tiempo(proceso.getNombre(),proceso.getDuracion(),Integer.toString(duracionacumulada)));
	        strtiempos = strtiempos.concat(pintaobjeto.pintar_tiempos(proceso.getNombre(), proceso.getDuracion(), Integer.toString(proceso.getTespera())));
	        strtiempos = strtiempos.concat("\n");
	        
		}
		
		
		// imprimimos el diagrama
		System.out.println("");
		System.out.println(" Resultado del proceso FCFS:");
		System.out.println("");
		System.out.println(grant);
		System.out.println(strduracion);
		System.out.println("");
		System.out.println(strtiempos);
		System.out.println("");
		System.out.println("");
		System.out.println(pintaobjeto.pintar_t_medio_espera(tiempoesperasuma, procesos.size()));   
		System.out.println("______________________________________________________________");
	}

}
