package String;



public class CApitalizeTheEachFirstWord {
       public static void main(String[]args) {
    	  String s1="ajith is a good boy";
           char []ch=s1.toCharArray();
           ch[0] =(char)(ch[0]-32);
           for(int i=0;i<ch.length;i++) {
        	   if(ch[i]==32) {
        		   ch[i+1]=(char)(ch[i+1]-32);
        	   }
        	   
           }
           System.out.println(ch);
       }
       }