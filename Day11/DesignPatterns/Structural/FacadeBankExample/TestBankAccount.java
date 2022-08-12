package DesignPatterns.Structural.FacadeBankExample;

public class TestBankAccount {
	
	public static void main(String[] args){
		
		BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
		//Object creation with parameters passed

		accessingBank.withdrawCash(50.00);
		
		accessingBank.withdrawCash(990.00);

        accessingBank.depositCash(200.00);

        //want to ask for it to do something and do it in the background
		
	}
	
}