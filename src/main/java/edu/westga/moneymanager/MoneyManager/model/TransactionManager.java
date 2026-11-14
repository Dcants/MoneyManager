package edu.westga.moneymanager.MoneyManager.model;

import java.util.ArrayList;

/**
 * Models the transaction manager that performs actions with the transactions.
 * 
 * @author Demetrius McCants
 * @version 1.0
 */
public class TransactionManager {
	private ArrayList<Transaction> transactions;

	/**
	 * Creates transaction managers to manage the transactions.
	 * 
	 * @precondition none.
	 * @postcondition a transaction manager is made.
	 */
	public TransactionManager() {
		this.transactions = new ArrayList<Transaction>();
	}

	/**
	 * Adds a transaction to the list.
	 * 
	 * @param transaction the transaction to be added.
	 * @precondition transaction can't be null.
	 * @postcondition the transaction was added to the list of transactions.
	 */
	public void addTransaction(Transaction transaction) {
		if (transaction == null) {
			throw new IllegalArgumentException("Transaction cannot be null.");
		}
		this.transactions.add(transaction);
	}

	/**
	 * Gets the log of transactions.
	 * 
	 * @precondition none.
	 * @return the list of transactions.
	 */
	public ArrayList<Transaction> getTransactions() {
		return new ArrayList<Transaction>(this.transactions);
	}

}
