//Reverse the Given Number 
package basics;

public class ReverseNumber 
{
	public static void main(String[] args)
	{
		int num=4003;
		int ans=reverse(num);
		System.out.println(ans);
	}
	public static int reverse(int num)
	{
		int rev=0;
		while(num>0)
		{
			int last=num%10;
			rev=rev*10+last;
			num/=10;
		}
		return rev;
	}
}

