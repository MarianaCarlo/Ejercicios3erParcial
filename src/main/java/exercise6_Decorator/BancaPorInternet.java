package exercise6_Decorator;

public class BancaPorInternet extends Decorator {
	private boolean enable;
	public int monto;
	
	public BancaPorInternet(ICuenta cuenta, boolean enable) {
		super(cuenta);
		this.enable = enable;
	}
	
	public void operation() {
		super.operation();
		addedBehavior();
		System.out.println("Banca por Internet: " + this.isEnable());
	}

	public void addedBehavior() {
		System.out.println("-----------------------------------------------");
		System.out.println("Add new Behavior of Banca por Internet");
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
	@Override
	public void setMonto(int monto) {
		this.monto = monto;
		
	}
	
}
