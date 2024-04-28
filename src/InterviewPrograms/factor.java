package InterviewPrograms;
import java.util.*;
public class factor {
   public static void main(String[]args) {
	   int rem;
	Scanner scan=new Scanner(System.in);
	System.out.println("Factor number");
	int no=scan.nextInt();
	for(int i=1;i<=no;i++) {
		rem=no%i;
		if(rem==0) {
			System.out.println(no+"%"+i+"="+rem);
	}
	}
   }
}
