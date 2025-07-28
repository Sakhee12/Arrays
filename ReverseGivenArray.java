package arrays;

import java.util.Arrays;

// REVESING ARRAY WITHOUT CREATING NEW ARRAY
public class ReverseGivenArray {

	public static int[] rev(int ar[])
	{
		for(int i=0,j=ar.length;i<ar.length;i++) {
		if(i<ar.length)
		{
			ar[i]=ar[j-1];
			j--;
		}
		else
		{
			ar[i]=ar[j];
			j++;
		}
		
	}
		return ar;
	}
	
	public static void main(String[] args) {
		
		int ar [] = {1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(rev(ar)));
	}
}
