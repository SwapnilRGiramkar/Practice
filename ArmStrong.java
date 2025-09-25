//This program gives given number is ArmStrong or Not
package numberPrograms;
import java.util.Scanner;
public class ArmStrong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		sc.close();
		if(isArm(num))
		{
			System.out.println("its ArmStrong Number");
		}
		else
		{
			System.out.println("Not a ArmStrong");
		}
	}
	public static boolean isArm(int num)
	{
		return false;
	}
}

