package BankProgram;

public class BankTrial {
       int accountId;
       String name;
       float amount;
       
                          
                     //INSERT
       
    void insert(int id,String name,float amt) {
    	accountId=id;
    	this.name=name;
    	amount=amt;
    	
    }
    
                     //DEPOSITE
    
    void deposite(float amt) {
    	amount=amount+amt;
    	System.out.println(amt+"is Deposited");
    }
    
    
                    //WITHDRAW
               
    void withdraw(float amt) {
    	if(amount<amt) {
    		System.out.println("no insufficient balance");
    		
    	}
    	else {
    		amount=amount-amt;
    		System.out.println(amt+"withdrawn amounnt");
    	}
    	
    }
    
    
                            //diSPLAY
    
    
    void display() {
    	
		System.out.println(accountId);
		System.out.println(name);
		
    }
    
                               //BALANCE AMOUNT                        
    
    
    void balanceAmount() {
    	System.out.println(amount+" balance amount");
    }
      
}
