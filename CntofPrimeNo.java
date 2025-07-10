package arrays;

public class CntofPrimeNo {

	
	public static int isPrime(int ar[])
	{
		int cnt=0;
		int den=2;
		for(int i=0;i<ar.length;i++) {
		while(den<ar[i])
		{
			if(ar[i]%den==0)
				break;
			den++;
			
			if(ar[i]==den)
				cnt++;
		}
		}
		
		return cnt;
			
	}
	
	/*
	public static int CntP(int ar[])
	{
		int cnt=0;
		for(int i=0;i<ar.length;i++)
		{
			if(isPrime(ar[i]))
			{
				cnt++;
			}
		}
		return cnt;
	}
	*/
	public static void main(String[] args) {
		
		int ar[]= {4,3,7,9,8,5,11};
		
		//System.out.println(CntP(ar));
		
		System.out.println(isPrime(ar));
	}
}
