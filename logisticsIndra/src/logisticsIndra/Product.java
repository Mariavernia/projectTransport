package logisticsIndra;

public class Product {
	
	public String id;
	public String name;
	public String description;
	public int price;
	public boolean isFragile;
	public int weight;
	public int height;
	public int widht;
	public int high;
	public Product(String id, String name, String description, int price, boolean isFragile, int weight, int height,
			int widht, int high) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.isFragile = isFragile;
		this.weight = weight;
		this.height = height;
		this.widht = widht;
		this.high = high;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFragile() {
		return isFragile;
	}
	public void setFragile(boolean isFragile) {
		this.isFragile = isFragile;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidht() {
		return widht;
	}
	public void setWidht(int widht) {
		this.widht = widht;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", isFragile=" + isFragile + ", weight=" + weight + ", height=" + height + ", widht=" + widht
				+ ", high=" + high + "]";
	}
	
	
}