package chap17.exam05_padding_margin;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 패딩설정

		HBox hbox = new HBox(); //HBox를 기준으로 안쪽 여백을 줌. (들여쓰기???)
		hbox.setPadding(new Insets(50, 10, 10, 50)); //Top/Right/bottom/Left
		Button button = new Button();
		button.setPrefSize(100, 100);

		// 마진설정
//		HBox hbox = new HBox();
//		Button button = new Button();
//		button.setPrefSize(100, 100);
//		HBox.setMargin(button, new Insets(10, 10, 50, 50)); // 버튼을 배치 할 때,  버튼의 바깥쪽 여백을 지정함 Top/Right/bottom/Left

		hbox.getChildren().add(button);

		Scene scene = new Scene(hbox);

		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
