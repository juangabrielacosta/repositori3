package rodado;

public class gasoil extends decorador {
	private Vehiculos mov;
	public gasoil(Vehiculos movil) {
		// TODO Auto-generated constructor stub
		this.mov=movil;

	}
	public String descripcion() {
		return this.mov.descripcion() + "  gasolero";
	}
	public int velocidadMaxima() {
		return this.mov.velocidadMaxima()+20;
	}
	public double Consumo() {
		return this.mov.Consumo()+0.01;
	}
}
