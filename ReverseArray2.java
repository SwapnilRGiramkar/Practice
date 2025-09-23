//Reverse the Array
package basics;

import java.util.Arrays;

public class ReverseArray1 
{
	public static void main(String[] args) 
	{
		int[]arr= {6,5,4,3,2,1};
		int ans[]=reverse(arr);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] reverse(int []arr)
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

