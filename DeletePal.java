//After deleting specific one character remaining STring will be palindrome
package arrayPrograms;

public class DelPalindrome
{
	public static void main(String[] args)
	{
		String s="aba";
		System.out.println(delPals(s));
	}
	public static boolean delPals(String s)
	{
		s=s.toLowerCase();
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;j--;
			}
			else
			{
				return isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1);
			}
		}
		return true;
	}
	public static boolean isPalindrome(String s,int i,int j)
	{
		if(s.charAt(i)!=s.charAt(j)) return false;
		i++;j--;
		return true;
	}
}

