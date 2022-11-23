package basicPrograms;

public class ClassB extends ClassA {

	public void method1()
	{
		System.out.println("ClassB method1");
	}
	public static void main(String[] args) {
		ClassA a= new ClassA();
		ClassA a1=new ClassB();
		//ClassB b=new ClassA(); Invalid
		ClassB b1=new ClassB();

	}

}
