package arrays;

import java.util.Arrays;

public class TwoDTransposeofMatrix {

	public static void main(String[] args) {
		
		int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
		transpose(a);
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(Arrays.toString(a[i]));
		}
		
	}
	
	public static void transpose(int[][]a)
	{
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(j<i)
				{
					int temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
				}
			}
		}
	}
}
