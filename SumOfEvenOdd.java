package arrays;

public class SumOfEvenOdd {

	public static int Even(int ar[])
	{
		int sum = 0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
				sum+=ar[i];
		}
		return sum;
	}
	
	public static int Odd(int ar[])
	{
		int sum = 0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2!=0)
				sum+=ar[i];
		}
		return sum;
	}
	
	public static void Sum(int ar[])
	{
		int esum =0,osum=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
				esum+=ar[i];
			else
				osum+=ar[i];
						
			//sum= (ar[i]%2==0? (sum+=ar[i]) : (sum+=ar[i]));
		}
		System.out.println("Sum of even is:" +esum);
		System.out.println("sum of odd is:"+osum);
		
	}
	
	public static void main(String[] args) {
		
		int ar [] = {3,4,8,9,5}; 
				
		System.out.println(Even(ar));
		System.out.println(Odd(ar));
		
		Sum(ar);
	}
}
