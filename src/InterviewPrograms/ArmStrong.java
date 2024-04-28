package InterviewPrograms;



           //to find the armstrong number 100 to 999?



public class ArmStrong {
     public static void main(String[]args) {
    	int digit1,digit2,digit3;
    	for(int no=100;no<=999;no++) {
    		int no2=no;
    		
    		digit3=no2%10;
    		no2=no2/10;
    		
    		digit2=no2%10;
    		no2=no2/10;
    		
    		digit1=no2%10;
    		int result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
    	
    	if(no==result) {
    		System.out.println(no+" ArmStrongnumber");
    	}
     }
}}
