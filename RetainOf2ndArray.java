package arrays;

import java.util.Arrays;

public class RetainOf2ndArray 
{

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		
		int b[] = {2,3,51,6,2,4,23,6};
		
		System.out.println(Arrays.toString(retain(a,b)));
	}
	
	public static int[] retain(int []a,int []b)
	{
		 int count[] = new int[a.length];
			    int cnt = 0;

			    for (int i = 0; i < a.length; i++) 
			    {
			       
			        for (int j = 0; j < b.length; j++) 
			        {
			            if (a[i] == b[j]) 
			            {
			                count[i] = -1; 
			                cnt ++;
			                break;
			              }
			        }

			       
			    }

			   
			    int ans[] = new int[cnt];
			    int k = 0;

			    for (int i = 0; i < a.length; i++) 
			    {
			        if (count[i] == -1) 
			        {
			            ans[k++] = a[i];
			        }
			    }

			    return ans; 
			}
	
	}

