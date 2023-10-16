package modelo;

/*
 * declaramos la clase Proceso abstracta
 */
public abstract class Proceso {
	
	protected String nombre;
    protected Integer duracion;
	
	public Proceso(String nombre, Integer duracion) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
	}

}
