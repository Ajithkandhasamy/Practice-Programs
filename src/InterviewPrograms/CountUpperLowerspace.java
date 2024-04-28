package InterviewPrograms;

import java.lang.reflect.Array;

public class CountUpperLowerspace {
   public static void main(String[]args) {
	   String a="JaVa IsMy 123st *+^ favorite";
	   System.out.println(a);
	   char[] arr=a.toCharArray();
	   int upper=0;
	   int lower=0;
	   int others=0;
	   for(int i=0;i<a.length();i++) {
		  if(arr[i]>=65 && arr[i]<=90 ) {
			  upper++;
		  }
		  else if(arr[i]>=97 && arr[i]<=122) {
			  lower++;
		  }
		  else {
			  others++;
		  }
	   }
	   System.out.println("upper case ="+ upper);
	   System.out.println("lower case ="+ lower);
	   System.out.println("others ="+ others);
   }
}
