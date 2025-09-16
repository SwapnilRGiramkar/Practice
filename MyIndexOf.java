//Index Of program built in 
//Program
package strings;

public class MyIndexOf 
{
	public static void main(String[] args)
	{
		String s="Hello World";
		System.out.println("index of H : "+myIndexOf(s,'H'));
	}
	public static int myIndexOf(String s,char ch)
	{
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
				return 1;
		}
		return -1;
	}
}

