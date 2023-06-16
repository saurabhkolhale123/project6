package a1;

public class ar1 {
	
	public static void main(String[] args) {
		
	  //first we check which type of information we have to assing in array  then declaration	
		
		//step 1. declaration
		String ar[]=new String[5];  //length 5  index o to 4   ( create object of array )
	
//array data type  array name [array sign] = blank sapce array size	
		
		
		//step 2.initialization 
		ar[0]="ram";
		ar[1]="rahul";
		ar[2]="radha";
		ar[3]="ramesh";
		ar[4]="raghu";
		System.out.println("length "+(ar.length));
		System.out.println("index "+(ar.length-1));
		//step 3. usage
		System.out.println(ar[2]);
		System.out.println(ar[4]);
		System.out.println("----------------");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		
		
		
		
	}
	
	
	

}
