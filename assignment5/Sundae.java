package assignment5;

public class Sundae extends IceCream {

	int cost;
	String Name;
	public Sundae() {
		// TODO Auto-generated constructor stub
	}

	public Sundae(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Sundae(String name, int cost) {
		super(name, cost);
		// TODO Auto-generated constructor stub
	}
	
	public Sundae(String iceCream, int iceCreamCost, String sundae, int sundaeCost) {
		this.Name = sundae;
		super.name = iceCream;
		super.cost = iceCreamCost;
		this.cost = sundaeCost;
		
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.cost + super.cost;
	}
	
	@Override
	public String toString() {
		String s = "\n" + Name + " sundae with "; 
		s += "\n" + DessertShoppe.lenFilling(super.name);
		s += DessertShoppe.lenFilling(getCost());
		return s;
		
	}
}
