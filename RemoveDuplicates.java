//Remove duplicate character from String 
package strings;
import java.util.Scanner;
public class RemoveDuplicateChar 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine();
		sc.close();
		String ans=removeDup(s);
		System.out.println(ans);
	}
	public static String removeDup(String s)
	{
		String ans="";
		int j=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ans.indexOf(ch)!=-1)
			{
				continue;
			}
			if(ch==s.charAt(j))
			{
				ans+=ch;
				continue;
			}
			else
			{
				ans+=ch;
				j++;
			}
			
		}
		return ans;
	}
}

