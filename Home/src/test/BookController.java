package test;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class BookController implements Initializable {
	@FXML Button btnAdd, btnChart;
	@FXML TableView<Book> tableView;
	
	ObservableList<Book> list;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		list = FXCollections.observableArrayList();
		
		btnAdd.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				handlebtnAddAction(event);
			}
		});
		btnChart.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				handlebtnChartAction(event);
			}		
		});
		
		TableColumn<Book, ?> tcCode = tableView.getColumns().get(0);
		tcCode.setCellValueFactory(new PropertyValueFactory("code"));
		
		TableColumn<Book, ?> tcTitle = tableView.getColumns().get(1);
		tcTitle.setCellValueFactory(new PropertyValueFactory("title"));
		
		TableColumn<Book, ?> tcWriter = tableView.getColumns().get(2);
		tcWriter.setCellValueFactory(new PropertyValueFactory("writer"));
		
		TableColumn<Book, ?> tcPrice = tableView.getColumns().get(3);
		tcPrice.setCellValueFactory(new PropertyValueFactory("price"));
		
		TableColumn<Book, ?> tcCount = tableView.getColumns().get(4);
		tcCount.setCellValueFactory(new PropertyValueFactory("count"));
		
		tableView.setItems(list);
	
	}
	
	public void handlebtnAddAction(ActionEvent e) {
		Stage addStage = new Stage(StageStyle.UTILITY);
		addStage.initModality(Modality.WINDOW_MODAL);
		addStage.initOwner(btnAdd.getScene().getWindow());
		
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("AddBook.fxml"));
			Scene scene = new Scene(parent);
			addStage.setScene(scene);
			addStage.setResizable(false);
			addStage.show();
			
			Button btnFormAdd = (Button) parent.lookup("#btnFormAdd");
			btnFormAdd.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					TextField code = (TextField) parent.lookup("#code");
					TextField title = (TextField) parent.lookup("#title");
					TextField writer = (TextField) parent.lookup("#writer");
					TextField price = (TextField) parent.lookup("#price");
					TextField count = (TextField) parent.lookup("#count");
					
					Book book = new Book(code.getText(),
								(title.getText()),
								 (writer.getText()),
								Integer.parseInt(price.getText()),
								Integer.parseInt(count.getText()));

					list.add(book);
				addStage.close();
				}
				
			});
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	public void handlebtnChartAction(ActionEvent e) {
		
	}
}
