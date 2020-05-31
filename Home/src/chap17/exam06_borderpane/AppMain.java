package chap17.exam06_borderpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("rootfxml"));
		Scene scene = new Scene(parent);

		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.setWidth(300);
		primaryStage.setHeight(200);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
