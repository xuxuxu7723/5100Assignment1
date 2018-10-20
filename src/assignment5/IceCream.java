package assignment5;

public class IceCream extends DessertItem {

	protected int cost;
	
	public IceCream() {
		// TODO Auto-generated constructor stub
	}

	public IceCream(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public IceCream(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

	@Override
	public String toString() {
		String s ="\n" + DessertShoppe.lenFilling(name);
		s += DessertShoppe.lenFilling(getCost());
		return s;
		
	}	
}
