 package oopsConcepts;

class StudentByReference{
	int id;
	String name;
}
 
 public class ClassObjectInitializationByReference {

	public static void main(String[] args) {
		StudentByReference s1 = new StudentByReference();
		s1.id= 1;
		s1.name = "Sankalp";
		System.out.println(s1.id+" "+s1.name);
	}

}
