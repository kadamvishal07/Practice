package oopsConcepts;

public class StaticMethod {

	// static {System.out.println("Static block is executed first");} static block is executed before main() method
	
	int rollNo;
	String name;
	static String collegeName = "MIT";
	
	StaticMethod(int rn, String nm){
		rollNo = rn;
		name = nm;
	}
	
	static void change() {
		// rollNo = 5; static method can access ONLY static data members.
		collegeName = "VIT";
	}
	
	void display() { // non-static method can access BOTH static and non-static data-members
		System.out.println("Roll number: "+rollNo+" Name: "+name+" College Name: "+collegeName); 
	}
	
	
	public static void main(String[] args) {
		StaticMethod s1 = new StaticMethod(1, "Vishal");
		StaticMethod s2 = new StaticMethod(2, "Sankalp");
		StaticMethod s3 = new StaticMethod(3, "Akshay");
		s1.display();
		s2.display();
		s3.display();
		StaticMethod.change();
		s1.display();
		s2.display();
		s3.display();
	}

}
