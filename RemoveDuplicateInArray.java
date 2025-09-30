//This is the example of Remove the duplicates from an Array
package arrayPrograms;

import java.util.Arrays;

public class RemoveDuplicates 
{
	public static int remove(int[]arr)
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
		return i+1;
	}
	public static void main(String[] args) 
	{
		int []arr= {1, 1, 2, 2, 1,1,3,2,2, 4,3,3, 5};
		int k=remove(arr);
		System.out.println("Count : "+k);
		for(int i=0;i<k;i++)
		{
			System.out.println(arr[i]+"");
		}
	}

}

