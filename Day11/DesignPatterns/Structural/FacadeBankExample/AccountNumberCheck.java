package DesignPatterns.Structural.FacadeBankExample;

public class AccountNumberCheck{
	
	private int accountNumber = 12345678;
	
	public int getAccountNumber() { 
        return accountNumber; 
    } //Getter returns accountNumber
	
	public boolean accountActive(int acctNumToCheck){ //just a behind the scene task
		
		if(acctNumToCheck == getAccountNumber()) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
}