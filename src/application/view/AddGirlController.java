package application.view;

import java.io.IOException;

import application.HotGirls;
import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddGirlController {
		
	private Main main;
	
	@FXML
	private TextField txtCode;
	@FXML
	private TextField txtName;
	@FXML
	private TextField txtAge;
	@FXML
	private TextField txtAddress;
	
	@FXML
	private void add() {
		int code = Integer.valueOf(txtCode.getText());
		String name = txtName.getText();
		int age = Integer.valueOf(txtAge.getText());
		String address = txtAddress.getText();
		main.addGirl(new HotGirls(code, name, age, address));
	}
	@FXML
	private void home() throws IOException {
		main.showMenuView();
	}
}
