//This program return the given number
package numberPrograms;
import java.util.Scanner;
public class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number which you want to reverse");
		int num=sc.nextInt();
		sc.close();
		int ans=reverse(num);
		System.out.println(ans);
	}
	public static int reverse(int num)
	{
		int rev=0;
		int j=count(num);
		for(int i=0;i<j;i++)
		{
			int last=num%10;
			num/=10;
			rev=last+rev*10;
		}
		System.out.println(rev);
		return rev;
	}
	public static int count(int num)
	{
		int count=0;
		while(num>0)
		{
			num/=10;
			count++;
		}
		System.out.println(count);
		return count;
	}
}

