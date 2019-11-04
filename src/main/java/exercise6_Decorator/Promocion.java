package exercise6_Decorator;

public class Promocion extends Decorator {
	private int monto;
	public Promocion(ICuenta cuenta) {
		super(cuenta);
	}
	
	public void operation() {
		int duplicar = 0;
		super.operation();
		addedBehavior();
		int res = (int)(Math.random()*10+1);;
		if (res %2 ==0) {
			duplicar = this.getMonto()*2;
			System.out.println("Promocion, el valor randomico es: " + res + ", entonces se duplica el monto a: "+duplicar);
		} else {
			duplicar = this.getMonto();
			System.out.println("Promocion, el valor randomico es: " + res + ", entonces no se duplica el monto: "+duplicar);
		}
		
	}

	public void addedBehavior() {
		System.out.println("-----------------------------------------------");
		System.out.println("Add new Behavior of Promocion");
	}
	

	@Override
	public void setMonto(int monto) {
		this.monto = monto;
		
	}
	

}
