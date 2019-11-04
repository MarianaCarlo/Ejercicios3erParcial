package exercise6_Decorator;

public class BancaBasica implements ICuenta {
	public int monto;
	private String nombrePropietario;

	public BancaBasica(int monto, String nombrePropietario) {
		super();
		this.monto = monto;
		this.setMonto(monto);
		this.nombrePropietario = nombrePropietario;
	}

	@Override
	public void operation() {
		System.out.println(
				"Operation component cuenta de: " + this.getNombrePropietario() + " con monto de: " + this.getMonto());
	}

	@Override
	public int getMonto() {
		return monto;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	@Override
	public void setMonto(int monto) {
		this.monto = monto;

	}

}
