//Find GCD of given numbers
package basics;

public class GCD 
{
	public static void main(String[] args) 
	{
		int num1=36;
		int num2=60;
		int ans=gcd(num1,num2);
		System.out.println("Common GCD is "+ans);
	}
	public static int gcd(int a,int b)
	{
		int temp=0;
		for(int i=1;i<b/2;i++)
		{
			if(a%i==0 && b%i==0)
			{
				temp=i;
			}
		}
		return temp;
	}
}

