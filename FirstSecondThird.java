//This program gives 1st,2nd,3rd max and min element of an array
package basics;

public class SecondLargest 
{
	public static void main(String[] args) 
	{
		int []arr= {10, 25, 5, 45, 15, 30};
		secondLarge(arr);
		
	}
	public static void secondLarge(int []arr)
	{
		int max=Integer.MIN_VALUE;
		int sMax=Integer.MIN_VALUE;
		int tMax=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int sMin=Integer.MAX_VALUE;
		int tMin=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				sMax=max;
				max=arr[i];
			}
			else if(arr[i]>sMax && max!=sMax)
			{
				tMax=sMax;
				sMax=arr[i];
			}
			else if(arr[i]>tMax && sMax!=tMax)
			{
				tMax=arr[i];
			}
			
			if(arr[i]<min)
			{
				sMin=min;
				min=arr[i];
			}
			else if(arr[i]<sMin && min!=sMin)
			{
				tMin=sMin;
				sMin=arr[i];
			}
			else if(arr[i]<tMin && sMin!=tMin)
			{
				tMin=arr[i];
			}
		}
		System.out.println("FirstMax : "+max);
		System.out.println("SecondMax : "+sMax);
		System.out.println("ThirdMax : "+tMax);
		System.out.println("-------------------------------------");
		System.out.println("FirstMin : "+min);
		System.out.println("SecondMin : "+sMin);
		System.out.println("ThirdMin : "+tMin);
	}
}

