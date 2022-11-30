package logisticsIndra;


import java.util.ArrayList;
import java.util.Date;

public class Order {
	
	public String id;
	public String trackingID;
	public String origin;
	public String destination;
	public Boolean isFragile;
	public Conveyance conveyance;
	public ArrayList<Product> products;
	public Date shippingDate;
	public Date arrivalDate;
	public Order(String id, String trackingID, String origin, String destination, Boolean isFragile,
			Conveyance conveyance, ArrayList<Product> products, Date shippingDate, Date arrivalDate) {
		super();
		this.id = id;
		this.trackingID = trackingID;
		this.origin = origin;
		this.destination = destination;
		this.isFragile = isFragile;
		this.conveyance = conveyance;
		this.products = products;
		this.shippingDate = shippingDate;
		this.arrivalDate = arrivalDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTrackingID() {
		return trackingID;
	}
	public void setTrackingID(String trackingID) {
		this.trackingID = trackingID;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Boolean getIsFragile() {
		return isFragile;
	}
	public void setIsFragile(Boolean isFragile) {
		this.isFragile = isFragile;
	}
	public Conveyance getConveyance() {
		return conveyance;
	}
	public void setConveyance(Conveyance conveyance) {
		this.conveyance = conveyance;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public Date getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", trackingID=" + trackingID + ", origin=" + origin + ", destination=" + destination
				+ ", isFragile=" + isFragile + ", conveyance=" + conveyance + ", products=" + products
				+ ", shippingDate=" + shippingDate + ", arrivalDate=" + arrivalDate + "]";
	}
	


}
