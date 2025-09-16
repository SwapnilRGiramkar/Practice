//Frequency
package strings;
//import java.util.Scanner;
public class FreqChar
{
	public static void main (String []args )
	{
		String s ="Swapniiil";
		freq(s);
	}
	public static void freq(String s)
	{
		String visited="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
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
			System.out.println("charachter : "+ch+" count : "+count );
			visited+=ch;
		}
	}
}
