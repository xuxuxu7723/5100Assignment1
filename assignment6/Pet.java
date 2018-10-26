package assignment6;

public class Pet {
	public static final int FEMALE = 4;
	public static final int MALE = 1;
	public static final int SPAYED = 2;
	public static final int NEUTERED = 3;
	
	
	private String petName;
	private String ownerName;
	private String color;
	protected int sexID;
	
	
	public Pet (String name, String ownerName, String color) {
		petName = name;
		this.ownerName = ownerName;
		this.color = color;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setSex(int sexid) {
		sexID = sexid;
	}
	
	public String getSex() {
		switch (sexID) {
		case FEMALE:
			return "FEMALE";
		case MALE:
			return "MALE";
		case SPAYED:
			return "SPAYED";
		case NEUTERED:
			return "NEUTERED";
		}
		return "invalid input";
	}
	
	@Override
	public String toString() {
		return petName + " owned by " + ownerName + "\nColor: " + color + "\nSex: " + getSex();
	}
	
}
