package exercise2_Adapter;

public class AdaptadorLavadoras implements ArtefactosElectronicosA {
	private Lavadoras lavadora;
	public int precio;
	public int tiempoVida;
	public String nombre = "lavadora";
	
	public AdaptadorLavadoras(Lavadoras lavadora) {
		super();
		this.lavadora = lavadora;
	}

	@Override
	public int getPrecio() {
		precio = lavadora.getCosto();
		return precio;
	}

	@Override
	public int getTiempodeVida() {
		tiempoVida = this.lavadora.calcularTiempoDeVida();
		return tiempoVida;
	}

	@Override
	public void setTiempoDeVida(int vidaAnios) {
		vidaAnios = this.lavadora.calcularTiempoDeVida();
		
	}
	
	@Override
	public String nombre() {
		return nombre;
	}

	
}
