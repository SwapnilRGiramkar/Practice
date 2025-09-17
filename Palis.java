//palindrom string or not 
package strings;
import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		sc.close();
		if(isPal(s))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
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

