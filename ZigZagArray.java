package arrays;

import java.util.Arrays;

public class ZigZagArray {

	public static int[] zigZag(int ar1[],int ar2[])
	{
		int dup[] = new int[ar1.length + ar2.length];
		
		int val1 = 0 ,val2=0;
		for(int i=0;i<dup.length;i++)
		{
			if(i%2==0 && val1<ar1.length)
			{
				dup[i]=ar1[val1];
				val1++;
			}
			else if(i%2!=0 && val2<ar2.length)
			{
				dup[i]=ar2[val2];
				val2++;
				
			}
		}
		return dup;
	}
	
		public static int[] zigZag2(int[] ar1, int[] ar2) 
		{
		    int maxLen;
		    if (ar1.length > ar2.length)
		        maxLen = ar1.length;
		    else 
		        maxLen = ar2.length;
		    

		    int[] dup = new int[ar1.length + ar2.length]; 
		    int k = 0; 

		    for (int i = 0; i < maxLen; i++) {
		        if (i < ar1.length) {
		            dup[k++] = ar1[i];  
		        }
		        if (i < ar2.length) {
		            dup[k++] = ar2[i];  
		        }
		    }

		    return dup;
		}

	
	
		public static void main(String[] args) {
		
		int ar1[]= {2,2,2,2,2,2,2,2,2,2,2};
		int ar2[] = {1,1,1,1,1,1,1,1};
		
		System.out.println(Arrays.toString(zigZag(ar1,ar2)));
		
		System.out.println(Arrays.toString(zigZag2(ar1,ar2)));
	
	}
}
