package exercise3_Bridge;

public class Dolares implements IMoneda {
	public int monto;
	public double res = 0;
	public Dolares(int monto) {
		super();
		this.monto = monto;
	}

	@Override
	public double usarMoneda() {
		System.out.println("Usando dolar");
		res = this.getMonto()*7;
		System.out.println("El monto en bolivianos de "+this.getMonto() + " dolares es: "+res);
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
