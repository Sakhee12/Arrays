package arrays;

import java.util.Arrays;

public class HalfRev {

	public static int[] Rev(int ar[])
	{
		int dup [] = new int [ar.length];
		int len = ar.length-1	;	
		for(int i=ar.length/2;i<ar.length;i++,len--)
		{
			dup[i]=ar[len];
		}
		for(int i=0;i<ar.length/2;i++)
		{
			dup[i]=ar[i];	
		}
		
		return dup;
	}
		
	public static int[] Rev3(int ar[])
	{
		int dup [] = new int [ar.length];
		
		for(int i=0,j=ar.length-1;i<ar.length;i++)
		{
			if(i<ar.length/2)
				dup[i]=ar[i];
			
			else
			{
				dup[i] = ar[j];
				j--;
			}
		}
		return dup;
	}
	
	
	public static void main(String[] args) {
		
		int ar[] = {8,9,2,5,4,3,7};
		
		System.out.println(Arrays.toString(Rev(ar)));
		
		System.out.println(Arrays.toString(Rev3(ar)));
	}
}
