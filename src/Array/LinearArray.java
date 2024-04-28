package Array;
import java.util.*;
public class LinearArray {


public static void main(String[]args) {
	
	int []arr= {32,56,34,12,87,9};
	Scanner scan=new Scanner(System.in);
	System.out.println("Search Number");
	int search=scan.nextInt();
	int search1=scan.nextInt();
	boolean check=false;
	
	for(int i=0;i<=arr.length;i++) {


			if(search==arr[i]) 
			check=true;
			break;
			}
	
		
	if(check==true) {
		System.out.println(search+"linear number");
		
	}
	else {
		System.out.println(search+"not present in the array");
	}
 
}
}
