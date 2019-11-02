package exercise1_Visitor;

public class Gato implements IAnimal {
	public String nombre;
	public int edad;
	public ListaEnfermedades enfermedad;

	public Gato(String nombre, int edad, ListaEnfermedades enfermedad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.enfermedad = enfermedad;
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

	public ListaEnfermedades getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(ListaEnfermedades enfermedad) {
		this.enfermedad = enfermedad;
	}

	@Override
	public String accept(IVisitor visitor) {
		return visitor.visit(this);
	}

}
