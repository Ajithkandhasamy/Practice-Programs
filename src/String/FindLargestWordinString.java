package String;
import java.util.*;

public class FindLargestWordinString {
   public static void main(String[]args) {
	   
	   Scanner scan=new Scanner(System.in);
	   System.out.println("enter typical word");
	   String x=scan.nextLine();
	   System.out.println(x);
	   String[] str=x.split(" ");
	   //public static void main
	   String temp="";
	   for(int i=0;i<=str.length;i++) {
		   if(str[i].length()>temp.length()) 
		   {
			   temp=str[i];
		
		   }
	   }
	   System.out.println(temp);
   }
}
