//Check Duplicates and returned unoique array
package arrayPrograms;

import java.util.Arrays;

public class CheckDups 
{
	public static void main(String[] args) 
	{
		int []arr= {1, 1, 2, 2, 3, 4, 5};
		int []ans=dupArr(arr);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] dupArr(int[]arr)
	{
		Arrays.sort(arr);
		int i=0;
		for(int j=1;j<arr.length;j++)
		{
			if(arr[i]!=arr[j])
			{
				i++;
				arr[i]=arr[j];
			}
		}
		
		return Arrays.copyOfRange(arr, 0, i + 1);
	}
}

