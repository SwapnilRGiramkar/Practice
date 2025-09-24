//Sort  the given Array
package basics;

public class ArraySort 
{
	public static void main(String[] args)
	{
		int[]arr= {5,4,3,2,1};
		if(arraySort(arr))
		{
			System.out.println("Array is Sorted");
		}
		else
		{
			System.out.println("Array is Not Sorted");
		}
	}
	public static boolean arraySort(int[]arr)
	{
		boolean asc=true;
		boolean desc=true;
		for(int i=0,j=i+1;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				asc=false;
			}
			else if(arr[i]<arr[i+1])
			{
				desc=false;
			}
		}
		return asc || desc;
	}
}

