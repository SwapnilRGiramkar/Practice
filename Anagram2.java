//This is the Example of Anagram or not using while loop
package stringPrograms;

public class Anagram2 
{
	public static void main(String[] args) 
	{
		String s1="listen";
		String s2="silent";
		if(isAnagram(s1, s2))
			System.out.println("its Anagram");
		else
			System.out.println("its Not  Anagram");
	}
	public static boolean isAnagram(String s1,String s2)
	{
		s1=s1.toLowerCase();s2=s2.toLowerCase();
		if(s1.length()==s2.length())
		{
			int i=0,j=0;
			int[]chars1=new int[127];
			int[]chars2=new int[127];
			while(i<s1.length())
			{
				char ch1=s1.charAt(i);
				chars1[ch1++]=ch1;
				char ch2=s2.charAt(j);
				chars2[ch2++]=ch1;
				i++;j++;
			}
			if(chars1[i]!=chars2[j])
				return false;
			return true;
		}
		return false;
	}
}

