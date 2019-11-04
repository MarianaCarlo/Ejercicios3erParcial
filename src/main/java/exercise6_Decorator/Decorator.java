package exercise6_Decorator;

public abstract class Decorator implements ICuenta {
	private ICuenta cuenta;
	public int monto;

	public Decorator(ICuenta cuenta) {
		super();
		this.cuenta = cuenta;
	}

	@Override
	public void operation() {
		cuenta.operation();
	}

	@Override
	public int getMonto() {
		return cuenta.getMonto();
	}
	
	@Override
	public void setMonto(int monto) {
		this.monto = monto;
		
	}

}
