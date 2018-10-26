package assignment6;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAccount {

	
	@Test
	void testDebitTransaction() {
		Account ac1 = new Account("John", "Smith", 100);
		ac1.DebitTransaction(30.25);
		assertEquals("$69.75",String.format("$%.2f", ac1.CurBalance));
	}
	
	@Test
	void testCreditTransaction() {
		Account ac1 = new Account("John", "Smith", 100);
		ac1.DebitTransaction(30.25);
		ac1.CreditTransaction(10.10);
		assertEquals("$79.85",String.format("$%.2f", ac1.CurBalance));
	}

}
