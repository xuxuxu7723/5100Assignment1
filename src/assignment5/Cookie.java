package assignment5;

public class Cookie extends DessertItem {
	protected int number;
	protected double pricePerDozen;
	
	public Cookie() {
		// TODO Auto-generated constructor stub
	}

	public Cookie(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public Cookie(String name, int number, double pricePerDozen) {	
		this.name = name;
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}
	
	@Override
	public int getCost() {
		return (int) Math.round(number * pricePerDozen / 12);
	}
	
	@Override
	public String toString() {
		String s = "";
		s += "\n" + number + " @ " + pricePerDozen + " /dz.";
		s += "\n" + DessertShoppe.lenFilling(name);
		s += DessertShoppe.lenFilling(getCost());
		return s;
		
	}
}
