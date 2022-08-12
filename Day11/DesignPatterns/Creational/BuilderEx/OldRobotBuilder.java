package DesignPatterns.Creational.BuilderEx;

// The concrete builder class that assembles the parts 
// of the finished Robot object

//Every time you want to make a new robot, create a new builder object

//defining the robot itself

public class OldRobotBuilder implements RobotBuilder {

	private Robot robot; //object 
	
	public OldRobotBuilder() {
		
		this.robot = new Robot(); //Constructor
		
	}
	
	public void buildRobotHead() {
		
		robot.setRobotHead("Tin Head");
		
	}

	public void buildRobotTorso() {
		
		robot.setRobotTorso("Tin Torso");
		
	}

	public void buildRobotArms() {
		
		robot.setRobotArms("Blowtorch Arms");
		
	}

	public void buildRobotLegs() {
		
		robot.setRobotLegs("Rollar Skates");
		
	}

	public Robot getRobot() {
		
		return this.robot;
	}
	
	
	
}