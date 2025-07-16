package arrays;

import java.util.Arrays;

public class MergingOnSpecificIndex 
{
	
	public static void main(String[] args) 
	{
		int ar1[] = {1,2,3,4,5};
		int ar2[] = {100,200,300};
		
		System.out.println(Arrays.toString(merge(ar1,ar2,2)));
	}
	public static int[] merge(int ar1[],int ar2[],int index)
	{
		int i=0,j;
		int ans[] = new int[ar1.length + ar2.length];
		if(i<=index && index<ar1.length)
		{
			
			for(j=0; i<ans.length;i++)
			{
				if(i<index)
					ans[i] = ar1[i];
				
				else if(i>=index && j<ar2.length)
				{
					ans[i]= ar2[j];
					j++;
				}
				else if(i<ans.length)
				{
					ans[i] = ar1[i-ar2.length];
					
				}
					
			}
			
		}
		return ans;
	}
}
