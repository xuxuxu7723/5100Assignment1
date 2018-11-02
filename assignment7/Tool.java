package assignment7;

public class Tool {
	protected int strength;
	protected char type;
	
	public void setStrength(int str) {
		this.strength = str;
	}
}

class Scissors extends Tool {
	public Scissors (int strength) {
		super.setStrength(strength);
		super.type = 's';
	}
	
	public boolean fight(Tool t) {
		if (t instanceof Paper) {
			this.strength *= 2;
		}
		if (t instanceof Rock) {
			t.strength *= 2;
		}
		
		if (this.strength >= t.strength)
		return true;
		else {
			return false;
		} 
	}
}

class Paper extends Tool {
	public Paper (int strength) {
		super.setStrength(strength);
		super.type = 'p';
	}
	public boolean fight(Tool t) {
		if (t instanceof Scissors) {
			t.strength *= 2;
		}
		if (t instanceof Rock) {
			this.strength *= 2;
		}
		
		if (this.strength >= t.strength)
		return true;
		else {
			return false;
		}
	}


}

class Rock extends Tool {
	public Rock (int strength) {
		super.setStrength(strength);
		super.type = 'r';
	}
	public boolean fight(Tool t) {
		if (t instanceof Paper) {
			this.strength *= 2;
		}
		if (t instanceof Scissors) {
			t.strength *= 2;
		}
		
		if (this.strength >= t.strength)
		return true;
		else {
			return false;
		}
	}
}



