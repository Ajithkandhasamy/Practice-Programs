package AlphateNumber;

public class Alphate {
   public static void main(String[]args) {
	   for(int i=1;i<=7;i++) {
		   for(int j=1;j<=7;j++) {
			   if(i==1 || i==7 || j==1 ) {
				   if((i==1&&j==1) || (i==7&&j==1)) {
					   System.out.print(" ");
				   }
				   System.out.print("1"+" ");   
			   }
			   System.out.print(" ");
		   }
		   System.out.println();
	   }
   }
}
