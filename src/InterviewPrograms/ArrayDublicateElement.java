package InterviewPrograms;

import java.util.Arrays;

public class ArrayDublicateElement {
	public static void main(String[]args) {
		int a[]=new int[] {1,2,3,5,2,4,6,4,6};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					System.out.println(a[j]);
				}
			}
		}
	}

}
