//This Program gives given number is Prime or Not 
package numberPrograms;
import java.util.Scanner;
public class PrimeOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num=sc.nextInt();
		sc.close();
		if(isPrime(num))
		{
			System.out.println("its Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
	}
	public static boolean isPrime(int num)
	{
		if(num==1) return true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				return true;
			}
			else
			{
				continue;
			}
		}
		return false;
	}
}

