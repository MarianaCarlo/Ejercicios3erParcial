package exercise4_Proxy;

public class Persona {
	private String nombre;
	private String archivoNombre;
	private String tipo;

	public Persona(String nombre, String archivoNombre, String tipo) {
		super();
		this.nombre = nombre;
		this.archivoNombre = archivoNombre;
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArchivoNombre() {
		return archivoNombre;
	}

	public void setArchivoNombre(String archivoNombre) {
		this.archivoNombre = archivoNombre;
	}

}
