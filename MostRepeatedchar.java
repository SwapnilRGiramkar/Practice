//This program gives most repeated charat=cter from String 
package strings;
import java.util.Scanner;
public class MostRepeatedChar
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine();
		sc.close();
		char ans=mostRepeat(s);
		System.out.println(ans);
	}
	public static char mostRepeat(String s)
	{
		boolean []visited=new boolean[s.length()];
		char ans='\u0000';
		int max=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			if(visited[i]) continue;
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				char ch2=s.charAt(j);
				if(ch1==ch2)
				{
					count++;
					if(count>max)
					{
						max=count;
						ans=ch1;
					}
				}
			}
		}
		System.out.println(max);
		return ans;
	}
}

