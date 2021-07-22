package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {
	//Controls
	@FXML Button btnOk;
	@FXML Button btnCancel;
	
	@FXML private void initialize() {
		btnOk.setOnAction(new okHandler());
		btnCancel.setOnAction(new cancelHandler());
	}
	
	//Handler objects methods ran after controls clicked
	public void okHandler() {
		System.out.println("Ok button clicked");
	}
	
	public void cancelHandler() {
		System.out.println("Cancel button clicked");
	}
	
	//Inner class that implements button interface
	private class okHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			okHandler();
		}
	}
	
	private class cancelHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent e) {
			cancelHandler();
		}
	}
}
