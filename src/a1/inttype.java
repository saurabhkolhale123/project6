package a1;

import java.util.Arrays;

public class inttype {
public static void main (String [] args)
{
	int ar[]=new int[3];
	
	ar[0]=10;
	ar[1]=23;
	ar[2]=43;
	
	
	Arrays.sort(ar);
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	
	
	
	
	
	
}
}
