//Frequency of character in java 
package strings;

public class Frequency
{
	public static void main(String[] args) 
	{
		String s="swaaappnilll";
		frequency(s);
	}
	public static void frequency(String s)
	{
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ans.indexOf(ch)!=-1)
			{
				continue;
			}
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			ans+=ch;
			System.out.println("char : "+ch+" count : "+count);
		}
	}
}
