package assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCandy {

	@Test
	void testCandy() {
		Candy candy = new Candy("Salt Water Taffy", 1.5, 209);
		assertEquals("Salt Water Taffy",candy.getName());
	}
	@Test
	void testToString() {
		Candy candy = new Candy("Salt Water Taffy", 1.5, 209);
		assertEquals("\n1.5 lbs. @ 209.0 /lb.\n" + "Salt Water Taffy                    3.14",candy.toString());
	}
}
