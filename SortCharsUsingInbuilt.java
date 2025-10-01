//Sort the character array using inbuilt method Arrays.sort
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
		Arrays.sort(arr);
		return arr;
	}
}

