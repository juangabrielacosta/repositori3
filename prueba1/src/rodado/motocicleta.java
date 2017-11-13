package rodado;

public class motocicleta  extends Vehiculos{
protected String desc;
	public motocicleta(String descripcion) {
		// TODO Auto-generated constructor stub
		this.desc=descripcion;
	}
public  String descripcion () {
	return desc;
}
public int velocidadMaxima () {
	return 150;
}
public double Consumo () {
	return 0.2;
}
}
