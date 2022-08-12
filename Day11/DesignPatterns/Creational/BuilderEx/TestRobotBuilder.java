package DesignPatterns.Creational.BuilderEx;

public class TestRobotBuilder {
	
	public static void main(String[] args){
		
		// Get a RobotBuilder of type OldRobotBuilder (object)
		
		RobotBuilder oldStyleRobot = new OldRobotBuilder(); //i want a robot builder to use the oldrobotbuilder blueprint
		
		// Pass the OldRobotBuilder specification to the engineer
		
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot); //create engineer obj + pass the oldstylerobot spec
		
		// Tell the engineer to make the Robot using the specifications
		// of the OldRobotBuilder class
		
		robotEngineer.makeRobot();
		
		// The engineer returns the right robot based off of the spec
		// sent to it on line 11
		
		Robot firstRobot = robotEngineer.getRobot(); //Robot object is equal to the new robot
		
		System.out.println("Robot Built");
		
		System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
		
		System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
		
		System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());
		
		System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());
		
	}
	
}