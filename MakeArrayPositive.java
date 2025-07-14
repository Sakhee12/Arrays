package arrays;

import java.util.Arrays;

public class MakeArrayPositive {

	public static int[] positive(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				ar[i]*=-1;
			}
			
		}
		return ar;
	}
	
	public static void main(String[] args) {
		
		int ar[] = {-1,5,6,-7,5,-6};
		
		System.out.println(Arrays.toString(positive(ar)));
	}
}
