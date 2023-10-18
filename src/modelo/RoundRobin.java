package modelo;


/* 
 *  Declaramos la clase Round Robin , hereda de proceso e incropora quantum
 *  de procesamiento
 */
public class RoundRobin extends Proceso{
	

	public void setQuantum(int quantum) {
		this.quantum = quantum;
	}
	int quantum;
	public RoundRobin(String nombre, int duracion,int tllegada,int quantum) {
		
		super(nombre,duracion,tllegada);
		this.quantum = quantum;
		
	}
	
	
	/**
	 * @return devuelve el quantum
	 */
	public int getQuantum() {
		return quantum;
	}
	/**
	 * @param establece el tiempo quantum de proceso
	 */
	
	
}
