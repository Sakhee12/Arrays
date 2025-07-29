package arrays;

import java.util.Arrays;

public class RevPallindrome {

	public static int[] Rev(int ar[])
	{
		int dup [] = new int[ar.length];
		for(int i=0; i<ar.length; i++)
		{
			dup[i] = ar[ar.length-1-i];
		}
		return dup;
	}
	
	public static boolean CheckPall(int dup[] ,int ar[])
	{
		if (Arrays.toString(dup).equals(Arrays.toString(ar)))
			return true;
		else
			return false;
	}
	
	public static boolean Pall(int[] ar)
	{
		int i=0,j=ar.length-1;
		while(i<j)
		{
			if(ar[i]==ar[j])
			{
				i++;
				j--;
			}
			else
				break;
		}
		return i>=j;
	}
	
	public static void main(String[] args) {
		
		int [] ar = {1,2,3,4,5,3,2,1};
		
		System.out.println(Pall(ar)?"True":"False");
		
		if(CheckPall(Rev(ar),ar))
			System.out.println("Array is Pallindrome");
		else
			System.out.println("Array is not Pallindrome");
	}
}
