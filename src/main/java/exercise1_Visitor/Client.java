package exercise1_Visitor;

public class Client {

	public static void main(String[] args) {
		Perro perro = new Perro("Scott", 5, ListaEnfermedades.Enfermedad1);
		Gato gato = new Gato("Pelusa", 2, ListaEnfermedades.Enfermedad2);
		Caballo caballo = new Caballo("Princesa", 8, ListaEnfermedades.Enfermedad1);
		
		Veterinario_Visitor visitor = new Veterinario_Visitor();
		
		perro.accept(visitor);
		gato.accept(visitor);
		caballo.accept(visitor);

	}

}
