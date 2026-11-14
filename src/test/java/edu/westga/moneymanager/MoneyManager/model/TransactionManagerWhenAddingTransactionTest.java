package edu.westga.moneymanager.MoneyManager.model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

/**
 * Test class for the addTransaction method in the TransactionManager class.
 * @author Demetrius McCants
 * @version 1.0
 */
public class TransactionManagerWhenAddingTransactionTest {

	@Test
	public void testWhenAddingOneTransaction() {
		TransactionManager testManager = new TransactionManager();
		testManager.addTransaction(new Transaction(4.05, LocalDateTime.now(), "test transaction"));
		assertEquals(1, testManager.getTransactions().size());
	}
	
	@Test
	public void testWhenAddingThreeTransactions() {
		TransactionManager testManager = new TransactionManager();
		Transaction testTransaction = new Transaction(5.50, LocalDateTime.now(), "this transaction should be at index 2.");
		testManager.addTransaction(new Transaction(4.05, LocalDateTime.now(), "test transaction"));
		testManager.addTransaction(new Transaction(4.05, LocalDateTime.now(), "test transaction"));
		testManager.addTransaction(testTransaction);
		assertEquals(testTransaction, testManager.getTransactions().get(2));
	}

}
