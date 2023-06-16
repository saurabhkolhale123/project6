package a1;

import java.util.Arrays;

public class m3 {
public static void main(String[] args) {
	
	int ar[]= {500,20,80};
	
	//System.out.println(ar[1]);
	Arrays.sort(ar);
	
	for(int i=0;i<=2;i++)
	{
		System.out.println(ar[i]);
	}
	System.out.println("-----------------");
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
}
}
