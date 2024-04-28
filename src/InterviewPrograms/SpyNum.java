package InterviewPrograms;

public class SpyNum {
	public static void amin(String[]args) {
		 int no=123;
		 int rem = 0,add=0,mul=1;

		
		while(no>0) {
		rem=no%10;
		mul=mul*rem;
		add=add+rem;
		no=no/10;
		}
		
		if(add==mul) {
			System.out.println("spy");
		}
		else {
			System.out.println("no spy");
		}
		
	}
}
