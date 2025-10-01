//This Code Reverse the Given String 
package arrayPrograms;

public class ReverseString1 
{
	public static void main(String[] args) 
	{
		String s="Swapnil Giramkar";
		System.out.println(reverse(s));
	}
	public static String reverse(String s)
	{
		String ans="";
		for(int j=s.length()-1;j>=0;j--)
		{
			ans=ans+s.charAt(j);
		}
		return ans;
	}
}

