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

		// instanciamos la clase procesador
		Procesador procesador = new Procesador();

		// Inicializamos una lisata de procesos Fcfs nombre, duración ms, llegada en ms

		List<Fcfs> procesos = new ArrayList<>();
		procesos.add(new Fcfs("P1", 20, 0));
		procesos.add(new Fcfs("P2", 20, 1));
		procesos.add(new Fcfs("P3", 15, 3));
		procesos.add(new Fcfs("P4", 3, 4));
		procesos.add(new Fcfs("P5", 5, 2));

		procesador.fcfs(procesos);

		// Inicializamos una lisata de procesos Fcfs nombre, duración ms, llegada en ms

		List<Fcfs> procesos2 = new ArrayList<>();
		procesos2.add(new Fcfs("P1", 20, 3));
		procesos2.add(new Fcfs("P2", 20, 2));
		procesos2.add(new Fcfs("P3", 15, 1));
		procesos2.add(new Fcfs("P4", 3, 0));
		procesos2.add(new Fcfs("P5", 5, 4));

		procesador.fcfs(procesos2);

		// Inicializamos una lisata de procesos SJF nombre, duración ms, llegada en ms
		// aunque la llegada no es relevante y no la evaluaremos

		List<Sjf> procesos_sjf = new ArrayList<>();
		procesos_sjf.add(new Sjf("P1", 28, 3));
		procesos_sjf.add(new Sjf("P2", 20, 1));
		procesos_sjf.add(new Sjf("P3", 15, 4));
		procesos_sjf.add(new Sjf("P4", 3, 0));
		procesos_sjf.add(new Sjf("P5", 5, 2));

		procesador.sjf(procesos_sjf);

		// Inicializamos una lisata de procesos SJF nombre, duración ms, llegada en ms
		// aunque la llegada no es relevante y no la evaluaremos

		List<RoundRobin> procesos_rr = new ArrayList<>();
		procesos_rr.add(new RoundRobin("P1", 28, 0));
		procesos_rr.add(new RoundRobin("P2", 20, 1));
		procesos_rr.add(new RoundRobin("P3", 15, 2));
		procesos_rr.add(new RoundRobin("P4", 3, 3));
		procesos_rr.add(new RoundRobin("P5", 5, 4));

		// establecemos el quantum en 20 ms
		procesador.round_robin(procesos_rr, 4);

	}

}
