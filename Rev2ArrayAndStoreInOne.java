package arrays;

import java.util.Arrays;

public class Rev2ArrayAndStoreInOne {

	public static int[] rev(int ar1[],int ar2[])
	{
		int dup [] = new int[ar1.length + ar2.length];
		
		for(int i=0,j=ar2.length;i<dup.length;i++)
		{
			if(i<ar1.length)
			{
				dup[i] = ar1[ar1.length-1-i];
			}
			else
			{
				dup[i] = ar2[j-1];
				j--;
			}
		}
		return dup;
		
	}
	
	public static void main(String[] args) {
		
		int ar1[]= {1,2,3,4,5,6,7,8,9};
		int ar2[] = {0,1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(rev(ar1,ar2)));
		
		
	}
}
