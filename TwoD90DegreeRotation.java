package arrays;

import java.util.Arrays;

public class TwoD90DegreeRotation 
{

	public static void main(String[] args) {
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		swap(a);
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(Arrays.toString(a[i]));
		}
		
	}
	
	public static void swap(int a[][])
	{
		TwoDTransposeofMatrix.transpose(a);
		
		for(int i=0;i<a.length;i++)
		{
				
			for(int j=0,k=a[i].length-1;j<a.length;j++,k--)
			{
				if(k>j)
				{
					int temp =a[i][k];
					a[i][k]=a[i][j];
					a[i][j]=temp;
				}
		}
	}
	}
}
