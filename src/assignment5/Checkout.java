package assignment5;
import java.util.*;

public class Checkout {
	private Vector<DessertItem> di;
	private DessertShoppe ds = new DessertShoppe();
	
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
		return (int) Math.round(totalCost() * ds.taxRate);
		
	}
	
	@Override
	public String toString() {
		String s = ds.lenFilling(ds.storeName+"Dessert Shoppe", ds.nameSizeMax + ds.costLen);
		s += "\n" + ds.lenFilling("--------------------", ds.nameSizeMax + ds.costLen);
		s += "\n";
		
		for (DessertItem i : di) {
			s += i;
		}

		s += "\n";		
				
		s += "\n" + ds.lenFilling("Tax");
		int tax = totalTax();
		s += ds.lenFilling(tax);

		
		s += "\n" + ds.lenFilling("Total Cost");
		int totalCost = totalCost() + totalTax();
		s += ds.lenFilling(totalCost);
		

		return s;
	}
	
	
	

}
