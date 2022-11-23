package basicPrograms;

import java.util.Arrays;

public class NewAnagram {

	public static void main(String[] args) {
		String str1 = "Aanand";
		String str2 = "Nanand";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Strings are not anagram");
		}
		else
		{
			char str1Array[] = str1.toCharArray();
			char str2Array[] = str2.toCharArray();
			
			Arrays.sort(str1Array);
			Arrays.sort(str2Array);
			
			if(Arrays.equals(str1Array, str2Array))
			{
				System.out.println("Strings are anagram");
			}
			else
			{
				System.out.println("strings are not anagram");
			}
		}

	}

}
