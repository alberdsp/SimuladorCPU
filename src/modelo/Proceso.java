package modelo;

/*
 * declaramos la clase Proceso abstracta
 */

public abstract class Proceso {
	
   // variables nombre, duración en milisegundos,tiempo llegada milisegundos,
  //  tiempo total de espera milisegundos, tiempo de proceso total
	
    protected String nombre;
	protected Integer duracion;
  	protected Integer tllegada;
	protected Integer tespera;
    protected Integer tproceso;
	protected Boolean finalizado;
	





	public Proceso(String nombre, Integer duracion, Integer tllegada, Integer tespera, Integer tproceso) {
	this.nombre = nombre;
	this.duracion = duracion;
	this.tllegada = tllegada;
	this.tespera = tespera;
	this.tproceso = tproceso;
	this.finalizado = false;
	
}

    
	/**
	 * @return nombre devuelve nombre del proceso
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return duracion devuelve la duración predeterminada del proceso
	 */
	public Integer getDuracion() {
		return duracion;
	}

	/**
	 * @return tllegada devuelve el tiempo en milisegundos en el que llegó
	 */
	public Integer getTllegada() {
		return tllegada;
	}

	/**
	 * @return tespera devuelve el tiempo de espera total del proceso
	 */
	public Integer getTespera() {
		return tespera;
	}

	/**
	 * @return  tproceso tiempo total que ha tardado el proceso en completarse
	 */
	public Integer getTproceso() {
		return tproceso;
	}


	
	/**
	 * @param nombre establece el nombre del proceso
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
    /**
	 * @return  finalizado devuelve booleano de si está finalizado
	 */
	public Boolean getFinalizado() {
		return finalizado;
	}
	
	
	/**
	 * @param duracion establece la duración predeterminada del proceso
	 */
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	/**
	 * @param tllegada establece el tiempo en milisegundos en el que llega 
	 * el proceso 0 a x
	 */
	public void setTllegada(Integer tllegada) {
		this.tllegada = tllegada;
	}

	/**
	 * @param tespera establece el tiempo total de espera del proceso durante su ejecución
	 */
	public void setTespera(Integer tespera) {
		this.tespera = tespera;
	}

	/**
	 * @param tproceso establece el tiempo total que ha durado el proceso realmente
	 */
	public void setTproceso(Integer tproceso) {
		this.tproceso = tproceso;
	}


	/**
	 * @param finalizado establece si está finalizado o no el proceso
	 */
	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}



}
