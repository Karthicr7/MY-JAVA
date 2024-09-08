package Basics;

public class pratice1 {
     public static void main(String[]args) {
    	 
    	 int i,j=0,k=0,sum1=0;
		 for(i=1;i<=6;i++) {
			 for(k=6-i;k>0;k--) {
				 System.out.print(" ");
			 }
			 for(j=1;j<=i;j++) {
				 if(j==1 || j==i) {
					 System.out.print(1+" ");
				 }
				 else if(j>1 && j<i) {
					 sum1=i-1;
					 System.out.print(sum1+" ");
				 }
				 
			 }
			 
		 System.out.println();
		 }
		 
		
	 }

}
