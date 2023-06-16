package a1;

import java.util.Arrays;

public class str {
	public static void main(String[] args) {
		
		String ar[]=new String[4];
		
	    ar[0]="raghu";
	    ar[1]="ganesh";
	    ar[2]="deepak";
	    ar[3]="sandesh";
		Arrays.sort(ar);
		System.out.println(ar[2]);//raghu   //here sorting so value aco. to sorting
		System.out.println("------------");
		for(int i=0;i<=ar.length-1;i++)
		{                                     // deepak
			                                  // ganesh
			                                  // raghu
			                                  // sandesh
			System.out.println(ar[i]);
		}
		System.out.println("-----------");
		
		for(int i=3;i>=0;i--)
		{
			System.out.println(ar[i]);         /* sandesh
			                                     raghu
			                                     ganesh
			                                 	 deepak*/
		}
		
		String ar1[]=new String[5];
		
		
	}

}
