package logisticsIndra;

public class Package {


	public String id;
	public Boolean isFragile;
	public int height;
	public int width;
	public int depth;
	public Sizes size;
	

	public Package(String id, Boolean isFragile, int height, int width, int depth) {
		super();
		this.id = id;
		this.isFragile = isFragile;
		this.height = height;
		this.width = width;
		this.depth = depth;
		setSize(height, width, depth);
	}
	
		
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getIsFragile() {
		return isFragile;
	}
	public void setIsFragile(Boolean isFragile) {
		this.isFragile = isFragile;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public Sizes getSize() {
		return size;
	}
	
	public void setSize(int height, int width, int depth) {
		int size = height * width * depth;
		int xs = 10000;
		int s = 25000;
		int m = 50000;
		int l = 75000;
		int xl = 100000;
		
		if (size < xs) {
			this.size = Sizes.EXTRASMALL;
		}
		else if (size < s) {
			this.size = Sizes.SMALL;
		}
		else if (size < m) {
			this.size = Sizes.MEDIUM;
		}
		else if (size < l) {
			this.size = Sizes.LARGE;
		}
		else if (size < xl) {
			this.size = Sizes.EXTRALARGE;
		}
		else {
			this.size = Sizes.UNPACKABLE;
		}
		
		

				
	}
	
	
	
	

}
