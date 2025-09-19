//Remove Duplicates From an a String 
package strings;

public class RemoveDups 
{
	public static void main(String[] args) 
	{
		String s="Swaapnil";
		String ans=remove(s);
		System.out.println(ans);
	}
	public static String remove(String s)
	{
		String ans="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ans.indexOf(ch)==-1)
			{
				ans+=ch;
			}
		}
		return ans ;
	}
}

