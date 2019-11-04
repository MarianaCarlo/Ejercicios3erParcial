package exercise5_Composite;

import java.util.ArrayList;

public class Composite extends Component {
	private ArrayList<Component> list = new ArrayList<>();

	public Composite(String name) {
		super(name, 0);
		
	}

	@Override
	public void imprimir() {
		System.out.println(this.getName() + " " + this.getEstimacion());
		for (Component comp : list) {
			if (list.size()<=2) {
				this.todo();
				break;
			} else {
			comp.imprimir();
			}
		}
	}

	@Override
	public void add(Component component) {
		list.add(component);
		this.setEstimacion(getEstimacion() + component.getEstimacion());
	}
	public void todo() {
		if (list.size()<=2) {
			System.out.println("No puedes ponerlo en el " + this.getName());
			System.out.println("Necesitas 3 minimo");
		}
	}
	@Override
	public void remove(Component component) {
		list.remove(component);
	}

	@Override
	public void getChild(int position) {
		System.out.println(list.get(position));
	}

}
