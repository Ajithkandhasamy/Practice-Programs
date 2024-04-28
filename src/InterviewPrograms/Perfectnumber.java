package InterviewPrograms;

public class Perfectnumber {
    public static void main(String[]args) {
    	int total=0;int no=28;int rem;
    	for(int i=1;i<no;i++) {
    		rem=no%i;
    	if(rem==0) {
    		total=total+i;
    	}
    	}
    	if(total==no) {
    		System.out.println(no+"perfect number");
    		
    	}
    	else {
    		System.out.println(no+"it's not a perfect number");
    	}
    }
}
