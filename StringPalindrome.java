//PAlindrome of STring 
package strings;
import java.util.Scanner;
public class Stringpalindrom 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String ");
		String s =sc.next();
		sc.close();
		if(isPal(s))
		{
			System.out.println("Its palindrome ");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		

	}
	public static boolean isPal(String s)
	{
		for(int i=0,j=s.length()-1;i<j;i++,j--)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				return true;
			}
		}
		return false;
	}
}

