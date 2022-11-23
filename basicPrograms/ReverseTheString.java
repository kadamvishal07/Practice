package basicPrograms;

public class ReverseTheString {

	public static void main(String[] args) {
		String str = "I am a Programmer";
		String strSplit[] = str.split(" ");
		StringBuilder finalStr= new StringBuilder();
		for(int i = 0; i<strSplit.length;i++)
		{
			String temp = strSplit[i];
			
			for (int j=temp.length()-1;j>=0;j--)
			{
				System.out.print(temp.charAt(j));
				finalStr = finalStr.append(temp.charAt(j));
			}
			System.out.print(" ");
			finalStr = finalStr.append(" ");
		}
		System.out.println();
		System.out.println(finalStr);
	}

}
