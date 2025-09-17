//This Program gives an non -repeated character from string 
package strings;
import java.util.Scanner;
public class FirstNonRepeatCharacter 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		sc.close();
		char ans=nonRepeat(s);
		System.out.println("First non-repeated char : "+ans);
	}
	public static char nonRepeat(String s)
	{
		boolean[]visited=new boolean [s.length()];
		for(int i=0;i<s.length();i++)
		{
			char ch1=s.charAt(i);
			if(visited[i]) continue;
			int count = 0;
			for(int j=0;j<s.length();j++)
			{
				char ch2=s.charAt(j);
				if(ch1==ch2)
				{
					visited[i]=true;
					count++;
				}
			}
			if(count==1)
			{
				return ch1;
			}
		}
		return ' ';
	}
}


