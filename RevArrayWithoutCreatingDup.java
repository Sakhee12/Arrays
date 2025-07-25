package arrays;

import java.util.Arrays;

public class RevArrayWithoutCreatingDup 
{
	public static void main(String[] args) 
	{
	
		int ar [] = {1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(rev(ar)));;
		
		System.out.println(Arrays.toString(ar));
		
		rev2(ar);
		
	}
	
	public static int[] rev(int ar[])
	{
		int i=0 , j=ar.length-1;
		
		while(i<j)
		{
			ar[i] = ar[i]+ar[j];
			ar[j] = ar[i]-ar[j];
			ar[i] = ar[i]-ar[j];
			i++;
			j--;
		}
		return ar;
	}
	
	public static void rev2(int ar[])
	{
		int i=0, j=ar.length-1, temp =0;
		
		while(i<j)
		{
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(ar));
	}
}
