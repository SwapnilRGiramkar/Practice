//This program gives a frequency of characters
package strings;
import java.util.Scanner;
public class FrequencyCounter 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.next();
		sc.close();
		freqCount(s);
	}
	public static void freqCount(String s)
	{
		s=s.toLowerCase();
		String visited="";
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
//			System.out.println(ch+  " : "+ visited.indexOf(ch));
			if(visited.indexOf(ch)!=-1)
			{
				continue;
			}
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)==ch)
				{
					count++;
				}
			}
			System.out.println(ch + " → " + count);
			visited += ch;
		}
	}
}

