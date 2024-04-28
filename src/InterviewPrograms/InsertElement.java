 package InterviewPrograms;
import java.lang.*;
import java.util.Arrays;

public class InsertElement {
  public static void main(String[]args) {
	  int index=2;
	  int value=30;
	  int a[]=new int[] {10,20,40,50,60,70,80,90};
	  System.out.println(Arrays.toString(a));
	  
	  for(int i=a.length-1;i>index;i--) {
		  a[i]=a[i-1];
	  }
	  a[index]=value;
	  System.out.println(Arrays.toString(a));
  }
}
