package exercise2_Adapter;

public class AdaptadorTelevisores implements ArtefactosElectronicosA {
	private Televisores televisor;
	public int precio;
	public int tiempoVida;
	public String nombre ="televisor";
	
	public AdaptadorTelevisores(Televisores televisor) {
		super();
		this.televisor = televisor;
	}

	@Override
	public int getPrecio() {
		precio = televisor.getCosto();
		return precio;
	}

	@Override
	public int getTiempodeVida() {
		tiempoVida = this.televisor.calcularTiempoDeVida();
		return tiempoVida;
	}

	@Override
	public void setTiempoDeVida(int vidaAnios) {
		vidaAnios = this.televisor.calcularTiempoDeVida();
		
	}
	
	@Override
	public String nombre() {
		return nombre;
	}

	
}
