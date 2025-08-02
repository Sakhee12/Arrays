package arrays;

import java.util.Scanner;

public class TwoDStoringArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Of array: ");
		int [][] ar = new int[sc.nextInt()][sc.nextInt()];
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements are: ");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.print(ar[i][j]+",");
			}
			System.out.println();
		}
	}
}
