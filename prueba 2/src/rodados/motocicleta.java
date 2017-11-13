package rodados;

public class motocicleta extends Vehiculos {
private String desc;
	public motocicleta(String descripcion) {
		// TODO Auto-generated constructor stub
		this.desc=descripcion;
	}
	public String descripcion () {
		return this.desc;
	}
	public int velocidadMaxima () {
		return 100;
	}
	public double consumo () {
		return 0.5;
	}

}
