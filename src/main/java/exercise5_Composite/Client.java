package exercise5_Composite;

public class Client {

	public static void main(String[] args) {
		/*
		 * En este ejercicio se tiene compuradora que tienen nombre y precio, donde se 
		 * quiere que este en un laboratio, tambien exiten contenedores que contienen
		 * estos laboratios y se suman los precios de cada uno, como por ejemplo:
		 *  Contenedores 900
		 *	    Laboratorio 300
		 *	    Laboratorio 300
		 *	    Laboratorio 300
		 *	Laboratorio: 300
		 *	    Computadora 100
		 *	    Computadora 100
		 *	  	Computadora 100
		 * 
		 * */
		Composite laboratorio = new Composite("my labo");
		laboratorio.add(new Computadora("mi compu1", 100));
		laboratorio.add(new Computadora("mi compu2", 100));
		laboratorio.add(new Computadora("mi compu3", 100));
		
		Composite contenedor = new Composite("my contenedor");
		contenedor.add(laboratorio);
		contenedor.add(laboratorio);
		contenedor.add(laboratorio);
		
		contenedor.imprimir();
	}

}
