package logisticsIndra;

public class Product {
	
	public String id;
	public String name;
	public String description;
	public int price;
	public int weight;
	public int dimension;
	public boolean isFragile;
	
	public Product(String id, String name, String description, int price, int weight, int dimension,
			boolean isFragile) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.weight = weight;
		this.dimension = dimension;
		this.isFragile = isFragile;
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




	public int getWeight() {
		return weight;
	}




	public void setWeight(int weight) {
		this.weight = weight;
	}




	public int getDimension() {
		return dimension;
	}




	public void setDimension(int dimension) {
		this.dimension = dimension;
	}




	public boolean isFragile() {
		return isFragile;
	}




	public void setFragile(boolean isFragile) {
		this.isFragile = isFragile;
	}

}
