//This is the example of reverse the String 
package stringPrograms;

public class ReverseString 
{
	public static String reverseString(String s)
	{
		String ans="";
		
		for(int i =s.length()-1;i>=0;i--) 
		{
			char ch=s.charAt(i);
			ans=ans+ch;
		}
		return ans;
	}
	public static void main(String[] args) 
	{
		String s="Listen";
		String ans=reverseString(s);
		System.out.println(ans);
	}
}

