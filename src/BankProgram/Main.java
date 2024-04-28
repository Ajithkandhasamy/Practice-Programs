package BankProgram;

public class Main {
      public static void main(String[]args) {
    	  BankTrial bt=new BankTrial();
    	  bt.insert(12345,"Ajith",100);
    	
    	  bt.display();
    	  bt.balanceAmount();
    	  bt.deposite(2000);
    	  bt.balanceAmount();
    	  bt.withdraw(5000);
    	  bt.balanceAmount();
      }
}
