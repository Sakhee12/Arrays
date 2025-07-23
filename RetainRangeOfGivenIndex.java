package arrays;

import java.util.Arrays;

public class RetainRangeOfGivenIndex 
{
	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(retain(ar,2,5)));
	}
	
	public static int[] retain(int ar[] , int start , int end)
	{
		int ans [] = new int[(end-start)+1];
		if(start<end && end<=ar.length)
		{
			for(int i=start,j=0;i<=end;i++,j++)
			{
					ans[j] = ar[i];		
			}
			
		}
		return ans;	
	}
}
