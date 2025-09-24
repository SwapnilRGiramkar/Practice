//Minimum And Maximum element of an array
package basics;

public class MaxArray 
{
	public static void main(String[] args)
	{
		int[]arr= {6,9,5,3,5,6};
		max(arr);
		min(arr);
	}
	public static void max(int[]arr)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Max Element : "+max);
	}
	public static void min(int[]arr)
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Min Element : "+min);
	}
}

