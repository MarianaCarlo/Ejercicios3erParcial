package exercise4_Proxy;

public class Proxy implements IServer {
	private ServerPrimario serverPrimario = null;
	private ServerSecundario serverSecundario = null;
	private Persona persona;

	public Proxy(Persona persona) {
		super();
		this.persona = persona;
	}

	@Override
	public void descargar() {
		if (serverPrimario == null && serverSecundario == null) {
			this.serverPrimario = new ServerPrimario(persona);
			this.serverSecundario = new ServerSecundario(serverPrimario);
		}
		
		if (persona.getTipo() == ".zip" || persona.getTipo() == ".rar") {
			this.serverPrimario.descargar();
			this.serverSecundario.descargar();
		} else {
			System.out.println("-------------------------------------------------------");
			System.out.println(persona.getNombre() + " los archivos con extension: " + persona.getTipo() + " no son soportados por el servidor");
			System.out.println("Utiliza la extension: .zip o .rar");
		}
	}

	@Override
	public void cargar() {
		if (serverPrimario == null && serverSecundario == null) {
			this.serverPrimario = new ServerPrimario(persona);
			this.serverSecundario = new ServerSecundario(serverPrimario);
		}
		
		if (persona.getTipo() == ".zip" || persona.getTipo() == ".rar") {
			this.serverPrimario.cargar();
			this.serverSecundario.cargar();
		} else {
			System.out.println(persona.getNombre() + " los archivos con extension: " + persona.getTipo() + " no son soportados por el servidor");
			System.out.println("Utiliza la extension: .zip o .rar");
		}
	}

}
