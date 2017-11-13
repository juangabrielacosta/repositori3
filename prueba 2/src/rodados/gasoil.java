package rodados;

public class gasoil  extends decorator{
private Vehiculos movil;
	public gasoil(Vehiculos movil) {
		// TODO Auto-generated constructor stub
		this.movil= movil;
	}
	public String descripcion () {
		return this.movil.descripcion()+ " gasolero";
	}
	public int velocidadMaxima() {
		return this.movil.velocidadMaxima() +20;
	}
	public double consumo() {
		return this.movil.consumo()+0.5;
	}

}
