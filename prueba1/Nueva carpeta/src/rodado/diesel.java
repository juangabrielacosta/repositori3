package rodado;

public class diesel extends decorador {
private Vehiculos mov;
	public diesel(Vehiculos movil) {
		// TODO Auto-generated constructor stub
	this.mov = movil;
	}
	public String descripcion () {
		return this.mov.descripcion()+" naftero";
	}
	public int velocidadMaxima() {
		return this.mov.velocidadMaxima()+ 40;
	}
	public double Consumo () {
		return this.mov.Consumo()+2.1;
	}

}
