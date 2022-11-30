package logisticsIndra;

import java.util.ArrayList;

public class Customer {
	
	public String id;
	public String name;
	public String familyName;
	public String email;
	public String phoneNumber;
	public String idCard;
	public Address address;
	public ArrayList<Order> order;
	public Customer(String id, String name, String familyName, String email, String phoneNumber, String idCard,
			Address address, ArrayList<Order> order) {
		super();
		this.id = id;
		this.name = name;
		this.familyName = familyName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.idCard = idCard;
		this.address = address;
		this.order = order;
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
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ArrayList<Order> getOrder() {
		return order;
	}
	public void setOrder(ArrayList<Order> order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", familyName=" + familyName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", idCard=" + idCard + ", address=" + address + ", order=" + order
				+ "]";
	}
	
	


}
	
