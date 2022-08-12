package DesignPatterns.Behavioural.ChainOfRespEx;

public class AddNumbers implements Chain{

	private  Chain nextInChain; //stores next object in chain that can perform calc
	
	// Defines the next Object to receive the
	// data if this one can't use it
	
	public void setNextChain(Chain nextChain) {
		
		nextInChain = nextChain;
		
	}

	// Tries to calculate the data, or passes it
	// to the Object defined in method setNextChain()
	
	public void calculate(Numbers request) {
		
		if(request.getCalcWanted() == "add"){ //if add is the string entered
			
			System.out.print(request.getNumber1() + " + " + request.getNumber2() + " = "+
					(request.getNumber1()+request.getNumber2()));
			
		} else {
			
			nextInChain.calculate(request);
			
		}
		
	}
}