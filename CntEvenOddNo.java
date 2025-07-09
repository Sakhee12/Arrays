package arrays;

public class CntEvenOddNo {

	public static void Cnt(int ar[])
	{
		int eCnt = 0;
		int oCnt = 0;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]%2==0)
				eCnt++;
			else
				oCnt++;
		}
		System.out.println("Even Count is: "+eCnt);
		System.out.println("Odd Count is: "+oCnt);
	}
	
	public static void main(String[] args) {
		
		int ar [] = {4,8,6,7,2,6};
		
		Cnt(ar);
	}
}
	
	

