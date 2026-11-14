package edu.westga.moneymanager.MoneyManager.view;

import edu.westga.moneymanager.MoneyManager.model.Transaction;
import edu.westga.moneymanager.MoneyManager.viewmodel.LogWindowViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.time.LocalDateTime;

/**
 * Provides the view for the log of transactions.
 * 
 * @author Demetrius McCants
 * @version 1.0
 */
public class LogWindow {
	@FXML
	private ListView<Transaction> logListView;
	@FXML
	private LogWindowViewModel logViewModel;
	@FXML
	private TextField amountInput;
	@FXML
	private TextField descriptionInput;

	/**
	 * Instantiates the fields.
	 * 
	 * @precondition none.
	 * @postcondition the fields are instantiated.
	 */
	@FXML
	public void initialize() {
		this.logViewModel = new LogWindowViewModel();
		this.logListView.setItems(this.logViewModel.getObservableLog());
	}

	/**
	 * Adds the income to the transaction log when the user pressed the 'Add Income'
	 * button.
	 * 
	 * @param event the user clicking the button
	 * @precondition none.
	 * @postcondition the income is added.
	 */
	public void handleAddIncome(ActionEvent event) {
		try {
			double amount = Double.parseDouble(this.amountInput.getText());
			String description = this.descriptionInput.getText();
			Transaction newIncome = new Transaction(amount, LocalDateTime.now(), description, "Income");

			this.logViewModel.addTransaction(newIncome);

			this.amountInput.clear();
			this.descriptionInput.clear();
		} catch (NumberFormatException theException) {
			System.err.println("Amount must be a valid number.");
		} catch (IllegalArgumentException theException) {
			System.err.println(theException.getMessage());
		}
	}

	/**
	 * Adds the expense to the transaction log when the user pressed the 'Add
	 * Expense' button.
	 * 
	 * @param event the user clicking the button
	 * @precondition none.
	 * @postcondition the expense is added.
	 */
	public void handleAddExpense(ActionEvent event) {
		try {
			double amount = Double.parseDouble(this.amountInput.getText());
			String description = this.descriptionInput.getText();
			Transaction newExpense = new Transaction(amount, LocalDateTime.now(), description, "Expense");

			this.logViewModel.addTransaction(newExpense);

			this.amountInput.clear();
			this.descriptionInput.clear();
		} catch (NumberFormatException theException) {
			System.err.println("Amount must be a valid number.");
		} catch (IllegalArgumentException theException) {
			System.err.println(theException.getMessage());
		}
	}

}
