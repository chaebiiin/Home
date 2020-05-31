package chap17.exam04_progammatical_layout;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox(); // 컨테이너 생성
		hbox.setPadding(new Insets (10, 10, 10, 10));  //안쪽 여백설정
		hbox.setSpacing(10); // 컨트롤 간의 수평간격 설정
		
		TextField textfield = new TextField(); // 텍스트필드 컨드롤 설정
		textfield.setPrefWidth(200); // 텍스트필드 폭 설정
		
		Button button = new Button(); //버튼 컨트롤 생성
		button.setText("확인"); //버튼 글자 설정
		
		ObservableList list = hbox.getChildren();
		list.add(textfield); // 텍스트필드 컨트롤 배치
		list.add(button); //버튼 컨트롤 배치
	
		Scene scene = new Scene(hbox); 
		
		primaryStage.setTitle("AppMain"); //윈도우 창 제목 설정 
		primaryStage.setScene(scene); //윈도우 창에 화면 설정
		primaryStage.show(); //윈도우 창 보여주기
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
