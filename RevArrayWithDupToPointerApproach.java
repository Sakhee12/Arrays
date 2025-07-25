package arrays;

import java.util.Arrays;

public class RevArrayWithDupToPointerApproach 
{
	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(rev2(ar)));
		
	}
	
	public static int[] rev2(int ar[])
	{
		int rev[] = new int[ar.length];
		
		int i=0 , j=ar.length-1;
		
		while(i<=j)
		{
			rev[i] = ar[j];
			rev[j] = ar[i];
			i++;
			j--;
		}
		
		return rev;
 	}
}
