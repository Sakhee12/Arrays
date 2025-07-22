package arrays;

public class RecurringNo {

	public static void main(String[] args) {
		
		int ar[] = {5,8,3,9,4,3,8,7,5};
		
		Rec(ar);
		
	}
	
	public static void Rec(int ar[])
	{
		for(int i=0; i<=9 ; i++)
		{
			int cnt = 0;
			for(int j=0; j<ar.length ; j++)
			{
				if(ar[j]==i)
					cnt++;		
			}
			if((cnt!=0))
				System.out.println(i+":"+cnt);
		}
	}
}
