package InterviewPrograms;
import java.util.*;

public class FibonacciSeries {
     public static void main(String[]args) {
    	  int n1=-1,n2=1,no,n3=0;
    	  System.out.println("Display the fibnocci series");
    	  Scanner in=new Scanner(System.in);
    	  no=in.nextInt();
    	  
    	  for(int i=0;i<=no;i++) {
    		  
    		  
    		 
    		 
    		  n3=n1+n2;
       		  n1=n2;
       		  n2=n3; 
    		 
    		  
    	  
    	  System.out.println(n3);
    	  }
    	  
      }}
                          

       /* recursion method
 
	  int n1=-1,n2=1,n3=0;
   public void method(int count){
	   if(count>=0) {
		   n3=n1+n2;
    		  n1=n2;
    		  n2=n3; 
 		 
 		  
 	  
 	  System.out.println(n3);
  method(count-1);
   }
   }
   public static void main (String[]args) {
	   FibonacciSeries a1=new FibonacciSeries();
	   a1.method(10);
		 
	   }
   
   } */

