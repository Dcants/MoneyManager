package edu.westga.moneymanager.MoneyManager.view;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Code behind class for the LoginWindow fxml file.
 * 
 * @author Demetrius McCants
 * @version 1.0
 */
public class LoginWindow {

	@FXML
	private TextField usernameInput;
	@FXML
	private PasswordField passwordInput;
	@FXML
	private Label errorLabel;

	/**
	 * Verifies the credentials then sends the user to the LogWindow page once confirmed.
	 * @param event the use clicking the login button.
	 * @precondition none.
	 * @postcondition the user is either told to try again or sent to the next page.
	 */
	public void handleLogin(ActionEvent event) {
		String username = this.usernameInput.getText();
		String password = this.passwordInput.getText();

		if (username.equals("admin") && password.equals("password123")) {
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("LogWindow.fxml"));
				Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				currentStage.setScene(new Scene(loader.load()));
			} catch (IOException theException) {
				theException.printStackTrace();
			}
		} else {
			this.errorLabel.setText("Invalid credentials. Try again.");
		}
	}
}