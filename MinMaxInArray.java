//Min and MAx of an Array
package basics;

public class MinMax 
{
	public static void main(String[] args) 
	{
		 int[] numbers = {10, 25, 5, 45, 15, 30};
		 int max=Integer.MIN_VALUE;
		 int min=Integer.MAX_VALUE;
		 for(int i=0;i<numbers.length-1;i++)
		 {
			 if(numbers[i]>max)
			 {
				 max=numbers[i];
			 }
			 else if(numbers[i]<min)
			 {
				 min=numbers[i];
			 }
		 }
		 System.out.println(max);
		 System.out.println(min);
	}
}

