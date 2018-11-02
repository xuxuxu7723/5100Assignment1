package assignment7;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Question3Test {

	@Test
	void testsetStrength() {
		Tool t = new Tool();
		t.setStrength(55);
		assertEquals(55,t.strength);
	}

	@Test
	void testfight() {
		Paper p = new Paper(7);
		Rock r = new Rock(15);
		assertEquals(false,p.fight(r));
	}

}
