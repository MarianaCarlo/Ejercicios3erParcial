package exercise2_Adapter;

public class AdaptadorRefrigiradores implements ArtefactosElectronicosA {
	private Refrigiradores refrigirador;
	public int precio;
	public int tiempoVida;
	public String nombre = "refrigirador";
	
	public AdaptadorRefrigiradores(Refrigiradores refrigirador) {
		super();
		this.refrigirador = refrigirador;
	}

	@Override
	public int getPrecio() {
		precio = refrigirador.getCosto();
		return precio;
	}


	@Override
	public int getTiempodeVida() {
		tiempoVida = this.refrigirador.calcularTiempoDeVida();
		return tiempoVida;
	}

	@Override
	public void setTiempoDeVida(int vidaAnios) {
		vidaAnios = this.refrigirador.calcularTiempoDeVida();
		
	}
	
	@Override
	public String nombre() {
		return nombre;
	}

	
}
