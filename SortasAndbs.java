//This is the example to sort a's and b's of an array
package arrayPrograms;

import java.util.Arrays;

public class SortChar 
{
	public static void main(String[] args) 
	{
		char []arr= {'a','a','b','b','a','b','a','a','b','b','a','b'};
		char []ans=sortArray(arr);
		System.out.println(Arrays.toString(ans));
	}
	public static char[] sortArray(char[] arr)
	{
		int j=arr.length-1;
		int i=0;
		while(i<j)
		{
			if(arr[i]=='a')
			{
				i++;
			}
			else if(arr[j]=='b')
			{
				j--;
			}
			else
			{
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;j--;
			}
		}
		return arr;
	}
}

