package application;
	
import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private static Stage primaryStage;
	private static BorderPane mainPane;
	
	private static ArrayList<HotGirls> girllist = new ArrayList<>();
	
	public static void addGirl(HotGirls girl) {
		girllist.add(girl);
	}
	
	public static void showGirl() {
		for(HotGirls girl: girllist) {
			System.out.println(girl);
		}
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("My Girls");
			showView();
			showMenuView();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void showView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("View.fxml"));
		mainPane = loader.load();
		Scene scene = new Scene(mainPane, 400, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void showMenuView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainView.fxml"));
		Parent root = loader.load();
		mainPane.setCenter(root);
		
	}
	
	public static void showAddGirl() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/AddGirl.fxml"));
		Parent root = loader.load();
		mainPane.setCenter(root);
	}
	
	public static void showShowGirl() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/ShowGirl.fxml"));
		Parent root = loader.load();
		mainPane.setCenter(root);
	}
	
	public static void showCallGirl() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/CallGirl.fxml"));
		Parent root = loader.load();
		mainPane.setCenter(root);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
