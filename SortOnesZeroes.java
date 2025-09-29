//this is the example of sort the one and zeroes in same array
package arrayPrograms;

import java.util.Arrays;

public class SortOnesZeros 
{
	public static void main(String[] args) 
	{
		int []arr= {0,1,1,0,0,0,1,1,1,1,1,0};
		int []ans=sortArray(arr);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] sortArray(int[]arr)
	{
		int i=0,j=arr.length-1;
		while(i<j)
		{
			if(arr[i]==1)
			{
				i++;
			}
			else if(arr[j]==0)
			{
				j--;
			}
			else
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;j--;
			}
		}
		return arr;
	}
}

