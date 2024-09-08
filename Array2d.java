package Basics;
import java.util.Scanner;
public class Array2d {
   public static void main(String[]args) {
	   Scanner in2=new Scanner(System.in);
	   int A[][]=new int[3][2];
	   int B[][]=new int[2][3];
	   int C[][]=new int[3][3];
	   int i,j=0,k;
	   for(i=0;i<3;i++) {
		   for(j=0;j<2;j++) {
		   System.out.format("Enter the value of A[%d][%d] :",i,j);
		   A[i][j]=in2.nextInt();
	   }
   }
	   for(i=0;i<2;i++) {
		   for(j=0;j<3;j++) {
		   System.out.format("Enter the value of B[%d][%d] :",i,j);
		   B[i][j]=in2.nextInt();
	   }
   }
	   for(i=0;i<3;i++) {
		   for(j=0;j<3;j++) {
			   C[i][j]=0;
			   for(k=0;k<2;k++) {
		      C[i][j]+=A[i][k]*B[k][j];
		      
		    
	   }
   }
}
	   for(i=0;i<3;i++) {
		   for(j=0;j<2;j++) {
		   System.out.print(A[i][j]+" ");
		   
	   }
		   System.out.println();
   } for(i=0;i<2;i++) {
	   for(j=0;j<3;j++) {
	   System.out.print(B[i][j]+" ");
	   
   }System.out.println();
}
	   for(i=0;i<3;i++) {
		   for(j=0;j<3;j++) {
		   System.out.print(C[i][j]+" ");
		   
	   }System.out.println();
   }
}}