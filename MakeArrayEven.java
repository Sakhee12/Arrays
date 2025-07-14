package arrays;

import java.util.Arrays;

public class MakeArrayEven 
{
	public static int[] missing(int ar[])
	{
		//int temp[]=new int [ar.length];
		for(int i=0;i<ar.length;i++)
		{
			if (ar[i] % 2 != 0)
            {
                ar[i] += 1; 
            }
            //temp[i] = ar[i];
		}
		return ar;
	}
	
	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4};
		
		System.out.println(Arrays.toString(missing(ar)));
	}
	
}
