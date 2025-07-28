package arrays;

import java.util.Arrays;

public class RevOfSecondArray {

	public static int[] Rev(int ar1[],int ar2[])
	{
		int rev [] = new int [ar1.length + ar2.length];
		int val=ar2.length;
		
		for(int i=0;i<rev.length;i++)
		{
			if(i<ar1.length)
			{
				rev[i]=ar1[i];
			}
			else
			{
				rev[i]=ar2[val-1];
				val--;
				
			}
		}
		return rev;
	}
	
	public static int[] Rev2(int ar1[],int ar2[])
	{
		int dup[] = new int[ar1.length + ar2.length];
		
		int mem=0;
		for(int i=0;i<ar1.length;i++,mem++)
		{
			dup[mem]=ar1[i];
		}
		
		for(int i=0;i<ar2.length;i++,mem++)
		{
			dup[mem]=ar2[ar2.length-1-i];
		}
		return dup;
	}
	
	public static void main(String[] args) {
		
		int ar1[] = {8,6,4,7,2,8,5};
		
		int ar2[] = {7,9,5,7,52,8,2,9};
		
		System.out.println(Arrays.toString(Rev(ar1,ar2)));
		
		System.out.println(Arrays.toString(Rev2(ar1,ar2)));
	}
}
