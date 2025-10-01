//Smallest and largest element of an array using the Sorting the Array
package arrayPrograms;

import java.util.Arrays;

public class SmallestElement
{
	public static void main(String[] args)
	{
		int []arr={2,5,1,3,7};
		System.out.println(smallest(arr));
		System.out.println(largest(arr));
	}
	public static int smallest(int[]arr)
	{
		Arrays.sort(arr);
		return arr[0];
	}
	public static int largest(int []arr)
	{
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
}

