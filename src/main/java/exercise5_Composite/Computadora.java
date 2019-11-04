package exercise5_Composite;

public class Computadora extends Component {

	public Computadora(String name, int estimacion) {
		super(name, estimacion);
	}

	@Override
	public void imprimir() {
		System.out.println("\t" + this.getName() + " "+ this.getEstimacion());
	}

	@Override
	public void add(Component component) {
		System.out.println("not applicable on Computadora");
	}

	@Override
	public void remove(Component component) {
		System.out.println("not applicable on Computadora");
	}

	@Override
	public void getChild(int position) {
		System.out.println(this.getEstimacion());
	}

}
