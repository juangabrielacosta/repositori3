package rodados;

public class diesel  extends decorator{
private Vehiculos movil;
	public diesel(Vehiculos movil) {
		// TODO Auto-generated constructor stub
		this.movil=movil;
	}
public String descripcion() {
	return this.movil.descripcion()+ " naftero";
}
public int velocidadMaxima() {
	return this.movil.velocidadMaxima() +50;
}
public double consumo () {
	return this.movil.consumo() +1.0;
}

}
