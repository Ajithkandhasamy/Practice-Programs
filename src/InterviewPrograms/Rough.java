package InterviewPrograms;
import java.util.Scanner;

public class Rough {
	public static void main(String[]args) {
		int a,b,c,select;
	Scanner in=new Scanner(System.in);
	System.out.println("1.addition");
	System.out.println("2.substraction");
	System.out.println("3.multiplication");
	System.out.println("4.divide");
	System.out.println("Select");
	select=in.nextInt();
	System.out.println("give tow number");
	a=in.nextInt();
	b=in.nextInt();
	
	in.nextLine();
	switch (select) {
	case 1: c=a+b;System.out.println("addition"+" "+c);break;
	case 2: c=a-b;System.out.println("substraction"+" "+c);break;
	case 3:c=a*b;System.out.println("multiplicaation"+" "+c);break;
	case 4:c=a/b;System.out.println("divide"+" "+c);break;
	default:System.out.println("invalid case");break;
	}
	
	 
}
}

		
	
	