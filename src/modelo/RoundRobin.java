package modelo;

/* 
 *  Declaramos la clase Round Robin , hereda de proceso e incropora quantum
 *  de procesamiento
 */
public class RoundRobin extends Proceso {

	int tiemporestante;

	public RoundRobin(String nombre, int duracion, int tllegada) {

		super(nombre, duracion, tllegada);

		this.tiemporestante = duracion;
	}

	/**
	 * @return vevuelve tiempo restante de proceso
	 */
	public int getTiemporestante() {
		return tiemporestante;
	}

	/**
	 * @param establece tiempo restante de proceso
	 */
	public void setTiemporestante(int tiemporestante) {
		this.tiemporestante = tiemporestante;
	}

}
