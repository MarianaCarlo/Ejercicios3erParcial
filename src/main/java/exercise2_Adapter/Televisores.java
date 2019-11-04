package exercise2_Adapter;

public class Televisores implements ArtefactosElectronicosB {
	private int costo;
	private int tiempoGarantia;
	private int tiempoAprox = 8;

	public Televisores(int costo) {
		super();
		this.costo = costo;
	}

	@Override
	public int calcularTiempoDeVida() {
		int res = 0;
		if (this.getTiempoGarantia() >= 0 && this.getTiempoGarantia() <= 2) {
			res = tiempoAprox;
		} else if (this.getTiempoGarantia() > 2 && this.getTiempoGarantia() < 5) {
			res = tiempoAprox - 3;
		} else if (this.getTiempoGarantia() > 4 && this.getTiempoGarantia() < 7) {
			res = tiempoAprox - 6;
		} else {
			System.out.println("El costo no es valido");
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
		System.out.println("El costo del televisor es: " + this.getCosto());
		this.tiempoGarantia = tiempoGarantia;
	}
}
