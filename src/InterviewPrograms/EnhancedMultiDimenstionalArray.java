package InterviewPrograms;

public class EnhancedMultiDimenstionalArray {
      public static void main(String[]args) {
    	  int a[][]= {{12,45,35,67,89},{12,45,67,32},{23,45,78}};
    	for(int b[]:a) {
    		for(int c:b) {
    			System.out.print(" "+c);
    		}
    		System.out.println(" ");
    	}
      }
}
