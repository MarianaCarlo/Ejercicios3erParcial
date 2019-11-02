package exercise1_Visitor;

public class Perro implements IAnimal {
	public String nombre;
	public int edad;
	public ListaEnfermedades enfermedades;

	public Perro(String nombre, int edad, ListaEnfermedades enfermedades) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.enfermedades = enfermedades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ListaEnfermedades getEnfermedades() {
		return enfermedades;
	}

	public void setEnfermedades(ListaEnfermedades enfermedades) {
		this.enfermedades = enfermedades;
	}

	@Override
	public String accept(IVisitor visitor) {
		return visitor.visit(this);
	}

}
