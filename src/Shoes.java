
public class Shoes {
	
	public Shoes(String brand, int price, String model) {
		this.brand = brand;
		this.price = price;
		this.model = model;
	}
	
	private String brand;
	private int price;
	private String model;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
