package exercise2_Adapter;

public class Refrigiradores implements ArtefactosElectronicosB {
	private int costo;
	private int tiempoGarantia;
	private int tiempoAprox = 14;

	public Refrigiradores(int costo) {
		super();
		this.costo = costo;
	}

	@Override
	public int calcularTiempoDeVida() {
		int res = 0;
		if (this.getTiempoGarantia() >= 0 && this.getTiempoGarantia() <= 3) {
			res = tiempoAprox;
		} else if (this.getTiempoGarantia() > 3 && this.getTiempoGarantia() < 6) {
			res = tiempoAprox - 4;
		} else if (this.getTiempoGarantia() > 6 && this.getTiempoGarantia() < 10) {
			res = tiempoAprox - 8;
		} else {
			res = tiempoAprox - 12;
		}
		return res;
	}

	public int getCosto() {
		return costo;
	}

	public int getTiempoGarantia() {
		return tiempoGarantia;
	}

	public void setTiempoGarantia(int tiempoGarantia) {
		System.out.println("El costo del refrigirador es: " + this.getCosto());
		this.tiempoGarantia = tiempoGarantia;
	}

}
