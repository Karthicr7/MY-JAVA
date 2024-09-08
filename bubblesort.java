package Basics;

import java.util.Scanner;
import java.util.Scanner;
public class bubblesort {
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
		  
		  for(i=0;i<n-1;i++) {
			   for(j=0;j<n-1;j++) {
				  if(arr[j]>arr[j+1]) {
				     
					  temp=arr[j+1];
				  arr[j+1]=arr[j];
				  arr[j]=temp;
				  
			  }
		  }
			  
		  }
		  for(i=0;i<n;i++) {
			  System.out.format(" arr[%d] = %d :",i,arr[i]);
	  }
	}
	}


