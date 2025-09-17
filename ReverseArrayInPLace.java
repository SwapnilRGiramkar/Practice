//REverse array in place
package basics;

import java.util.Arrays;

public class ReverseArrayInPlace
{
	public static void main(String[] args) 
	{
		int []arr= {10, 25, 5, 45, 15, 30};
		System.out.println(Arrays.toString(reverseArray(arr)));
	}
	public static int[] reverseArray(int[] arr)
	{
		for(int i=0,j=arr.length-1;i<j;i++,j--)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		return arr;
	}
}

