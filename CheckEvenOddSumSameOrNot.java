package arrays;

public class CheckEvenOddSumSameOrNot {

	public static boolean Sum(int ar[])
	{
		int eSum=0;
		int oSum=0;
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]%2==0)
				eSum+=ar[i];
			else
				oSum+=ar[i];
		}
		return eSum==oSum;
	}
	
	public static void main(String[] args) {
		
		int ar[] = {2,4,6,7,7,5};
		System.out.println(Sum(ar)?"Even and Odd's Sum is Same.":"Even and Odd's Sum is not Same.");
	}
}
