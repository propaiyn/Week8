package DesignPatterns.Structural.FacadeBankExample;

// The Facade Design Pattern decouples or separates the client 
// from all of the sub components

// The Facades aim is to simplify interfaces so you don't have 
// to worry about what is going on under the hood

public class BankAccountFacade {
	
	private int accountNumber;
	private int securityCode;
	
	AccountNumberCheck acctChecker; //refrences to other classes
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;
	
	WelcomeToBank bankWelcome;
	
	public BankAccountFacade(int newAcctNum, int newSecCode){ //Constructor
		
		accountNumber = newAcctNum; //Assigned to private class variables
		securityCode = newSecCode;
		
		bankWelcome = new WelcomeToBank(); //initialise objects
		
		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();
		
	}
	
    //Way to access account numbers and security codes

	public int getAccountNumber() {
        return accountNumber; 
    }
	
	public int getSecurityCode() {
        return securityCode; 
    }
	
	//implement options to withdraw or deposit cash
    //not really to do with facade pattern
	public void withdrawCash(double cashToGet){
		
		if(acctChecker.accountActive(getAccountNumber()) &&
				codeChecker.isCodeCorrect(getSecurityCode()) &&
				fundChecker.haveEnoughMoney(cashToGet)) {
					
					System.out.println("Transaction Complete\n");
					
				} else {
					
					System.out.println("Transaction Failed\n");
					
				}
		
	}
	
	
	public void depositCash(double cashToDeposit){
		
		if(acctChecker.accountActive(getAccountNumber()) &&
				codeChecker.isCodeCorrect(getSecurityCode())) {
			
					fundChecker.makeDeposit(cashToDeposit);
					
					System.out.println("Transaction Complete\n");
					
				} else {
					
					System.out.println("Transaction Failed\n");
					
				}
		
	}
	
}