package chap17.exam03_stage_scene;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application { // Application을 상속받는 Appmain class
	@Override
	public void start(Stage primaryStage) throws Exception { // application에 정의된 추상 메소드 start를 정의해줘야 한다.
		VBox root = new VBox(); 
		root.setPrefWidth(350);// 컨테이너의 사이즈 설정
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER); // 포지션을 중앙을 줌.(정렬)
		root.setSpacing(40); // 수직공간의 값(?) 지정(간격지정)

		Label label = new Label(); // 라벨 컨트롤
		label.setText("Hello, JavaFX"); 
		label.setFont(new Font(50)); //폰트 크기

		Button button = new Button(); //버튼 컨트롤 
		button.setText("확인"); 
		button.setOnAction(event->Platform.exit()); //클릭시 이벤트 처리.

		root.getChildren().add(label);  //root 컨테이너의 getchildren을 호출 함.???
		root.getChildren().add(button); // 부모객체가 완성됨????

		Scene scene = new Scene(root); //위의 내용을 가진 scene이 만들어짐. 장면의 내용으로 parent가 들어감????!!!!
		
		primaryStage.setTitle("AppMain"); // 윈도우 창의 제목을 띄어줌.
		primaryStage.setScene(scene); //윈도우의 장면 설정 위의 scne를 토대로 stage가 만들어짐??
		primaryStage.show(); // 윈도우 보여주기.
	}

	public static void main(String[] args) {
		launch(args);

	}

}
