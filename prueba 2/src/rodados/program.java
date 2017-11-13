package rodados;

public class program {

	public program() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
Vehiculos moto = new motocicleta("colibri");
moto = new gasoil(moto);
mostrar(moto);
	}
	public static void mostrar (Vehiculos v) {
		System.out.println(v.descripcion());
		System.out.println(v.velocidadMaxima());
		System.out.println(v.consumo());

	}

}
