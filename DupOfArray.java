package arrays;

import java.util.Arrays;

public class DupOfArray 
{
	public static int[] dup (int [] ar)
	{
		int [] dup = new int [ar.length];
		for(int i=0;i<ar.length;i++)
		{
			dup[i] = ar[i];
		}
		return dup;
	}
	
	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(dup(ar)));
	}
}
