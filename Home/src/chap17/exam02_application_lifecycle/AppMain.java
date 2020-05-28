package chap17.exam02_application_lifecycle;

import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application { // Application을 상속받는 Appmain class

	public AppMain() { // 생성자 작성 ui생성코드를 여기에 넣어줌
		System.out.println(Thread.currentThread().getName() + " : AppMain() 호출"); // JavaFX Application Thread 가 호출 됨.
	}

	@Override
	public void init() throws Exception { // JavaFX-Launcher가 실행됨
		System.out.println(Thread.currentThread().getName() + " : init() 호출"); //실행 메게값을 받아서 javafx가 이용할 수 있도록 함.????
		Parameters params = this.getParameters();
		Map<String, String> map = params.getNamed();
		String ip = map.get("ip");
		String port = map.get("port");
		System.out.println("ip :" + ip );
		System.out.println("port :" + port );

	}

	@Override
	public void start(Stage primaryStage) throws Exception { // application에 정의된 추상 메소드 start를 정의해줘야 한다.
		System.out.println(Thread.currentThread().getName() + " : start() 호출");
		primaryStage.show(); // 윈도우 보여주기.
	}

	@Override
	public void stop() throws Exception { // JavaFX Application Thread 가 호출 됨.
		System.out.println(Thread.currentThread().getName() + " : stop() 호출");

	}

	public static void main(String[] args) { // launch를 실행함
		launch(args);

	} // main

}
