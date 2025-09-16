//Reverse String 
package strings;
import java.util.Scanner;
public class ReverseString 
{
	public static void main (String []args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.next();
		sc.close();
		reversed(s);
	}
	public static void reversed(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		System.out.println(s);
		System.out.println(rev);
	}
}

