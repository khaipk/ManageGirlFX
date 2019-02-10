package application.view;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;

public class MainViewController {
	
	private Main main;
	
	@FXML
	private void showAddGirl() throws IOException {
		main.showAddGirl();
	}
	@FXML
	private void showShowGirl() throws IOException {
		main.showShowGirl();
	}
	@FXML
	private void showCallGirl() throws IOException {
		main.showCallGirl();
	}
	@FXML
	private void exit() {
		System.exit(1);
	}
}
