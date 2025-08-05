package arrays;
import java.util.Arrays; 
public class TwoDSumOfTwoArray {

	public static void main(String[] args) 
	{

		int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
		int [][] b= {{1,2,3},{1,2,3},{1,2,3}};

		int [][]c = sum(a,b);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(Arrays.toString(c[i]));
		}
	}
	
	public static int[][] sum(int[][]a,int[][]b)
	{
		int [][] c= new int[a.length][a[0].length];
		if(a.length==b.length)
		{
			int i;
			for(i=0;i<a.length;i++)
			{
				if(a[i].length!=b[i].length)
				{
					System.out.println("Not Possible");
					break;
				}
			}
			if(i==a.length)
			{
				
				for(int j=0;j<a.length;j++)
				{
					for(int k=0;k<a[j].length;k++)
					{
						c[j][k] = a[j][k]+b[j][k];
					}
				}
			}
		}
		return c;
	}

}
