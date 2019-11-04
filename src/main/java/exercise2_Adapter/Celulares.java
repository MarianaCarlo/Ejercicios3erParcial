package exercise2_Adapter;

public class Celulares implements ArtefactosElectronicosA {
	private int precio;
	private int tiempoDeVida;
	private String nombre = "celular";

	public Celulares(int precio) {
		super();
		this.precio = precio;
	}

	@Override
	public int getPrecio() {
		return precio;
	}


	@Override
	public void setTiempoDeVida(int vidaAnios) {
		System.out.println("El precio del celular es:" + this.getPrecio());
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
