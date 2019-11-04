package exercise3_Bridge;

public class Euros implements IMoneda {
	public int monto;
	public double res = 0;
	public Euros(int monto) {
		super();
		this.monto = monto;
	}

	@Override
	public double usarMoneda() {
		System.out.println("Usando Euros");
		res = (this.getMonto()*7.72);
		System.out.println("El monto en bolivianos de "+this.getMonto() + " euros es: "+res);
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
