package InterviewPrograms;
import java.util.*;

public class ArmstrongNumber {
	

	public static void main(String[]args) {
		 Scanner in=new Scanner(System.in);
		System.out.println("ArmStrong Number Or Not");
		int no=in.nextInt();
		int rem,remAns=0 ;
		int no2;
		
		no2=no;
		for( int i=100;i<=999;i++) {
		   while(no!=0){
		rem=no%10;
		remAns=(rem*rem*rem)+remAns;
		no=no/10;
		}
		}
		if(no2==remAns) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("no ArmStrong number");
		}  
		
		
		
		
	
	}
     
}
