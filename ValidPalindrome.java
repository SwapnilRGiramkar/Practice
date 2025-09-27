//Check its given String is Valid Palindrome or Not 
package basicDSA;

public class VL 
{
	public static void main(String[] args) 
	{
		String s="A man, a plan, a canal: Panama";
		System.out.println(validPal(s));
	}
	public static boolean validPal(String s)
	{
		s=s.toLowerCase();
		s=s.replaceAll("[^0-9a-z]", "");
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;j--;
		}
		return true;
	}
}

