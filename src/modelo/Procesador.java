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
		String strduracion = ""; // imprimirá la línea de tiempo de los procesos
		String strtiempos = ""; // imprimirá el resumen de los tiempos de proceso

		// Ordenamos la lista de procesos por la propiedad tllegada

		Collections.sort(procesos, (p1, p2) -> Integer.compare(p1.getTllegada(), p2.getTllegada()));

		// instanciamos la clase que crea los strings a imprimir
		Pintar_objeto pintaobjeto = new Pintar_objeto();

		int duracionacumulada = 0;
		int tiempoesperasuma = 0;

		// recorremos para concatenar los procesos y pintarlos
		for (Fcfs proceso : procesos) {

			// establecemos el tiempo de espera
			proceso.setTespera(duracionacumulada);
			duracionacumulada = duracionacumulada + proceso.getDuracion();
			// acumulamos el tiempo de espera total
			tiempoesperasuma = tiempoesperasuma + proceso.getTespera();
			// almacenamos la cadenas que luego imprimiran por pantalla
			grant = grant.concat(pintaobjeto.pintar_grant(proceso.getNombre(), proceso.getDuracion()));
			strduracion = strduracion.concat(pintaobjeto.pintar_linea_tiempo(proceso.getNombre(), proceso.getDuracion(),
					Integer.toString(duracionacumulada)));
			strtiempos = strtiempos.concat(pintaobjeto.pintar_tiempos(proceso.getNombre(), proceso.getDuracion(),
					Integer.toString(proceso.getTespera())));
			strtiempos = strtiempos.concat("\n");
			proceso.setFinalizado(true);
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

	public void sjf(List<Sjf> procesos) {

		// declaramos la variable que pintará el diagrama

		String grant = ""; // dibujará el diagrama grant
		String strduracion = ""; // imprimirá la línea de tiempo de los procesos
		String strtiempos = ""; // imprimirá el resumen de los tiempos de proceso

		// Ordenamos la lista de procesos por la propiedad suración, los cortos primero

		Collections.sort(procesos, (p1, p2) -> Integer.compare(p1.getDuracion(), p2.getDuracion()));

		// instanciamos la clase que crea los strings a imprimir
		Pintar_objeto pintaobjeto = new Pintar_objeto();

		int duracionacumulada = 0;
		int tiempoesperasuma = 0;

		// recorremos para concatenar los procesos y pintarlos
		for (Sjf proceso : procesos) {

			// establecemos el tiempo de espera
			proceso.setTespera(duracionacumulada);
			duracionacumulada = duracionacumulada + proceso.getDuracion();
			// acumulamos el tiempo de espera total
			tiempoesperasuma = tiempoesperasuma + proceso.getTespera();
			// almacenamos la cadenas que luego imprimiran por pantalla
			grant = grant.concat(pintaobjeto.pintar_grant(proceso.getNombre(), proceso.getDuracion()));
			strduracion = strduracion.concat(pintaobjeto.pintar_linea_tiempo(proceso.getNombre(), proceso.getDuracion(),
					Integer.toString(duracionacumulada)));
			strtiempos = strtiempos.concat(pintaobjeto.pintar_tiempos(proceso.getNombre(), proceso.getDuracion(),
					Integer.toString(proceso.getTespera())));
			strtiempos = strtiempos.concat("\n");
			proceso.setFinalizado(true);
		}

		// imprimimos el diagrama
		System.out.println("");
		System.out.println(" Resultado del proceso SJF:");
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

	/*
	 * método Round Robin, que recibe un lista de objetos
	 */
	public void round_robin(List<RoundRobin> procesos, int quantum) {

		// declaramos la variable que pintará el diagrama

		String grant = ""; // dibujará el diagrama grant
		String strduracion = ""; // imprimirá la línea de tiempo de los procesos
		String strtiempos = ""; // imprimirá el resumen de los tiempos de proceso

		// Ordenamos la lista de procesos por la propiedad tllegada FIFO

		Collections.sort(procesos, (p1, p2) -> Integer.compare(p1.getTllegada(), p2.getTllegada()));
		// instanciamos la clase que crea los strings a imprimir
		Pintar_objeto pintaobjeto = new Pintar_objeto();

		int duracionacumulada = 0;
		int tiempoesperasuma = 0;
		Boolean finalizado = false; // contempla si se ha finalizado todo
		int procesosfin = 0; // procesos finalizados
		// vamos a recorrer los procesos mientras no esten todos finalizados
		while (finalizado == false) {
           
			// recorremos para concatenar los procesos y pintarlos
			for (RoundRobin proceso : procesos) {

				if (proceso.getFinalizado() == false) {
					// establecemos el tiempo de espera
					proceso.setTespera(duracionacumulada);
					duracionacumulada = duracionacumulada + proceso.getDuracion();
					// acumulamos el tiempo de espera total
					tiempoesperasuma = tiempoesperasuma + proceso.getTespera();
					// almacenamos la cadenas que luego imprimiran por pantalla

					// si resta un tiempo mayor que el quantum restamos el cuantum y el tamaño
					// de bloque será el del quantum, por el contrario será el tiempo restante

					if (proceso.getTiemporestante() >= quantum) {
						grant = grant.concat(pintaobjeto.pintar_grant(proceso.getNombre(), quantum));
						proceso.setTiemporestante(proceso.getTiemporestante() - quantum);
					} else {

						grant = grant
								.concat(pintaobjeto.pintar_grant(proceso.getNombre(), proceso.getTiemporestante()));
						proceso.setTiemporestante(0);
						proceso.setFinalizado(true);

					}
                       // si el proceso es mayor que el quantum pintamos el tiempo en el quantum
					if (proceso.getDuracion()>quantum) {
					strduracion = strduracion.concat(pintaobjeto.pintar_linea_tiempo(proceso.getNombre(),
							quantum, Integer.toString(duracionacumulada)));
					}else {
						
						strduracion = strduracion.concat(pintaobjeto.pintar_linea_tiempo(proceso.getNombre(),
								proceso.getDuracion(), Integer.toString(duracionacumulada)));
						
					}
					strtiempos = strtiempos.concat(pintaobjeto.pintar_tiempos(proceso.getNombre(),
							proceso.getDuracion(), Integer.toString(proceso.getTespera())));
					strtiempos = strtiempos.concat("\n");

					if (proceso.getTiemporestante() == 0) {

						proceso.setFinalizado(true);
						procesosfin++;

					}
				}
			}
			
			// si estan todos los procesos de la lista completado finalizamos todo
			if (procesosfin == procesos.size()) {
				
				finalizado = true;
				
				
			}
			

		}

		// imprimimos el diagrama
		System.out.println("");
		System.out.println(" Resultado del proceso ROUND ROBIN:");
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
