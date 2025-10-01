//This example gives us Smallest and Largest element of an array without using sorting
package arrayPrograms;

public class SmallLarge 
{
	public static void main(String[] args)
	{
		int []arr={2,5,1,3,7};
		System.out.println(smallest(arr));
		System.out.println(largest(arr));
	}
	public static int largest(int[]arr)
	{
		if(arr.length==0)return -1;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static int smallest(int[]arr)
	{
		if(arr.length==0)return -1;
		int min =Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
}

