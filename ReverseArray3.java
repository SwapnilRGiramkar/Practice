//Reverse Array Another Logic 
package basics;

import java.util.Arrays;

public class Rev 
{
	public static void main(String[] args) 
	{
		int [] arr= {1,2,3,4,5};
		int []ans=reverse(arr);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] reverse(int []arr)
	{
		int []ans=new int [arr.length];
		for(int i=arr.length-1,j=0;i>=0;i--)
		{
			ans[j++]=arr[i];
		}
		return ans;
	}
}

