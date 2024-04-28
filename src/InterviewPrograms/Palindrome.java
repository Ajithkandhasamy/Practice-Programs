package InterviewPrograms;

public class Palindrome {
  public static void main(String[]args) {
	  int no=535,rem,add = 0;
	  int no2=no;
	  while(no>=1) {
	  rem=no%10;
	   add=add*10+rem;
	   no=no/10; 
	  }
	  if(no2==add) {
		  System.out.println("palindrome");
		  
	  }
	  else {
		  System.out.println("no palindrom");
		  
	  }
  }
}
