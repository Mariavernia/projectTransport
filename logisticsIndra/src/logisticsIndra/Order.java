package logisticsIndra;

public class Order {
	
	public String orderID;
	public String trackingID;
	public Customer customer;
	public Package packet;
	public String origin;
	public String destination;
	public Conveyance conveyance;
	
	public Order(String orderID, String trackingID, Customer customer, Package packet, String origin,
			String destination, Conveyance conveyance) {
		super();
		this.orderID = orderID;
		this.trackingID = trackingID;
		this.customer = customer;
		this.packet = packet;
		this.origin = origin;
		this.destination = destination;
		this.conveyance = conveyance;
	}




}
