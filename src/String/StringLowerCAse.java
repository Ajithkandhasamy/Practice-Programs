package String;


public class StringLowerCAse {
    public static void main (String[]args) {
    	StringBuilder a= new StringBuilder("JaVA is OOpp  JAvae");
    	for(int i=0;i<a.length();i++) {
    		if(a.charAt(i)>=65 && a.charAt(i)<=90) {
    			int b=(int)a.charAt(i)+32;
    			a.setCharAt(i,(char)b);
    		}
    	}
    	
    	System.out.println(a);
    }
}
