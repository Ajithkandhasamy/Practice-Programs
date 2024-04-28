package InterviewPrograms;
import java.util.*;
 
public class Primenumber {
	public static void main(String[]args) {
		int count=0;int rem;int j;
		Scanner scan=new Scanner(System.in);
		//System.out.println("looping number");
		//int loop=scan.nextInt();
		System.out.println("Prime number");
		int number=scan.nextInt();
		for(j=1;j<=number;j++) {
		
		for(int i=1;i<=j;i++) {	
			rem=j%i;
			
			
			if(rem==0) {
				
			
		    count++;
			}
		}
		
		   if(count==2) {
			
			System.out.println(j+"prime number");
			
			
		}
		   count=0;
		}
		}
		
}
	

