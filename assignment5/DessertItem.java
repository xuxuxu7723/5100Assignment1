package assignment5;

public abstract class DessertItem {
	//field
	protected String name;
	
	
	//constructor
	public DessertItem() {	
	}
	
	public DessertItem(String name) {
		this.name = name;
	}
	
	//method
	public final String getName() {
		return name;
	}

	public abstract int getCost();
}
