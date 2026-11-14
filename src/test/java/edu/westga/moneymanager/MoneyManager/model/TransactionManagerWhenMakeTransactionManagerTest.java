package edu.westga.moneymanager.MoneyManager.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test class for the constructor of the TransactionManager class.
 * @author Demetrius McCants
 * @version 1.0
 */
public class TransactionManagerWhenMakeTransactionManagerTest {

	@Test
	public void testWhenMakingValidTransactionManager() {
		TransactionManager testManager = new TransactionManager();
		assertEquals(0, testManager.getTransactions().size());
	}

}
