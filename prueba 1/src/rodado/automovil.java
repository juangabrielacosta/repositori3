package rodado;

public class automovil extends Vehiculos {
protected String desc;
	public automovil(String descripcion) {
		// TODO Auto-generated constructor stub
		desc= descripcion;
	}
public String descripcion () {
	return desc;
}
public int velocidadMaxima () {
	return 230;
}
public double Consumo () {
	return 1.8;
}
}
