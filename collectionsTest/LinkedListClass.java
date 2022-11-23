package collectionsTest;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList lList1 = new LinkedList();
		lList1.add("Vishal");
		lList1.add("Kadam");
		lList1.add("Pune");
		lList1.add("Vishal");
		
		System.out.println(lList1);
		
		Iterator itr = lList1.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		

	}

}
