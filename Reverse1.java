//Reverse the given String 
package strings;
import java.util.Scanner;
public class Reverse1 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine();
		sc.close();
		String ans =reverse(s);
		System.out.println(ans);
	}
	public static String reverse(String s)
	{
		String ans="";
		for(int i=s.length()-1;i>=0;i--)
		{
			ans+=s.charAt(i);
		}
		return ans;
	}
}

