package exercise2_Adapter;

public class Client {

	public static void main(String[] args) {
		/*
		 * En este ejercicio se adaptara los artefactos B a los artefactos A
		 * Para que se pueda calcular el tiempo de via de cada artefacto, los 
		 * artefactos que sean del tipo B enviaran su tiempo de garantia y de acuerdo
		 * a eso se adaptara a calcular al tiempo de vida
		 * */
		Celulares celular = new Celulares(100);
		Tablets tablet = new Tablets(50);
		Computadoras computadora = new Computadoras(500);
		
		Televisores televisor = new Televisores(200);
		Lavadoras lavadora = new Lavadoras(250);
		Refrigiradores refrigirador = new Refrigiradores(800);
		
		AdaptadorTelevisores adapatadorTelevisor = new AdaptadorTelevisores(televisor);
		AdaptadorLavadoras adaptadorLavadora = new AdaptadorLavadoras(lavadora);
		AdaptadorRefrigiradores adaptadorRefrigiradores = new AdaptadorRefrigiradores(refrigirador);
		
		celular.setTiempoDeVida(5);
		tablet.setTiempoDeVida(3);
		computadora.setTiempoDeVida(5);
		
		televisor.setTiempoGarantia(2);
		lavadora.setTiempoGarantia(3);
		refrigirador.setTiempoGarantia(5);
		
		System.out.println("-------------------------------------------");
		ArtefactosElectronicosA[] artefactos= {celular,tablet,computadora,adapatadorTelevisor,adaptadorLavadora,adaptadorRefrigiradores};
		for (ArtefactosElectronicosA artefactosA : artefactos) {
			System.out.println("Tiempo de vida del "+ artefactosA.nombre() + " artefacto es: "+ artefactosA.getTiempodeVida());
		}
	}

}
