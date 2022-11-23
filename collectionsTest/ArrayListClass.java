package collectionsTest;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList aList1 = new ArrayList();
		aList1.add("Vishal");
		aList1.add("Kadam");
		aList1.add("Pune");
		aList1.add("Vishal");
		
		//Normal Printing
		System.out.println(aList1);
		
		//Using iterator
		Iterator itr = aList1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//

	}

}
