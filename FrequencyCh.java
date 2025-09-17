//Frequency of chars
package strings;
import java.util.Scanner;
public class FrequencyOfChar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine();
		sc.close();
		frequency(s);
	}
	public static void frequency(String s)
	{
		String visited="";
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			char ch=s.charAt(i);
			if(visited.indexOf(ch)!=-1)
			{
				continue;
			}
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j))
				{
					count++;
				}
			}
			System.out.println("character : "+ch +" count :"+count);
			visited+=ch;
		}
	}
}

