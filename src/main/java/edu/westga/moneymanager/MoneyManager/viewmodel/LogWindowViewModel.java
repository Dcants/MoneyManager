package edu.westga.moneymanager.MoneyManager.viewmodel;

import edu.westga.moneymanager.MoneyManager.model.Transaction;
import edu.westga.moneymanager.MoneyManager.model.TransactionManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Manages the model of the view for the LogWindow.
 * 
 * @author Demetrius McCants
 * @version 1.0
 */
public class LogWindowViewModel {
	private TransactionManager manager;
	private ObservableList<Transaction> observableLog;

	/**
	 * Instantiates the manager and log fields.
	 * 
	 * @precondition none.
	 * @postcondition the LogWindowViewModel is made.
	 */
	public LogWindowViewModel() {
		this.manager = new TransactionManager();
		this.observableLog = FXCollections.observableArrayList(this.manager.getTransactions());

	}

	/**
	 * Gets the observable log.
	 * 
	 * @precondition none.
	 * @return the observable log.
	 */
	public ObservableList<Transaction> getObservableLog() {
		return this.observableLog;
	}

	/**
	 * Adds transactions and updates the observable list.
	 * 
	 * @param transaction the transaction to be added.
	 * @precondition transaction cannot be null.
	 * @postcondition the transaction is added and the list is updated.
	 */
	public void addTransaction(Transaction transaction) {
		this.manager.addTransaction(transaction);
		this.observableLog.setAll(this.manager.getTransactions());
	}

}
