package arrays;

public class CheckGivenNoPresentOrNot {

	public static boolean Check(int ar[],int num)
	{
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]==num)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int ar [] = {5,8,7,9,8,6};
				
		System.out.println(Check(ar,10)?"Yes":"No");
	}
}
