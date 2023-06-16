package a1;

import java.util.Arrays;

public class sorting {
public static void main(String[] args) {
		
		int ar[]=new int[4];
		
		ar[0]=50;
		ar[1]=20;
		ar[2]=70;
		ar[3]=40;
		
		
		
		Arrays.sort(ar);     //classname.methodname(arrayobjectname);
		
		for(int x=0;x<=3;x++)
		  {System.out.println(ar[x]);}
		
		System.out.println("................");
		for(int x=ar.length-1;x>=0;x--)
		  {System.out.println(ar[x]);}
		
		
		
		
		
		
		
		
		
		
		
		
}
}
