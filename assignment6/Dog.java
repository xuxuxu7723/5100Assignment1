package assignment6;

public class Dog extends Pet implements Boardable {
	String size;
	private int mmStart;
	private int ddStart;
	private int yyyyStart;
	private int mmEnd;
	private int ddEnd;
	private int yyyyEnd;

	public Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.size = size;
		// TODO Auto-generated constructor stub
	}
	
	public String getSize() {
		return size;
	}
	
	@Override
	public String toString() {
		return "DOG:\n" + super.toString() + "\nSize: " + getSize();
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		// TODO Auto-generated method stub
		if (month > 0 && month < 13 && day > 0 && day < 32 && year > 999 && year <10000) {
			mmStart = month;
			ddStart = day;
			yyyyStart = year;
		}
		else {
			System.out.println("the start date you input is invalid");
		}
	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		// TODO Auto-generated method stub
		if (month > 0 && month < 13 && day > 0 && day < 32 && year > 999 && year <10000) {
			mmEnd = month;
			ddEnd = day;
			yyyyEnd = year;
		}
		else {
			System.out.println("the end date you input is invalid");
		}
	}

	@Override
	public boolean boarding(int month, int day, int year) {
		// TODO Auto-generated method stub
		if (mmEnd == 0 || mmStart == 0 || ddEnd ==0 || ddStart == 0 || yyyyEnd == 0 || yyyyStart ==0 ) {
			return false;
		}
		if (month > 0 && month < 13 && day > 0 && day < 32 && year > 999 && year <10000) {
		if (year < yyyyStart || year > yyyyEnd)
			return false;
		
		if (year == yyyyStart) {
			if (month < mmStart) {
				return false;
			}
			else if (month == mmStart) {
				if (day < ddStart)
					return false;
			}
		}
		
		if (year == yyyyEnd) {
			if (month > mmEnd) {
				return false;
			}
			else if (month == mmEnd) {
				if (day > ddEnd)
					return false;
			}
		}
		return true;
		}
		else {
			System.out.println("the boarding date you input is invalid");
			return false;
		}
	}

}
