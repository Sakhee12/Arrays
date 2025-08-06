package arrays;

import java.util.Arrays;

public class UniqueArray 
{
	public static void main(String[] args) {
		
		int ar[] = {1,2,3,3,4,4,5,6,1,2,5,6};
		
		System.out.println(Arrays.toString(unique(ar)));
	}
	
	public static int[] unique(int ar[])
	{
		boolean [] occ = new boolean[ar.length];
		int cnt=0;
		for(int i=0;i<ar.length;i++)
		{
			if(!occ[i])
			{
				for(int j=i+1;j<ar.length;j++)
				{
					if(ar[i]==ar[j])
					{
						cnt++;
						occ[j]=true;
					}
				}
			}
		}
		int ans[] = new int[ar.length-cnt];
		for(int i=0,j=0;i<ar.length;i++)
		{
			if(!occ[i])
			{
				ans[j++]=ar[i];
			}
		}
		return ans;
		
	}
}
