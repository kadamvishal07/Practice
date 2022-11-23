package collectionsTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FindMaxConsecutiveNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter Decimal Number: ");
		int n = scan.nextInt();
		int temp;
		List newBinary = new ArrayList<Integer>();
		List binary = new ArrayList<Integer>();
		while(n>0){
			temp = n%2;
			n=n/2;
			binary.add(temp);
		}
		int i=binary.size()-1;
		while(i>=0){
			newBinary.add(binary.get(i));
			i--;
		}
		int maxCount = 0;
		int count = 0;
		for(int j=0; j<newBinary.size();j++) {
			if(newBinary.get(j).equals(1)) {
				count++;
				if (maxCount < count)
					maxCount=count;
			}
			else
				count = 0;
		}
		System.out.println(maxCount);
	}

}
