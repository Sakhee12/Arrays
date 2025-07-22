package arrays;

import java.util.Arrays;

public class RemoveAllOccuranceOfElement 

{

	public static void main(String[] args) {
		
		int ar[] = {1,2,4,3,6,2,5,7,16,8,6};
		
		System.out.println(Arrays.toString(remove(ar,6)));
	}
	
	public static int[] remove(int ar[] , int ele)
	{
		int ct=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==ele)
				ct++;
			
		}
		if(ct>0)
		{
			int ans[] = new int[ar.length-ct];
			for(int i=0,j=0;i<ar.length;i++)
			{
				if(ar[i]!=ele)
					ans[j++]=ar[i];
			}
					
			return ans;
		}
		return ar;
	}
}
