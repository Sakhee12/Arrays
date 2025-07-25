package arrays;
import java.util.Arrays;

public class ReverseArray 
{
	public static int[] Rev(int ar[])
	{
		int dup[] = new int [ar.length];
		for(int i=0; i<ar.length; i++)
		{
			dup[i] = ar[ar.length-1-i];
		}
		return dup;
	}
	
	public static int[] Rev2(int ar[])
	{
		int dup[] = new int [ar.length];
		for(int i=0, j=ar.length-1;i<ar.length;i++,j--)
		{
			dup[j] = ar[i];
		}
		return dup;
	}
	
	public static void main(String[] args) {
		
		int [] ar = {2,8,021,46,47};
		
		System.out.println(Rev(ar));
		
		System.out.println(Arrays.toString(Rev(ar)));
		
		System.out.println(Arrays.toString(Rev2(ar)));
		
	}
}
