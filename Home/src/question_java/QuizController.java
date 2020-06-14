package question_java;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class QuizController implements Initializable {
	Connection conn;
	int numi=1;
	
	@FXML
	Button BtnOk, BtnCancle;
	@FXML
	TableView<Quiz> quiz;
	@FXML
	TreeTableView select1, select2, select3;
	@FXML Label r1;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (Exception e) {
			e.printStackTrace();
		}
		ObservableList<Quiz> boardList = getQuizList();
		quiz.setItems(boardList);

		TableColumn<Quiz, String> tcTitle = new TableColumn<Quiz, String>();
		tcTitle.setCellValueFactory(new PropertyValueFactory<Quiz, String>("quiz"));
		tcTitle.setText("문제");

		quiz.getColumns().add(tcTitle);
		quiz.setItems(boardList);
		
		
	}
	

	public ObservableList<Quiz> getQuizList() {
		ObservableList<Quiz> list = FXCollections.observableArrayList();
		Random random = new Random();
		numi = random.nextInt(5)+1;
		String sql = "select num, quiz, select1, select2, select3  from question where num =" + numi;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Quiz board = new Quiz(rs.getInt("num"), rs.getString("quiz"), rs.getString("select1"), rs.getString("select2"), rs.getString("select3"));
				list.add(board);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	

	public void handleBtnOkAction(ActionEvent e) {

	}

	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();

	}

}
