package rodados;

public abstract class Vehiculos  {
protected String descripcion;
	public String descripcion() {
		return descripcion;
	}
	public abstract int velocidadMaxima ();
	public abstract double consumo();

}
