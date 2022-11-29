package logisticsIndra;

public class Address {
	
	public String address;
	public String country;
	public String province;
	public String city;
	public int zipCode;
	
	public Address(String address, String country, String province, String city, int zipCode) {
		super();
		this.address = address;
		this.country = country;
		this.province = province;
		this.city = city;
		this.zipCode = zipCode;
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

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	

	

	

}
