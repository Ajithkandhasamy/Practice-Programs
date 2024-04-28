package InterviewPrograms;
import java.util.*;

public class SumAndAverage {
	public static void main(String[]args) {
		int n;int i=1;int add=0;int g;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		n=scan.nextInt();
		
		for(i=1;i<=n;i++) {
			
			
			
			System.out.println("number"+i);
			g=scan.nextInt();
			
			add=g+add;
		}
		System.out.println("sum"+add);
		System.out.println("average"+add/n);
	}

}
