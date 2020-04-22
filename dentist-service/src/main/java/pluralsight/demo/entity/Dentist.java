package pluralsight.demo.entity;

public class Dentist {
	
	private String firstName;
	private String lastName;
	private String street;
	private String city;
	private String postalCode;
	
	public Dentist() {
		
	}
	
	public Dentist(String firstName, String lastName, String street, String city, String postalCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	@Override
	public String toString() {
		return "Dentist [firstName=" + firstName + ", lastName=" + lastName + ", street=" + street + ", city=" + city
				+ ", postalCode=" + postalCode + "]";
	}
	
	
}
