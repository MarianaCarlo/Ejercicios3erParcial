package exercise3_Bridge;

public class PlazoFijo implements ICuenta {
	private IMoneda moneda;
	public int interes = 5;

	public PlazoFijo(IMoneda moneda) {
		super();
		this.moneda = moneda;
	}

	@Override
	public void tipoDeCuenta() {
		double res = 0;
		System.out.println("-------------------------------------------");
		System.out.println("Usando plazo fijo");
		res = (interes * this.moneda.usarMoneda()) / 100.0;
		System.out.println("El interes del 5% es: " + res);

	}

}
