package DesignPatterns.Creational.BuilderEx;

// The director / engineer class creates a Robot using the
// builder interface that is defined (OldRobotBuilder)

//kind of like defining a robot factory

public class RobotEngineer {
	
	private RobotBuilder robotBuilder;
	
	// OldRobotBuilder specification is sent to the engineer
	
	public RobotEngineer(RobotBuilder robotBuilder){ //constructor which takes a object type RobotBuilder variable robotBuilder
		
		this.robotBuilder = robotBuilder;
		
	}
	
	// Return the Robot made from the OldRobotBuilder spec
	
	public Robot getRobot(){
		
		return this.robotBuilder.getRobot();
		
	}
	
	// Execute the methods specific to the RobotBuilder 
	// that implements RobotBuilder (OldRobotBuilder)
	
	public void makeRobot() {
		
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
		
	}
	
}