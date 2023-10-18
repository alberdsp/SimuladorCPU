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

		// Inicializamos una lisata de procesos Fcfs nombre, duración ms, llegada en ms
		
		List<Fcfs> procesos = new ArrayList<>();
		procesos.add(new Fcfs("P1", 20, 5)); 
		procesos.add(new Fcfs("P2", 10, 3));  
		procesos.add(new Fcfs("P3", 5, 7)); 
		procesos.add(new Fcfs("P4", 2, 1)); 
		procesos.add(new Fcfs("P5", 15, 4)); 
         
		// instanciamos la clase procesador y llamamos al procedimiento fcfs
		Procesador procesador = new Procesador();
		procesador.fcfs(procesos);

	}

}
