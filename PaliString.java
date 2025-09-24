//Its check given String is Palindrome or Not 
package basics;

public class PalString
{
	public static void main(String[] args) 
	{
		String s="aabaa";
		if(isPal(s))
		{
			System.out.println("Its Palindrome ");
		}
		else
		{
			System.out.println("Its Not Palindrome ");
		}
	}
	public static boolean isPal(String s)
	{
		for(int i=0,j=s.length()-1;i<j;i++,j--)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				continue;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
}

