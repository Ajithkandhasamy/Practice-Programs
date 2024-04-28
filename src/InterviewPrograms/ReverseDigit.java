package InterviewPrograms;
import java.util.*;

public class ReverseDigit {
	public static void main(String[]args) {
		int no;
		int rem;
		
		int sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Reverse number");
		no=in.nextInt();
		
		
		while(no!=0){
		rem=no%10;
		sum=(sum*10)+rem;
		no=no/10;
		}
		System.out.println(sum);
	}
	

}
