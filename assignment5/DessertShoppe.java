package assignment5;

public class DessertShoppe {
	final String storeName = "M & M";
	final double taxRate = 0.065;
	final static int nameSizeMax = 30;
	final static int costLen = 10;
	
	public DessertShoppe () {
	}
	
	public static String cents2dollarsAndCentsmethod(int cost) {
		String d = "";
		if (cost / 100 != 0) {
			d += cost / 100;
		}
		d = d + "." + (cost % 100);
		
		return d;
	}
	
	public static String lenFilling(String ori, int maxLen) {
		String s = "";
		int len = ori.length();
		int halfLen = len / 2;
		while (halfLen < maxLen/2) {
			s += " ";
			halfLen ++;
		}
		s += ori;
		len = s.length();
		
		while (len < maxLen) {
			s += " ";
			len += 1;
		}
		
		return s;
	}	
	
	public static String lenFilling(int ori) {
		String dollarsAndCents = cents2dollarsAndCentsmethod(ori);
		String s = "";
		int len = dollarsAndCents.length();
		while (len < costLen) {
			s += " ";
			len ++;
		}
		s += dollarsAndCents;
		
		return s;
	}
	
	public static String lenFilling(String ori) {
		String s = ori;
		int len = ori.length();
		while (len < nameSizeMax) {
			s += " ";
			len ++;
		}
		
		return s;
	}	
	
	
}
