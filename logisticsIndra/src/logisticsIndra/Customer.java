package logisticsIndra;

public class Customer {
	
	public String id_customer;
	public String name;
	public String surname;
	public String email;
	public String phoneNumber;
	public String idCard;
	public Address address;
	
	public Customer(String id_customer, String name, String surname, String email, String phoneNumber,String idCard, Address address) {
		super();
		this.id_customer = id_customer;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.idCard = idCard;
		this.address = address;
	}

	public String getId_customer() {
		return id_customer;
	}

	public void setId_customer(String id_customer) {
		this.id_customer = id_customer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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

	@Override
	public String toString() {
		return "Customer [id_customer=" + id_customer + ", name=" + name + ", surname=" + surname + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", idCard=" + idCard + ", address="
				+ address + "]";
	}

}
	
