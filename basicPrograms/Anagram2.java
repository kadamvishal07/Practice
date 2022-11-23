package basicPrograms;

public class Anagram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Aanand";
		String str2 = "Nanand";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		int len = str1.length();
		char[] str2Char = str2.toCharArray();
		int count = 0;
		
		for (int i=0;i<len;i++)
		{
			char ch = str1.charAt(i);
			if (str2.indexOf(ch)!=-1)
				count++;
		}
		System.out.println("count = "+count);
		if(len==count)
			System.out.println("anagram");
		else
			System.out.println(" not anagram");
	}

}
