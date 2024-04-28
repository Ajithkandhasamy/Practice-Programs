package InterviewPrograms;
import java.util.*;

public class factoriyal {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("number");
		int number;int f=1;
		number=scan.nextInt();
		
		for(int i=1;i<=number;i++) {
			f=f*i;
		}
			
			System.out.println(" factoriyal " +number+ " is =" +f);
			
		
	}

}
