package Main;

import java.util.ArrayList;
import java.util.List;


import modelo.*;

/**
 * Programa Simulador_CPU ABF 2023
 */

public class Main {

	public static void main(String[] args) {

		// declaramos menu y lo lanzamos

		Menu menu = new Menu();

		menu.cabecera();
		
		// instanciamos la clase procesador y llamamos al procedimiento fcfs
				Procesador procesador = new Procesador();

		// Inicializamos una lisata de procesos Fcfs nombre, duración ms, llegada en ms
		
		List<Fcfs> procesos = new ArrayList<>();
		procesos.add(new Fcfs("P1", 28, 5)); 
		procesos.add(new Fcfs("P2", 20, 3));  
		procesos.add(new Fcfs("P3", 15, 7)); 
		procesos.add(new Fcfs("P4", 3, 1)); 
		procesos.add(new Fcfs("P5", 5, 4)); 
         
		
		procesador.fcfs(procesos);
		
		
		
		// Inicializamos una lisata de procesos SJF nombre, duración ms, llegada en ms
		// aunque la llegada no es relevante y no la evaluaremos
		
		List<Sjf> procesos_sjf = new ArrayList<>();
		procesos_sjf.add(new Sjf("P1", 28, 5)); 
		procesos_sjf.add(new Sjf("P2", 20, 3));  
		procesos_sjf.add(new Sjf("P3", 15, 7)); 
		procesos_sjf.add(new Sjf("P4", 3, 1)); 
		procesos_sjf.add(new Sjf("P5", 5, 4)); 
		
		
		procesador.sjf(procesos_sjf);
		
		

		// Inicializamos una lisata de procesos SJF nombre, duración ms, llegada en ms
		// aunque la llegada no es relevante y no la evaluaremos
		
		List<RoundRobin> procesos_rr = new ArrayList<>();
		procesos_rr.add(new RoundRobin("P1", 28, 5)); 
		procesos_rr.add(new RoundRobin("P2", 20, 3));  
		procesos_rr.add(new RoundRobin("P3", 15, 7)); 
		procesos_rr.add(new RoundRobin("P4", 3, 1)); 
		procesos_rr.add(new RoundRobin("P5", 5, 4)); 
		
		// establecemos el quantum en 20 ms
		procesador.round_robin(procesos_rr,20);
		

	}

}
