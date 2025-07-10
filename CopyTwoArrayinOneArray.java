package arrays;

import java.util.Arrays;

public class CopyTwoArrayinOneArray 
{

	public static int[] Copy(int ar1[],int ar2[])
	{
		int dup [] = new int[ar1.length + ar2.length];
		
		for(int i=0,j=ar1.length; i<dup.length ; i++)
		{
			if(i<ar1.length)
			{
				dup[i]=ar1[i];
			}
			else
			{
				dup[i]=ar2[i-ar1.length];
			}
		}
		return dup;
	}
	
	public static int[] Copy2 (int ar1[],int ar2[])
	{
		int dup [] = new int[ar1.length + ar2.length];
		int val = 0;
		
		for(int i=0; i<ar1.length ; i++,val++)
		{
			dup[val] = ar1[i]; 
		}
		
		for(int i=0; i<ar2.length ; i++,val++)
		{
			dup[val] = ar2[i];
		}
		return dup;
	}
	
	public static void main(String[] args) {
		
		int ar1[] = {59,8,6,72,9,4,9,5};
		int ar2[] = {8,91,37,28};
		
		System.out.println(Arrays.toString(Copy(ar1,ar2)));
		
		System.out.println(Arrays.toString(Copy2(ar1,ar2)));
	}
}
