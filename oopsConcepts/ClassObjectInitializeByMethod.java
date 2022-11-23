package oopsConcepts;

class StudentByMethod{
	int id;
	String name;
	
	public void insertRecord(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void displayRecord() {
		System.out.println(id+" "+name);
	}
}

public class ClassObjectInitializeByMethod {

	public static void main(String[] args) {
		StudentByMethod s1 = new StudentByMethod();
		s1.insertRecord(1, "Sankalp");
		s1.displayRecord();
		StudentByMethod s2 = new StudentByMethod();
		s2.insertRecord(2, "Akshay");
		s2.displayRecord();
		StudentByMethod s3 = new StudentByMethod();
		s2.insertRecord(3, "Vishal");
		s2.displayRecord();
	}

}
