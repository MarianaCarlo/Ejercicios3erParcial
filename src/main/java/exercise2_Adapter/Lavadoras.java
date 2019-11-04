package exercise2_Adapter;

public class Lavadoras implements ArtefactosElectronicosB {
	private int costo;
	private int tiempoGarantia;
	private int tiempoAprox = 10;
	
	public Lavadoras(int costo) {
		super();
		this.costo = costo;
	}

	@Override
	public int calcularTiempoDeVida() {
		int res = 0;
		if (this.getTiempoGarantia()>=0 && this.getTiempoGarantia()<=6) {
			res = tiempoAprox;
		} else if(this.getTiempoGarantia() >6 && this.getTiempoGarantia() <8) {
			res = tiempoAprox-3;
		} else {
			res = tiempoAprox-7;
		}
		return res;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getTiempoGarantia() {
		return tiempoGarantia;
	}

	public void setTiempoGarantia(int tiempoGarantia) {
		System.out.println("El costo de la lavadora es: " + this.getCosto());
		this.tiempoGarantia = tiempoGarantia;
	}

}
