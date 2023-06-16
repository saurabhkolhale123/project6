package a1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ar3 {public static void main(String[] args) {
	
	
	   int ar[]= {30,20,10,40};
	
	System.out.println(ar.length);    //  4
	System.out.println(ar.length-1);  //  0 to 3
	 
	System.out.println(ar[2]);
	
	System.out.println("=====");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	System.out.println("---------------");
	for(int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	Arrays.sort(ar);
	System.out.println("------------");
	for(int i=0;i<=ar.length-1;i++)
	 {
		System.out.println(ar[i]);
	 }
	
	String ar1[]= {"radha","sita","gita","lata" };
	System.out.println(ar1[0]);
	
}

}
