package InterviewPrograms;

public class BeautiFulNumber {
   public static void main(String[]args) {
	   int no=2130,rem,add=0,start=0,end=0;
	   while(no>0) {
		   rem=no%10;
		   add=rem%2;
		   if(add==0) {
			   start++;
		   }
		   else {
			  end++; 
		   }
		   no=no/10;
	   }
	   if(start==end) {
		   System.out.println("beautifulnumber");
	   }
	   else {
		   System.out.println("No Beautiful number");
	   }
   }
}
