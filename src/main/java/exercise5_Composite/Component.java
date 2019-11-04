package exercise5_Composite;

public abstract class Component {
	private String name;
	private int estimacion;

	public Component(String name, int estimacion) {
		super();
		this.name = name;
		this.estimacion = estimacion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEstimacion() {
		return estimacion;
	}

	public void setEstimacion(int estimacion) {
		this.estimacion = estimacion;
	}
	
	public abstract void imprimir();
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract void getChild(int position);

}
