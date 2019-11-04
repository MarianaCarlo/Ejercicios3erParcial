package exercise2_Adapter;

public class Computadoras implements ArtefactosElectronicosA {
	private int precio;
	private int tiempoDeVida;
	private String nombre = "Computadora";

	public Computadoras(int precio) {
		super();
		this.precio = precio;
	}

	@Override
	public int getPrecio() {
		return precio;
	}

	@Override
	public void setTiempoDeVida(int vidaAnios) {
		System.out.println("El precio de la computadora es: " + this.getPrecio());
		this.tiempoDeVida = vidaAnios;

	}
	
	@Override
	public int getTiempodeVida() {
		return tiempoDeVida;
	}
	@Override
	public String nombre() {
		return nombre;
	}
	

}
