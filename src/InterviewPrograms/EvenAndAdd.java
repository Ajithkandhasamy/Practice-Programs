package InterviewPrograms;
import java.util.*;

public class EvenAndAdd {
   public static void main(String[]args) {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("number");
	   int num=scan.nextInt();
	         
	   int rem,div;
	 int even=0,  add=0;
	 
	   do{
		   rem=num%10;
	   if(rem%2==0) {
		   even++;
	   }
	   else if(rem%2!=0){
		   add++;
	   }
	   num=num/10;
	   }
	   while(num>0);
	   System.out.println(even);
	   System.out.println(add);
		   
	   }
   }

