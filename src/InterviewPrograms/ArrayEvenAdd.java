package InterviewPrograms;
import java.util.*;

public class ArrayEvenAdd {
	public static void main (String[]args) {
	Scanner scan=new Scanner(System.in) ;
	System.out.println("Total number");	
	int size=scan.nextInt();
	int av[]=new int[size];
	    
	     int even=0;
	     int add=0;
	
	for(int i=0;i<size;i++) {
		System.out.println("enter the ["+i+"]value");
		av[i]=scan.nextInt();
		
	}
	for(int store:av) {
		if(store%2==0) {
			even++;
		}	
	
	else {
		add++;
		
	}
	}
	System.out.println(even);
    System.out.println(add);
	}
	}
	
