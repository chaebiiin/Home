package cashBook;

public class cashBook {
	String day;
	String product;
	int price;
	
	public cashBook(String day, String product, int price) {
		this.day = day;
		this.product = product;
		this.price = price;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
