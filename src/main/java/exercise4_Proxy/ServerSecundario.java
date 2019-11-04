package exercise4_Proxy;

public class ServerSecundario implements IServer {
	ServerPrimario server;
	
	public ServerSecundario(ServerPrimario server) {
		super();
		this.server = server;
	}

	@Override
	public void descargar() {
		System.out.println("Request real subject descargar: En SERVER SECUNDARIO descaragndo el archivo: " + this.getServer().getPersona().getArchivoNombre()+this.getServer().getPersona().getTipo());
	}

	@Override
	public void cargar() {
		System.out.println("Request real subject cargar: En SERVER SECUNDARIO cargando el archivo: " + this.getServer().getPersona().getArchivoNombre()+this.getServer().getPersona().getTipo());
	}

	public ServerPrimario getServer() {
		return server;
	}

	public void setServer(ServerPrimario server) {
		this.server = server;
	}
	
}
