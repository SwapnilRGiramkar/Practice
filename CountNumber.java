//Given Numbers Count 
package numberPrograms;
import java.util.Scanner;
public class Count 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		sc.close();
		int count=0;
		while(num>0)
		{
			num/=10;
			count++;
		}
		System.out.println(count);
	}
}

