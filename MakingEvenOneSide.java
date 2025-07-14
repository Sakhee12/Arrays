package arrays;

import java.util.Arrays;

public class MakingEvenOneSide
{
	public static int[] group(int ar[])
	{
		int len[] = new int [ar.length];
		
		int even =0 ,odd= ar.length-1;
		
		for(int i=0,j=0;i<ar.length;i++,j++)
		{
			if(ar[i]%2==0)
			{
				len[even] = ar[i];
				even++;
			
			}
			if(ar[i]%2!=0)
			{
				len[odd] = ar[i];
				odd--;
			}			
		}
		return len;
	}
	
	
	public static void main(String[] args) {
		
		int ar[]= {5,2,4,3,9,6,7,1};
		
		System.out.println(Arrays.toString(group(ar)));
	}
}
