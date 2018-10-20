package assignment5;

public class Candy extends DessertItem {
	protected double weight;
	protected double pricePerPound;
	
	public Candy() {
		// TODO Auto-generated constructor stub
	}

	public Candy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public Candy(String name, double weight, double pricePerPound) {	
		this.name = name;
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}
	
	@Override
	public int getCost() {
		return (int)Math.round(weight * pricePerPound);
	}
	
	@Override
	public String toString() {
		String s = "";
		s += "\n" + weight + " lbs. @ " + pricePerPound + " /lb.";
		s += "\n" + DessertShoppe.lenFilling(name);
		s += DessertShoppe.lenFilling(getCost());
		return s;
		
	}
}
