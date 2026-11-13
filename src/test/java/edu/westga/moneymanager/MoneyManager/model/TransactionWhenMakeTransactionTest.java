package edu.westga.moneymanager.MoneyManager.model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

/**
 * Test class for the three parameter constructor of the Transaction class.
 * @author Demetrius McCants
 * @version 1.0
 */
public class TransactionWhenMakeTransactionTest {

	@Test
	public void testWhenCreatingValidTransaction() {
		Transaction testTransaction = new Transaction(7.06, LocalDateTime.of(2026, 12, 25, 16, 30), "This is a test.");
		assertEquals(7.06, testTransaction.getAmount(), .001);
		assertEquals(LocalDateTime.of(2026, 12, 25, 16, 30), testTransaction.getDateTime());
		assertEquals("This is a test.", testTransaction.getDescription());
	}

}
