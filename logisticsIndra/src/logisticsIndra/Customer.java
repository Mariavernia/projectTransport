package logisticsIndra;

public class Customer {
	
	public String customerID;
	public String name;
	public String email;
	public String phoneNumber;
	public String address;
	public String country;
	public String province;
	public String city;
	public String zipCode;
	
	public Customer(String customerID, String name, String email, String phoneNumber, String address, String country,
			String province, String city, String zipCode) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.country = country;
		this.province = province;
		this.city = city;
		this.zipCode = zipCode;
	}


	public String getCustomerID() {
		return this.customerID;
	}
	
	public void setCustomerID(String customerID) {
		this.customerID = customerID;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
