package oopsConcepts;

class Student{
	int i=1;
	String studentName = "vishal";
}

public class ClassObject {

	public static void main(String[] args) {
		Student stud1 = new Student();
		System.out.println(stud1.i);
		System.out.println(stud1.studentName);
		Student stud2 = new Student();
		System.out.println(stud2.i);
		System.out.println(stud2.studentName);
	}

}
