package com.pack1;

public class SortString {

	public static void main(String[] args) 
	{
		String s1 = "listen";
		String s2 = "silent";
	
		String sortedS1 = sort(s1);
		String sortedS2 = sort(s2);
		
		if(sortedS1.equals(sortedS2))
		{
			System.out.println("The Given String is an Anagram of each other");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}
	
	static String sort(String s)
	{
		char[] ch = s.toCharArray();
		int len = ch.length;
		String val = "";
		for(int i=0; i<=len-1; i++)
		{
			for(int j=i+1; j<=len-1; j++)
			{
				if(ch[j]<ch[i])
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		
		for(char c: ch)
		{
			val =val+c;
		}
		return val;
	}

}
