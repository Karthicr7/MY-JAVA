package Basics;

import java.util.Scanner;
public class pratice3 {
  public static void main(String[]args) {
	  int n;
	  Scanner in1=new Scanner(System.in);
	  System.out.format("Enter the length of the array :");
	  n=in1.nextInt();
	  int arr[]=new int[n];
	  int i;
	  for(i=0;i<n;i++) {
		  System.out.format("Enter arr[%d] :",i);
		  arr[i]=in1.nextInt();
		  
	  }int temp=0,j=0;
	  
	  for(i=0;i<n;i++) {
		 int min1=i;
		   for(j=i;j<n-1;j++) {
			  if(arr[min1]<arr[j+1]) {
				  min1=j;
				  
			  }temp=arr[j+1];
			  arr[j+1]=arr[min1];
			  arr[min1]=temp;
			  
		  }
	  }
		  
	  
	  for(i=0;i<n;i++) {
		  System.out.format(" arr[%d] = %d :",i,arr[i]);
  }
}
}
