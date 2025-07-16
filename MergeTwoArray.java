package arrays;

import java.util.Arrays;

public class MergeTwoArray 
{
	public static void main(String[] args) {
		
		int ar1[] = {10,20,30,40,50};
		
		int ar2[] = {100,200,300,400,500};
		
		System.out.println(Arrays.toString(add(ar1,ar2,2,4)));
		
	}
	public static int[] add (int ar1[] , int ar2[] , int index1 , int index2 )
	{
		int op[] = new int[ar1.length+ar2.length];
		
		int i,j,k;
		for(i=0,j=0,k=index1;i<op.length;i++)
		{
			if(i<index1)
			{
				op[i] = ar1[i];
			}
			else if(i==index1 ) {
				while(j<index2)
				{
					op[i] = ar2[ar1.length-i];
					j++;
				}
			}
			else
			{
				while(k<ar1.length)
				{
					op[i] = ar1[k];
					k++;
				}
			}
		}
		return op;
	}
}
