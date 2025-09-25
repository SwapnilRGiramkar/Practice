//This program returns the given number is Palindromic number or Not 
package numberPrograms;
import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to check palindrome");
		int num=sc.nextInt();
		sc.close();
		if(isPal(num))
		{
			System.out.println("Its Palindrome");
		}
		else
		{
			System.out.println("Its Not Palindrome");
		}
	}
	public static boolean isPal(int num)
	{
		int temp=num;
		int rev=0;
		int j=count(num);
		for(int i=0;i<j;i++)
		{
			int last=num%10;
			num/=10;
			rev=last+rev*10;
		}
		num=temp;
		System.out.println(rev);
		if(rev==num)
		{
			return true;
		}
		return false;
	}
	public static int count(int num)
	{
		int ct=0;
		while(num>0)
		{
			num/=10;
			ct++;
		}
		System.out.println(ct);
		return ct;
	}
}

