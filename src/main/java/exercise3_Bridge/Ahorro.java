package exercise3_Bridge;

public class Ahorro implements ICuenta {
	private IMoneda moneda;
	public int interes = 2;

	public Ahorro(IMoneda moneda) {
		super();
		this.moneda = moneda;
	}

	@Override
	public void tipoDeCuenta() {
		double res = 0;
		System.out.println("-------------------------------------------");
		System.out.println("Usando ahorro");
		res = (interes * this.moneda.usarMoneda()) / 100.0;
		System.out.println("El interes del 2% es: " + res);

	}

}
