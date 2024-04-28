package InterviewPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayAssending {
    public static void main(String[]args) {
    	int a[]=new int[] {7,2,1,4,9,8,3,5};
    	System.out.println(Arrays.toString(a));
    	int temp;
    	for(int i=0;i<a.length;i++) {
    		for(int j=i+1;j<a.length;j++) {
    			if(a[i]>a[j]) {
    				temp=a[i];
    				a[i]=a[j];
    				a[j]=temp;
    		
    		}
    	}
    	
    	
    }
    	System.out.println(Arrays.toString(a));
}}
