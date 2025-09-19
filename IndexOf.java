//Index Of in java 
package strings;
public class IndexOf 
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
			if(indexOf(ans,ch)==-1)
			{
				ans+=ch;
			}
		}
		return ans;
	}
	public static int indexOf(String s,char ch)
	{
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				return i;
			}
		}
		return -1;
	}
	
}

