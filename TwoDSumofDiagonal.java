package arrays;

public class TwoDSumofDiagonal 
{
	public static void main(String[] args) {
		
		int [][] ar = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		System.out.println(sum(ar));
		
	}
	
	public static int sum(int ar[][])
	{
		int sum = 0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				if(i==j)
				{
					sum+=ar[i][j];
				}
			}
		}
		return sum;
	}
}
