package edu.westga.moneymanager.MoneyManager.model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

/**
 * Test class for the four parameter constructor of the Transaction class.
 * 
 * @author Demetrius McCants
 * @version 1.0
 */
public class TransactionWhenMakeTransactionTest {

	@Test
	public void testWhenCreatingValidTransaction() {
		Transaction testTransaction = new Transaction(7.06, LocalDateTime.of(2026, 12, 25, 16, 30), "This is a test.",
				"Expense");
		assertEquals(7.06, testTransaction.getAmount(), .001);
		assertEquals(LocalDateTime.of(2026, 12, 25, 16, 30), testTransaction.getDateTime());
		assertEquals("This is a test.", testTransaction.getDescription());
		assertEquals("Expense", testTransaction.getType());
		assertEquals("[Expense] 12/25/2026 04:30 PM | $7.06 - This is a test.", testTransaction.toString());
	}

	@Test
	public void testWhenCreatingTransactionWithInvalidAmount() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Transaction(-5.50, LocalDateTime.now(), "test", "Expense");
		});
	}

	@Test
	public void testWhenCreatingTransactionWithNullDescription() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Transaction(5.50, LocalDateTime.now(), null, "Expense");
		});
	}

	@Test
	public void testWhenCreatingTransactionWithEmptyDescription() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Transaction(5.50, LocalDateTime.now(), "", "Expense");
		});
	}

	@Test
	public void testWhenCreatingTransactionWithNullType() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Transaction(5.50, LocalDateTime.now(), "test", null);
		});
	}

	@Test
	public void testWhenCreatingTransactionWithEmptyType() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Transaction(5.50, LocalDateTime.now(), "test", "");
		});
	}

}
