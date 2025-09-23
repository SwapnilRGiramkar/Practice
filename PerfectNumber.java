//Perfect NUmber
package basics;

public class PerfectNumber 
{
	public static void main(String[] args) 
	{
		int num=6;
		if(isPerfect(num))
		{
			System.out.println("Given number is Perfect Number");
		}
		else
		{
			System.out.println("Given number is Not a Perfect Number");
		}
	}
	public static boolean isPerfect(int num)
	{
		int temp=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				temp+=i;
			}
		}
		System.out.println(temp);
		if(temp==num)
			return true;
					
		return false;
	}
}

