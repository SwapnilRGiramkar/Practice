//Check if Array is Sort or Not 
package strings;

public class CheckArraySort
{
	public static void main(String[] args)
	{
		int[] arr= {1,3,4,2,3,4};
		if(isSort(arr))
		{
			System.out.println("Array Are Sorted ");
		}
		else
		{
			System.out.println("Array is Not Sorted ");
		}
	}
	public static boolean isSort(int []arr)
	{
		boolean asc=true;
		boolean desc=true;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				asc=false;
			}
			if(arr[i]<arr[i+1])
			{
				desc=false;
			}
		}
		return asc || desc;
	}
}

