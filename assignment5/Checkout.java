package assignment5;
import java.util.*;

public class Checkout {
	private Vector<DessertItem> di;
	//private DessertShoppe ds = new DessertShoppe();
	
	public Checkout() {
		// TODO Auto-generated constructor stub
		 di =new Vector<DessertItem> ();
	}
	
	public int numberOfItems() {
		return di.size();
	}
	
	public void enterItem(DessertItem item) {
		di.addElement(item);
	}
	
	public void clear() {
		di.clear();
	}
	
	public int totalCost() {
		int totalCost = 0;
		for (DessertItem i : di) {
			totalCost += i.getCost();
		}
		return totalCost;
	}
	
	public int totalTax() {
		return (int) Math.round(totalCost() * DessertShoppe.taxRate);
		
	}
	
	@Override
	public String toString() {
		String s = DessertShoppe.lenFilling(DessertShoppe.storeName+"Dessert Shoppe", DessertShoppe.nameSizeMax + DessertShoppe.costLen);
		s += "\n" + DessertShoppe.lenFilling("--------------------", DessertShoppe.nameSizeMax + DessertShoppe.costLen);
		s += "\n";
		
		for (DessertItem i : di) {
			s += i;
		}

		s += "\n";		
				
		s += "\n" + DessertShoppe.lenFilling("Tax");
		int tax = totalTax();
		s += DessertShoppe.lenFilling(tax);

		
		s += "\n" + DessertShoppe.lenFilling("Total Cost");
		int totalCost = totalCost() + totalTax();
		s += DessertShoppe.lenFilling(totalCost);
		

		return s;
	}
	
	
	

}
