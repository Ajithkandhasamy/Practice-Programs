package InterviewPrograms;
import java.util.*;
public class multiplicationTable {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		System.out.println("what table you want");
		int table=in.nextInt();
		System.out.println("how many series you want3");
		int n=in.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i+" * "+table+" = "+(i*table));
			
		}
	}

}
