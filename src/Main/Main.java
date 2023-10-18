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
		procesos.add(new Fcfs("P1", 28, 5)); 
		procesos.add(new Fcfs("P2", 20, 3));  
		procesos.add(new Fcfs("P3", 15, 7)); 
		procesos.add(new Fcfs("P4", 3, 1)); 
		procesos.add(new Fcfs("P5", 5, 4)); 
         
		// instanciamos la clase procesador y llamamos al procedimiento fcfs
		Procesador procesador = new Procesador();
		procesador.fcfs(procesos);

	}

}
