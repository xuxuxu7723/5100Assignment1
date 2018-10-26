package assignment6;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCheckingAccount {

	@Test
	void testCheckingAccount() {
		CheckingAccount ca = new CheckingAccount("Steve", "Jobs", 50);
		assertEquals("Account name: Steve Jobs, Account Type: assignment6.CheckingAccount, Balance: $50.00",ca.toString());
	}
	
	@Test
	void testDebitTransaction() {
		CheckingAccount ch1 = new CheckingAccount("Steve", "Jobs", 50);
		ch1.DebitTransaction(0.25);
		assertEquals("$39.75",String.format("$%.2f", ch1.CurBalance));
	}
	
	@Test
	void testCreditTransaction() {
		CheckingAccount ch1 = new CheckingAccount("Steve", "Jobs", 50);
		ch1.DebitTransaction(0.25);
		ch1.CreditTransaction(7.00);
		assertEquals("$36.75",String.format("$%.2f", ch1.CurBalance));
	}

}
