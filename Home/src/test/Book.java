package test;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Book {
	private SimpleStringProperty code;
	private SimpleStringProperty title;
	private SimpleStringProperty writer;
	
	private SimpleIntegerProperty price;
	private SimpleIntegerProperty count;

	public Book(String code, String title, String writer, int price, int count) {
		this.code = new SimpleStringProperty(code);
		this.title = new SimpleStringProperty(title);
		this.writer = new SimpleStringProperty(writer);
		
		this.price = new SimpleIntegerProperty(price);
		this.count = new SimpleIntegerProperty(count);
	}

	// code
	public String getCode() {
		return this.code.get();
	}

	public void setCode(String code) {
		this.code.set(code);
	}

	public SimpleStringProperty codeProperty() {
		return this.code;
	}

	// title
	public String getTitle() {
		return this.title.get();
	}

	public void setTitle(String title) {
		this.title.set(title);
	}

	public SimpleStringProperty titleProperty() {
		return this.title;
	}

	// writer
	public String getWriter() {
		return this.writer.get();
	}

	public void setWriter(String writer) {
		this.writer.set(writer);
	}

	public SimpleStringProperty writerProperty() {
		return this.title;
	}

	// price
	public int getPrice() {
		return this.price.get();
	}

	public void setPrice(int price) {
		this.price.set(price);
	}

	public SimpleIntegerProperty priceIntegerProperty() {
		return this.price;
	}

	// count

	public int getCount() {
		return this.count.get();
	}

	public void setCount(int count) {
		this.count.set(count);
	}

	public SimpleIntegerProperty countIntegerProperty() {
		return this.count;
	}
}
