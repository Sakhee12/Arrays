package arrays;

import java.util.Arrays;

public class MakingPosOneSide {

	public static int[] group(int ar[])
	{
		int dup[] = new int [ar.length];
		int positive=ar.length-1, negative =0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<0)
			{
				dup[negative]=ar[i];
				negative++;
			}
			if(ar[i]>0)
			{
				dup[positive]=ar[i];
				positive--;
			}
		}
		return dup;
	}
	
	public static void main(String[] args) {
		
		int ar[] = {-5,6,8,4,2,-5,-4,4,-2,-3};
		
		System.out.println(Arrays.toString(group(ar)));
	}
}
