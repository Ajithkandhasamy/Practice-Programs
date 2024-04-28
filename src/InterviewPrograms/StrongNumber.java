package InterviewPrograms;
import java.util.*;

public class StrongNumber {
   public static void main(String[]args) {
	   int rem;
	   int fact = 1;
	   int sum=0;
	   
	  Scanner in=new Scanner(System.in);
	   System.out.println("this number Strong number or not");
	   int no=in.nextInt();
	   
	  int duplicatenumber=no;
	
	   while(no>0){
		 rem=no%10;
		fact=1;
		 
	   for(int i=1;i<=rem;i++) {
		 
		 fact=fact*i;
		 
        }
	   sum=sum+fact;
	   
	   no=no/10;
	   
       }
	  
	 if(sum==duplicatenumber) {
		   System.out.println("Strong number");
	   }
	   else {
		   System.out.println("not Strong number");
	   }
	   
   }
}
