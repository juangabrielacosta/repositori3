package rodados;

public class automovil extends Vehiculos {
private String desc;
	public automovil(String descripcion ) {
		this.desc=descripcion;
		// TODO Auto-generated constructor stub
	}
	public String descripcion () {
		return desc;
	}
	public int velocidadMaxima() {
		return 200;
	}
	public double consumo () {
		return 1.0;
	}

}
