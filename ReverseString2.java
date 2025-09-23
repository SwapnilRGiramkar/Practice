//Reverse String in java 
package basics;

public class ReverseString
{
	public static void main(String[] args) 
	{
		String s="Swapnil Giramkar";
		String ans=reverse(s);
		System.out.println(ans);
	}
	public static String reverse(String s)
	{
		String ans="";
		for(int i=s.length()-1;i>=0;i--)
		{
			ans=ans+s.charAt(i);
		}
		return ans;
	}
}

