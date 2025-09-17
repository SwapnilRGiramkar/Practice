//This Program gives first smallest and largest
package basics;

public class FirstLArgestSmallest
{
	public static void main(String[] args) 
	{
		int []arr= {10, 25, 5, 45, 15, 30};
		largeSmall(arr);
	}
	public static void largeSmall(int []arr)
	{
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}

