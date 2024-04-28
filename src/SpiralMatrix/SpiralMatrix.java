package SpiralMatrix;

public class SpiralMatrix {
   public static void main (String[]args) {
	/*   int[][]ar=new int[4][4];
	   int no=1;
	   int row=0;
	   
	   for(int col=0;col<=3;col++) {
		   ar[row][col]=no;
		   no++;
	   }
	   
	   int col=3;
	   for( row=1;row<=3;row++) {
		   ar[row][col]=no;
		   no++;
	   }
	   
	    row=3;
	   for( col=2;col>=0;col--) {
		   ar[row][col]=no;
		   no++;
		   }
	   
	    col=0;
	   for( row=2;row>=1;row--) {
		   ar[row][col]=no;
		   no++;
	   }
	  
	   row=1;
	   for( col=1;col<=2;col++) {
		   ar[row][col]=no;
		   no++;
		   }
	   
	   col=2;
	   for(row=2;row<=2;row++) {
		   ar[row][col]=no;
		   no++;
	   }
	   col=1;
	   for(row=2;row<=2;row++) {
		   ar[row][col]=no;
		   no++;
	   }
	    for( row=0;row<=3;row++) {
		   for(col=0;col<=3;col++) {
			   System.out.print(ar[row][col]+"\t");
		   }
		   System.out.println("\n");
	   
	   */
	   
	   int[][]ar=new int[4][4];
	   int no=1;
	   
	   int rs=0,re=3,cs=0,ce=3;
	   while(no<=16) {
	   int row=rs;
	   for(int col=cs;col<=ce;col++) {
		   ar[row][col]=no;
		   no++;
		   
	   }
	   rs++;
	   
	   int col=ce;
	   for( row=rs;row<=re ;row++) {
		   ar[row][col]=no;
		   no++;
		 
	   }
	   ce--;
	   
	    row=re;
	   for( col=ce;col>=cs;col--) {
		   ar[row][col]=no;
		   no++;
		   
		   }
	   re--;
	   
	    col=cs;
	   for( row=re;row>=rs;row--) {
		   ar[row][col]=no;
		   no++;
		   
	   }
	   cs++;
	   }   
	   
	   for( int row=0;row<=3;row++) {
		   for(int col=0;col<=3;col++) {
			   System.out.print(ar[row][col]+"\t");
		   }
		   System.out.println("\n");
	   }
   }
}
