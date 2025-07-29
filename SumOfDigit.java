package arrays;

import java.util.Arrays;

public class SumOfDigit {

	public static int Sum(int ar[])
	{
		int sum = 0;
		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
		}
		return sum;	
		
	}
	
		
	public static void main(String[] args) {
		
		int ar [] = {10,20,30,40,50};
		
		System.out.println(Sum(ar));
		
		
	}
}
