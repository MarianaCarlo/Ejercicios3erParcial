package exercise3_Bridge;

public class Bolivianos implements IMoneda {

	public int monto;
	public double res = 0;
	public Bolivianos(int monto) {
		super();
		this.monto = monto;
	}

	@Override
	public double usarMoneda() {
		System.out.println("Usando Bolivianos");
		res = this.getMonto();
		System.out.println("El monto en bolivianos de "+this.getMonto() + " bolivianos es: "+res);
		this.setRes(res);
		return res;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public double getRes() {
		return res;
	}

	public void setRes(double res) {
		this.res = res;
	}
	

}
