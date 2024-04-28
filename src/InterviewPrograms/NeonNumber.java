package InterviewPrograms;

public class NeonNumber {
   public static void main(String[]args) {
	   int no=9,rem,add=0;
	   int no2=no;
	  int square=no*no;
	  System.out.println(square);
	  while(square>=1) {
		  rem=square%10;
		  add=add+rem;
		  square=square/10;
		  
	  }
	  if(no2==add) {
		  System.out.println("neon");
	  }
	  else {
		  System.out.println("no neon");
	  }
	  
   }
}
