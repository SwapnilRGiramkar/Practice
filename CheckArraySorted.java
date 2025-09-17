//Check given array is sorted or not 
package basics;

public class CheckArraySorted
{
	public static void main(String[] args) 
	{
		int []arr= {1,2,3,4,5,6};
		if(arraySort(arr))
		{
			System.out.println("Array Sorted");
		}
		else
		{
			System.out.println("Array Not Sorted");
		}
	}
	public static boolean arraySort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<arr[i+1])
			{
				return true;
			}
		}
		return false;
	}
}

