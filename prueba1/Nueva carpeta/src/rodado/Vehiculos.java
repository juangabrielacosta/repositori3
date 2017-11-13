package rodado;

public abstract class Vehiculos {
	protected String desc ;
	public String descripcion() {
		return desc;
	}
	public abstract int velocidadMaxima ();
	public abstract double Consumo ();

}
