package edu.westga.moneymanager.MoneyManager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Directs the flow of the application.
 * 
 * @author Demetrius McCants
 * @version 1.0
 */
public class App extends Application {

	/**
	 * Serves as the main method/entry point to the application.
	 * 
	 * @param args the basic parameter for the main method.
	 * @precondition none.
	 * @postcondition the application has been entered.
	 */
	public static void main(String[] args) {
		Application.launch(args);
	}

	/**
	 * Starts the stage for the application.
	 * 
	 * @param primaryStage the stage to start.
	 * @precondition none.
	 * @postcondition the stage has been started.
	 */
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view/LoginWindow.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Transaction Log");
		primaryStage.show();

	}
}
