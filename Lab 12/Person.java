package Lab13;

public class Person {
	//Declare attributes
	private String name, address;
	
	//Create constructor
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("Person [name= %s, address= %s]", name, address);
	}
	
	
}
