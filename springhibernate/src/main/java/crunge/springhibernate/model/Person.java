package crunge.springhibernate.model;

public class Person {
//	PersonID int,
//	LastName varchar(255),
//	FirstName varchar(255),
//	Address varchar(255),
//	City varchar(255)
	
	private long id;
	private String lastName;
	private String firstName;
	private String address;
	private String city;
	public Person(String lastName, String firstName, String address, String city) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.city = city;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
