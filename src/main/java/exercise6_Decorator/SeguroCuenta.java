package exercise6_Decorator;

public class SeguroCuenta extends Decorator {
	public int monto;
	public int descuento = 5;

	public SeguroCuenta(ICuenta cuenta) {
		super(cuenta);
	}
	
	public void operation() {
		double res = 0;
		super.operation();
		addedBehavior();
		res = (this.getMonto()*descuento)/100.0;
		System.out.println("Seguro del "+this.getDescuento()+"% del monto " + this.getMonto() + " es: "+res);
		System.out.println("Descontando con el seguro el saldo es:" + (this.getMonto()-res));
	}

	public void addedBehavior() {
		System.out.println("-----------------------------------------------");
		System.out.println("Add new Behavior of Seguro de la cuenta");
	}
	

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	@Override
	public void setMonto(int monto) {
		this.monto = monto;
		
	}

}
