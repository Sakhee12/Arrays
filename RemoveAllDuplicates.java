package arrays;

import java.util.Arrays;

public class RemoveAllDuplicates 
{
	public static void main(String[] args) {
		
		int ar[] = {1,2,5,34,25,5,24,2,2};
		
		System.out.println(Arrays.toString(dup(ar)));
	}
	
	public static int[] dup(int ar[])
	{
		int [] freq = frequency(ar);
		
		int negCount=0;
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]==-1)
				negCount++;
		}
		int ans[] = new int[ar.length-negCount];
		for(int i=0,j=0;i<ar.length;i++)
		{
			if(freq[i]!=-1)
			{
				ans[j]=ar[i];
				j++;
			}
		}
		return ans;
	}
	
	public static int[] frequency(int ar[])
	{
		int count[] = new int [ar.length];
		for(int i=0;i<ar.length;i++)
		{
			int ct=0;
			if(count[i]!=-1)
			{
				for(int j=i+1;j<ar.length;j++)
				{
					if(ar[i]==ar[j])
					{
						ct++;
						count[j]=-1;
					}
				}
			}
			
		}
		return count;
	}
}
