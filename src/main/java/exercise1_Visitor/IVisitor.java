package exercise1_Visitor;

public interface IVisitor {
	public String visit (Perro perro);
	public String visit (Gato gato);
	public String visit (Caballo caballo);
}
