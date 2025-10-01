//This is the Example of Reverse the given array
package arrayPrograms;

import java.util.Arrays;

public class Reverse 
{
	public static void main(String[] args) 
	{
		int[]arr= {1,2,3,4,5};
		int[]ans=reverse(arr);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] reverse(int[]arr)
	{
		int []ans=new int[arr.length];
		int i=0;
		for(int j=arr.length-1;j>=0;j--)
		{
			ans[i++]=arr[j];
		}
		return ans;
	}
}

