package edu.westga.moneymanager.MoneyManager.viewmodel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import edu.westga.moneymanager.MoneyManager.model.Transaction;

/**
 * Test class for the LogWindow of the viewmodel package.
 * @author Demetrius McCants
 * @version 1.0
 */
public class LogWindowViewModelTest {

    @Test
    public void testConstructorInitializesEmptyList() {
        LogWindowViewModel viewModel = new LogWindowViewModel();
        
        assertEquals(0, viewModel.getObservableLog().size(), "Checking that the observable list starts empty.");
    }

    @Test
    public void testAddTransactionSuccessfullyAddsToList() {
        LogWindowViewModel viewModel = new LogWindowViewModel();
        Transaction testTransaction = new Transaction(50.00, LocalDateTime.now(), "Groceries", "Expense");
        
        viewModel.addTransaction(testTransaction);
        
        assertEquals(1, viewModel.getObservableLog().size(), "Checking that the list size increased to 1.");
        assertEquals(testTransaction, viewModel.getObservableLog().get(0), "Checking that the exact transaction was stored.");
    }
}