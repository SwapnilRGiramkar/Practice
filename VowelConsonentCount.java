//This Program gives the count of Vowel and Consonents
package strings;
import java.util.Scanner;
public class VowelConsonentCounter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in );
		System.out.println("Enter the String ");
		String s=sc.next();
		sc.close();
		vowCons(s);
	}
	public static void vowCons(String s)
	{
		int vowCount=0;
		int consCount=1;
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U' )
			{
				vowCount++;
			}
			else
			{
				consCount++;
			}
		}
		System.out.println("Count of Vowels in String is "+vowCount);
		System.out.println("Count of Consonent in String is "+consCount);
	}
}

