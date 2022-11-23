package oopsConcepts;

class Address{
	String city, state, county;
	int zipCode;
	
	Address(String city, String state, String country, int zipCode){
		this.city = city;
		this.state = state;
		this.county = country;
		this.zipCode = zipCode;
	}
}

public class AggregationHasA {

	int empId;
	String name;
	Address address;
	public AggregationHasA(int empId, String name, Address address) {
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println(empId+" "+name+" "+address.city+" "+address.state+" "+address.county+" "+address.zipCode);
	}
	
	public static void main(String[] args) {
		Address a1 = new Address("Pune", "Maharashtra", "India", 411033);
		Address a2 = new Address("Bangalore", "Karnataka", "India", 511051);
		AggregationHasA ag1 = new AggregationHasA(1, "Vishal", a1);
		AggregationHasA ag2 = new AggregationHasA(2, "Vikas", a2);
		ag1.display();
		ag2.display();
	}

}
