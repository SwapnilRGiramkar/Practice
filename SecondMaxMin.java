//This program gives us Second min and max in java
package arrayPrograms;

public class SecondSmallLarge 
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
		int secMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secMax=max;
				max=arr[i];
			}
			else if(arr[i]>secMax && arr[i]!=max )
			{
				secMax=arr[i];
			}
		}
		return secMax;
	}
	public static int smallest(int[]arr)
	{
		if(arr.length==0)return -1;
		int min =Integer.MAX_VALUE;
		int secMin =Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				secMin=min;
				min=arr[i];
			}
			else if(arr[i]<secMin && arr[i]!=min)
			{
				secMin=arr[i];
			}
		}
		return secMin;
	}
}

