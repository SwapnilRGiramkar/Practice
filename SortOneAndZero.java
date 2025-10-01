//This is the Example where we sort the 1 and 0 in the array
package arrayPrograms;

import java.util.Arrays;

public class SortOnes
{
	public static void main(String[] args) 
	{
		int []arr= {0,1,1,0,0,0,1,1,1,1,1,0};
		int []ans=sortArray(arr);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] sortArray(int[]arr)
	{
		int j=arr.length-1;
		int i=0;
		//int ans[]=new int[j];
		while(i<j)
		{
			if(arr[i]==1)
			{
				i++;
			}
			else if (arr[j]==0)
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

