package edu.westga.moneymanager.MoneyManager.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Models transactions that go in and out of the money manager.
 * 
 * @author Demetrius McCants
 * @version 1.0
 */
public class Transaction {
	private double amount;
	private LocalDateTime dateTime;
	private String description;
	private String type;

	/**
	 * Creates transactions using an amount, date, and description of the
	 * transaction.
	 * 
	 * @param amount      the amount of the transaction.
	 * @param dateTime    the date & time at which the transaction occurred.
	 * @param description the description of what the transaction is.
	 * @param type        the type of transaction.
	 * @precondition amount cannot be less than or equal to 0.
	 * @precondition description cannot be null or empty.
	 * @postcondition a transaction with an amount, dateTime, and description has
	 *                been made.
	 */
	public Transaction(double amount, LocalDateTime dateTime, String description, String type) {
		if (amount <= 0) {
			throw new IllegalArgumentException("The amount cannot be less than or equal to 0.");
		}
		if (description == null) {
			throw new IllegalArgumentException("Description cannot be null.");
		}
		if (description.isEmpty()) {
			throw new IllegalArgumentException("Description cannot be empty.");
		}
		if (type == null) {
			throw new IllegalArgumentException("Type cannot be null.");
		}
		if (type.isEmpty()) {
			throw new IllegalArgumentException("Type cannot be empty.");
		}

		this.amount = amount;
		this.dateTime = dateTime;
		this.description = description;
		this.type = type;

	}

	/**
	 * Gets the amount of the transaction.
	 * 
	 * @precondition none.
	 * @return the amount of the transaction.
	 */
	public double getAmount() {
		return this.amount;
	}

	/**
	 * Gets the dateTime of the transaction.
	 * 
	 * @precondition none.
	 * @return the dateTime of the transaction.
	 */
	public LocalDateTime getDateTime() {
		return this.dateTime;
	}

	/**
	 * Gets the description of the transaction.
	 * 
	 * @precondition none.
	 * @return the description of the transaction.
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Gets the type of the transaction.
	 * 
	 * @precondition none.
	 * @return the transaction's type.
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * Provides a textual description of the transaction.
	 * 
	 * @precondition none.
	 * @return the description of the transaction.
	 */
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
		String formattedDate = this.dateTime.format(formatter);
		return "[" + this.type + "] " + formattedDate + " | $" + this.amount + " - " + this.description;
	}

}
