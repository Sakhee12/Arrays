package arrays;

import java.util.Arrays;

public class Union 
{
 
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		int b[] = {1,9,8,7,2,3};
		
		System.out.println(Arrays.toString(union(a,b)));
	}
	
	public static int[] union(int a[], int b[])
	{
		boolean [] occA = new boolean[a.length];
		boolean [] occB = new boolean[b.length];
		int ct=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					ct++;
					occA[j]=true;
					occB[i]=true;
				}
			}
		}
		
		if(ct>0)
		{
			int ans [] = new int [(a.length-ct)+(b.length-ct)];
			for(int i=0,j=0;i<a.length;i++)
			{
				if(occA[i]!=true)
					ans[j++]=a[i];
					
				if(occB[i]!=true)
					ans[j++]=b[i];
			}
			return ans;
		}
		return a;
		
	}
}
