package arrays;

public class MissingElement 
{
	public static int missing (int ar[])
	{
		for (int j = 1; j <= 9; j++) 
        {
            int cnt = 0;

            for (int i = 0; i < ar.length; i++) 
            {
                if (ar[i] == j) 
                {
                   cnt++;
                    break;
                }
            }

            if (cnt==0) 
                return j; 
            
        }
        return -1; 
    }
	
	
	public static void main(String[] args) {
		
		int ar[] = {1,2,3,5,6};
		
		System.out.println(missing(ar));
	}
}
