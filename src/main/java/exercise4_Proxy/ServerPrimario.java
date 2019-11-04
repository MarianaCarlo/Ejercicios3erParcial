package exercise4_Proxy;

public class ServerPrimario implements IServer {
	Persona persona;
	
	public ServerPrimario(Persona persona) {
		super();
		this.persona = persona;
	}

	@Override
	public void descargar() {
		System.out.println("---------------------------------------------");
		System.out.println("Request real subject descargar: " + this.persona.getNombre() + " estas descargando el archivo " + this.persona.getArchivoNombre() + this.persona.getTipo());
	}

	@Override
	public void cargar() {
		System.out.println("---------------------------------------------");
		System.out.println("Request real subject cargar: " + this.persona.getNombre() + " estas cargando el archivo " + this.persona.getArchivoNombre() + this.persona.getTipo());
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	

}
