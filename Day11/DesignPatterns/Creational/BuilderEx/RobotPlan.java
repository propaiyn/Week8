package DesignPatterns.Creational.BuilderEx;

// This is the interface that will be returned from the builder
// Creates all robots

public interface RobotPlan{
	
	public void setRobotHead(String head);
	
	public void setRobotTorso(String torso);
	
	public void setRobotArms(String arms);
	
	public void setRobotLegs(String legs);
	
}

//all robots should have a head, torso.......