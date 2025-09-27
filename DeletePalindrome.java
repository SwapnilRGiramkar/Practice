//Delete the index of Palindrome which becomes others palindrome
package basicDSA;

public class DP 
{
	public static void main(String[] args) 
	{
		String s="aaabaaaa";
		int ans=delPal(s);
		System.out.println(ans);
	}
	public static int delPal(String s)
	{
		int i=0,j=s.length()-1;
		
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j)) 
			{
				i++;j--;
			}
			else
			{
				if(isPalindrome(s,i+1,j))return i;
				else if(isPalindrome(s,i,j-1))return i;
				else return -1;
			}
		}
		return -1;
	}
	public static boolean isPalindrome(String s,int i,int j)
	{
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;j--;
		}
		return true;
	}
}

