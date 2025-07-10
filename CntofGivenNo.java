package arrays;

public class CntofGivenNo {

	public static int Check(int ar[],int num)
	{
		int cnt = 0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==num)
				cnt++;
		}
		return cnt;
		
	}
	
	public static void main(String[] args) {
		
		int ar[] = {5,8,3,9,4,3,8,7,5};
		
		System.out.println("The repetitions of the given no is:"+Check(ar,9));
	}
}
