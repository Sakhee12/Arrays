package arrays;

import java.util.Arrays;

public class TwoD90RotationTejus {

	public static void main(String[] args) {
		
		char ch [][] = {{'a','b','c','d'},
						{'a','b','c','d'},
						{'a','b','c','d'}};
		
		rotate90(ch);
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(Arrays.toString(ch[i]));
		}
		
	}
	
	public static void rotate90(char [][] ch)
	{
		transpose(ch);
		
		reverse2D(ch);
	}
	
	public static void transpose(char [][] ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i;j<ch[i].length;j++)
			{
				char temp;
				if(j>i)
				{
					temp=ch[i][j];
					ch[i][j]=ch[j][i];
					ch[j][i]=temp;
				}
			}
		}
	}
	
	public static void reverse2D(char[][] ch)
	{
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=reverseArray(ch[i]);
		}
	}
	
	public static char[] reverseArray(char[] ch)
	{
		int i=0,j=ch.length-1;
		while(i<j)
		{
			char temp = ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			
			i++;
			j--;
		}
		return ch;
	}
}
