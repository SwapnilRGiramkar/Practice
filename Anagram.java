//This is the example of Given Two STrings are angram or NOt 
//Using For loop
package stringPrograms;
public class Anagram 
{
	public static void main(String[] args)
	{
		String s1="listen";
		String s2="silent";
		if(isAnagram(s1, s2))
			System.out.println("its Anagram");
		else
			System.out.println("its NOt  Anagram");
	}
	public static boolean isAnagram(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()==s2.length())
		{
			int[] chars=new int[127];
			int[] chars2=new int[127];
			int i=0,j=0;
			for(;i<s1.length();i++,j++)
			{
				char ch=s1.charAt(i);
				chars[ch++]=ch;
				char ch2=s2.charAt(j);
				chars2[ch2++]=ch2;
			}
			if(chars[i]==chars[j])
			{
				return true;
			}
			return false;
		}
		return false;
		
	}
}

