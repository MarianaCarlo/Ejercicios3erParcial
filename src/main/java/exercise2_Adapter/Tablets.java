package exercise2_Adapter;

public class Tablets implements ArtefactosElectronicosA {
	private int precio;
	private int tiempoDeVida;
	private String nombre = "Tablet";

	public Tablets(int precio) {
		super();
		this.precio = precio;
	}

	@Override
	public int getPrecio() {
		return precio;
	}

	@Override
	public void setTiempoDeVida(int vidaAnios) {
		System.out.println("El precio de la tablet es: " + this.getPrecio());
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
