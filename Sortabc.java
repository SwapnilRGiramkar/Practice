//This is the Example we sort the A,B,C from character array
package arrayPrograms;

import java.util.Arrays;

public class SortChars 
{
	public static void main(String[] args) 
	{
		char []arr= {'a','c','b','a','c','b','a','c','b'};
		char []ans=sortArray(arr);
		System.out.println(Arrays.toString(ans));
	}
	public static char[] sortArray(char[]arr)
	{
		int i=0;
		int j=arr.length-1;
		int mid=0;
		while(mid<=j)
		{
			if(arr[mid]=='a')
			{
				swap(arr,i,mid);
				i++;
				mid++;
			}
			else if(arr[mid]=='b')
			{
				mid++;
			}
			else
			{
				swap(arr,mid,j);
				j--;
			}
		}
		return arr;
	}
	public static void swap(char[]arr,int i,int j)
	{
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}

