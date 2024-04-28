package InterviewPrograms;

public class AutoBioGraphial {
public static void main(String[]args) {
	int no=2020,rem;
	int add=0,count=0;
	while(no>0) {
		count++;
		rem=no%10;
		add=add+rem;
		no=no/10;
		
	}
	if(count==add) {
		System.out.println("AutoNumber");
	}
	else {
		System.out.println("no auto biographical num");
	}
}
}
