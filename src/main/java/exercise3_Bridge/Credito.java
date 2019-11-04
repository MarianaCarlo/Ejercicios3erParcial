package exercise3_Bridge;

public class Credito implements ICuenta {
	private IMoneda moneda;

	public Credito(IMoneda moneda) {
		super();
		this.moneda = moneda;
	}

	@Override
	public void tipoDeCuenta() {
		double res = 0;
		System.out.println("-------------------------------------------");
		System.out.println("Usando credito");
		System.out.println("El credito es: " + this.moneda.usarMoneda());

	}

}
