package a1;

public class addmult {
public static void main(String[] args) {
	

	int ar[]= {10,20,30};
	int ar1[]= {10,20,30};
	
	int sum=0;
	for(int i=0;i<=ar.length-1;i++)
	{
		for(int j=0;j<=ar1.length-1;j++)
			
		{
			sum=ar[i]+ar1[j];System.out.print(sum+" ");
		}
		System.out.println();
	}
	
	
	
}
}