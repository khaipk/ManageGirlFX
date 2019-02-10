package application.view;

import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;

public class ShowGirlController {
	
	private Main main;
	
	@FXML
	private void show() {
		main.showGirl();
	}
	@FXML
	private void home() throws IOException {
		main.showMenuView();
	}
}	
