package exercise3_Bridge;

public class Client {

	public static void main(String[] args) {
		/*
		 * En este ejercicio se tiene monedas: bolivianos, dolares y euros,
		 * donde se quiere realizar acciones de cuenta como: ahorro, plazo fijo y
		 * credito, si realiza aluna accion en dolares o euros se realiza una conversion
		 * a bolivianos 
		 * */
		Bolivianos bolivianos = new Bolivianos(70);
		Dolares dolar = new Dolares(70);
		Euros euros = new Euros(50);
		
		Ahorro ahorro = new Ahorro(euros);
		PlazoFijo plazo = new PlazoFijo(bolivianos);
		Credito credito = new Credito(dolar);
		
		ahorro.tipoDeCuenta();
		plazo.tipoDeCuenta();
		credito.tipoDeCuenta();

	}

}
