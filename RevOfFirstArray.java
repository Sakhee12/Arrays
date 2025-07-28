package arrays;

import java.util.Arrays;

public class RevOfFirstArray {

	public static int[] Rev(int ar1[],int ar2[])
	{
		int dup [] = new int[ar1.length + ar2.length];
		
		int mem=0;
		for(int i=0;i<ar1.length;i++,mem++)
		{
			dup[mem]=ar1[ar1.length-i-1];
		}
		for(int i=0;i<ar2.length;i++,mem++)
		{
			dup[mem] = ar2[i];
		}
		return dup;
	}
	
	public static int[] rev2(int ar1[],int ar2[])
	{
		int dup [] = new int[ar1.length + ar2.length];
		
		
		for(int i=0,j=ar1.length;i<dup.length;i++)
		{
			if(i<ar1.length)
			{
				dup[i]=ar1[j-1];
				j--;
			}
			else
			{
				dup[i]=ar2[j];
				j++;
			}
		}
		return dup;
	}
	
	public static void main(String[] args) {
		
		int ar1[]= {9,8,4,59,49,45,6,72,5};
		int ar2[]= {59,5,8,1,36,74,5,9,5,7,5};
		
		System.out.println(Arrays.toString(Rev(ar1,ar2)));
		
		System.out.println(Arrays.toString(rev2(ar1,ar2)));
	
	}
}
