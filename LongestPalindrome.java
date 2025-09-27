//This is the example of Longest Palindrome
package basicDSA;

public class LP 
{
	public static void main(String[] args)
	{
		String s="abcbe";
		System.out.println(longest(s));
	}
	public static int longest(String s)
	{
		int[]freq =new int[128];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			freq[ch]++;
		}
		boolean oddFound=false;;
		int length=0;
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]%2==0)
			{
				length+=freq[i];
			}
			else
			{
				length+=freq[i]-1;
				oddFound=true;
			}
		}
		if(oddFound)
		{
			length++;
		}
		return length;
	}
}

