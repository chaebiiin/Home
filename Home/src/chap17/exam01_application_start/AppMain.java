package chap17.exam01_application_start;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application { //Application을 상속받는 Appmain class
	@Override
	public void start(Stage primaryStage) throws Exception { //application에 정의된 추상 메소드 start를 정의해줘야 한다.
		primaryStage.show(); //윈도우 보여주기.
	}	
	
public static void main(String[] args) {
		launch(args);

	}

}
