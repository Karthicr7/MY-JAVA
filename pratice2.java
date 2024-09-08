package Basics;

public class pratice2 {

 public static void main(String[]args) {
    	 
    	 int i,j=0,k=0,sum1=0;
		 for(i=1;i<=6;i++) {
			 for(k=6-i;k>0;k--) {
				 System.out.print("  ");
			 }int op,op1=2;
			 op=i;
	         for(j=1;j<(2*i);j++) {
	        	 sum1=(2*i)/2;
	        	 
	        	 
	        	 if(j<sum1) {
	        		
	        		 System.out.print(op+" ");
	        		 op-=1;
	        	 }
	        	 
	        	 if(j>sum1) {
		        	 	
	        		 System.out.print(op1+" ");
	        		 op1+=1;
	        	 }
	        	 if(j==sum1) {
		        	 	
	        		 System.out.print(1+" ");
	        		 
	        	 }
	        	 
				 
				 
			 }
			 
		 System.out.println();
		 }
		 
		
	 }

}

