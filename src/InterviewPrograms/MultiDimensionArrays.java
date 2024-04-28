package InterviewPrograms;

public class MultiDimensionArrays {
   public static void main(String []args) {
	   int a[][]= { {25,56,89},{12,45,79},{34,68,35}};
       for(int i=0;i<3;i++) {
    	   for(int j=0;j<3;j++) {
    		   System.out.print(" "+a[i][j]);
    	   }
    	   System.out.println("");
       }
      
   }
}
//jagged array
     /*int a[][]={ {25,56,89},
                 {12,45,79,56,78},      jagged array
                 {34,68,35}};
             for(int i=0;i<a.length;i++) {
              for(int j=0;j<a[i].length;j++) {
	            System.out.print(" "+a[i][j]);
            }
            ystem.out.println(" ");*/