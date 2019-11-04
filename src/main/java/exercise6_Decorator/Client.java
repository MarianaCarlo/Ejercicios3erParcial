package exercise6_Decorator;

public class Client {

	public static void main(String[] args) {
		/*
		 * En este ejercicio se tiene una cuenta de banco basica donde tiene un monto
		 * y el nombre de la persona, se las puede decorar con: Banca por Internet; donde 
		 * es un boolean si se quiere tener o no esta banca, Seguro de la cuenta donde se tiene 
		 * un interes del 5% del monto total y/o Promocion donde se tiene un numero randomico,
		 * si es par se duplica el monto inicial, si es impar se queda con el monto inicial.
		 * */
		ICuenta basic = new BancaBasica(70, "Mariana");
		basic = new BancaPorInternet(basic, false);
		basic = new SeguroCuenta(basic);
		basic = new Promocion(basic);
		basic.operation();
	}

}
