package arrays;

public class TwoDSum {

	public static void main(String[] args) {
		
		int ar[][] = { {1,2,3,4},{2,9,8,6},{4,7,6,2}};
		int count = 0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				count+=ar[i][j];
			}
		}
		System.out.println(count);
	}
}
