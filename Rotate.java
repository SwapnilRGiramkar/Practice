//Roatate an Array using Switch block 
package strings;

import java.util.Arrays;
import java.util.Scanner;
public class Rotate 
{
	public static void main(String[] args)
	{
		int []arr= {1,2,3,4,5,6};
		int k=2;
		System.out.println("Enter the choice to rotate the array ");
		System.out.println("1.Rotate array to left");
		System.out.println("2.Rotate array to right ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		sc.close();
		switch (choice)
		{
		case 1: 
		{
			int []ans=rotateLeft(arr,k);
			System.out.println(Arrays.toString(ans));
			break;
		}
		case 2:
		{
			int []ans=rotateRight(arr,k);
			System.out.println(Arrays.toString(ans));
			break;
		}
		default :
		{
			System.out.println("Entering the choice is Not Correct ");
			break;
		}
		}
		
	}
	public static int[] rotateLeft(int []arr,int k)
	{
		int n=arr.length;
		k=k%n;
		
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		reverse(arr,0,n-1);
		return arr;
	}
	public static int[] rotateRight(int []arr,int k)
	{
		int n=arr.length;
		k=k%n;
		
		reverse(arr,0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		
		return arr;
	}
	public static void reverse(int []arr,int start,int end)
	{
		int i=start;
		int j=end;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;j--;
		}
	}
	
}

