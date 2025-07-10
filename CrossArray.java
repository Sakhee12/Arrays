package arrays;

import java.util.Arrays;

public class CrossArray {

	public static int[] cross(int ar1[],int ar2[])
	{
		int dup [] = new int[ar1.length + ar2.length];
		
		for(int i=0;i<dup.length;i++)
		{
			if (i < ar2.length)
			    dup[i] = ar2[i];
			else
			    dup[i] = ar1[i - ar2.length];
		}
		return dup;	
		
	}
	
	public static void main(String[] args) {
		
		int ar1[]= {1,2,3,4,5,6,7,8,9};
		int ar2[] = {0,1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(cross(ar1,ar2)));
	}
}
