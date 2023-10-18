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

		String grant = "";
		String strduracion= "";
		// Ordenamos la lista de procesos por la propiedad tllegada

		Collections.sort(procesos, (p1, p2) -> Integer.compare(p1.getTllegada(), p2.getTllegada()));

		// instanciamos la clase que crea los strings a imprimir
		Pintar_objeto pintaobjeto = new Pintar_objeto();
		String nombre;
		int duracionacumulada=0;
		
		// recorremos para concatenar los procesos y pintarlos
		for (Fcfs proceso : procesos) {

			
			duracionacumulada = duracionacumulada +proceso.getDuracion();
			grant = grant.concat(pintaobjeto.pintar_grant(proceso.getNombre(), proceso.getDuracion()));
	        strduracion = strduracion.concat(pintaobjeto.pintar_duracion(proceso.getNombre(),proceso.getDuracion(),Integer.toString(duracionacumulada)));
	
		}
		// imprimimos el diagrama
		System.out.println("");
		System.out.println(" Resultado del proceso FCFS:");
		System.out.println("");
		System.out.println(grant);
		System.out.println(strduracion);

	}

}
