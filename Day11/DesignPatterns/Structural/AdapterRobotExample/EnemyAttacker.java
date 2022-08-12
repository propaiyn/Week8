package DesignPatterns.Structural.AdapterRobotExample;

public interface EnemyAttacker {
    
    public void fireWeapon(); 
    public void driveForward();
    public void assignDriver(String drivername);

}
//Client expects to be working with
//Adapters job is to make new classes compatibile with ths interface

// This is the Target Interface : This is what the client
// expects to work with. It is the adapters job to make new
// classes compatible with this one.
