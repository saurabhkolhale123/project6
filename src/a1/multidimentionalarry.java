package a1;

public class multidimentionalarry {
public static void main(String[] args) {
	
	//row index   0  1  2     cloumn index
	//    0       10 20 30
	//    1       40 50 60
	
	
	int ar[][]=new int[2][3]  ;            //row*column
	
	 ar[0][0]=10;
	 ar[0][1]=20;
	 ar[0][2]=30;
	 ar[1][0]=40;
	 ar[1][1]=50;
	 ar[1][2]=60;
	
	// System.out.println(ar[1][1]);
	 
	 for(int i=0;i<=1;i++)  //outer for  ,for rows
		 
	 {
		 for(int j=0;j<=2;j++)   //inner for ,for columns
		 {System.out.print(ar[i][j]+" ");
		 }
		 System.out.println("");// empty to take nnext line
	 }
	 
	 
	 
	 
	 
	 
	 
}
}
