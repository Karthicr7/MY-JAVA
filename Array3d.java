package Basics;
import java.util.Scanner;
public class Array3d {
   public static void main(String[]args) {
	   Scanner in2=new Scanner(System.in);
	   int A[][][]=new int[3][2][4];
	   
	   int i,j=0,k,d=0;
	   for(i=0;i<3;i++) {
		   d=0;
		   for(j=0;j<2;j++) {
			   for(k=0;k<4;k++) {
				   if(i==0) {
					   System.out.format("Enter the %d'th person Date :",d);
					   A[i][j][k]=in2.nextInt();
					   d++;
				   }
				   if(i==1) {
					   System.out.format("Enter the %d'th person month :",d);
					   A[i][j][k]=in2.nextInt();
					   d++;
				   }
				   if(i==2) {
					   System.out.format("Enter the %d'th person year :",d);
					   A[i][j][k]=in2.nextInt();
					   d++;
				   }
		   
	   }
   }
	
	   }
	   for(i=0;i<3;i++) { if(i==0) {
		   System.out.println("DATE");
		   
			  
	   }if(i==1) {
		   System.out.println("MONTH");
		  
	   }if(i==2) {
		   System.out.println("YEAR");
		  
	   }
		   for(j=0;j<2;j++) {
			   for(k=0;k<4;k++) {
				  
				   System.out.print(A[i][j][k]+" ");
		  
	   }
		System.out.println();	   
   }
	
	   }
}}