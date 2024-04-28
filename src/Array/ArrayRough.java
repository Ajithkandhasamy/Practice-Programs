package Array;

public class ArrayRough {
   static void method(int arr[]) {
	   int min=arr[0];
	   
	   for(int i=0;i<arr.length;i++) {
		   if(min>arr[i]) {
			   min=arr[i];
		   }
		   System.out.println(arr[i]);
		  
	   }
	   //System.out.println(arr[0]);
	   System.out.println("min value of this array = "+ min);
	   
   }
	   
	   
   public static void main(String[]args) {
	   int a[]= {8,7,3,4,6};
	  ArrayRough.method(a);
	   System.out.println();
   }
}
