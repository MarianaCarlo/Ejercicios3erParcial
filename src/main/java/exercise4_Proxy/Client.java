package exercise4_Proxy;

public class Client {

	public static void main(String[] args) {
		/*
		 * En este ejercicio se tiene Personas y servidores, el proxy es el intermediario
		 * que agarra la solicitud de la Persona, ya sea cargar o descargar algun archivo,
		 * SOLO se puede tener archivos con extension ".zip" o ".rar", si es otra extension
		 * no podrá realizar alguna accion. Cuando se realice la accion, se manda al servidor
		 * primario y tambien al servidor secundario
		 * */
		Persona persona1 = new Persona("Mariana", "documento", ".rar");
		Persona persona2 = new Persona("Andrea", "documento", ".docx");
		IServer proxy1 = new Proxy(persona1);
		IServer proxy2 = new Proxy(persona2);
		
		proxy1.cargar();
		proxy1.descargar();
		proxy2.descargar();

	}

}
