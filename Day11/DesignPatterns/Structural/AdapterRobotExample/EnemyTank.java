package DesignPatterns.Structural.AdapterRobotExample;
import java.util.Random;

public class EnemyTank implements EnemyAttacker {

    Random generator = new Random();

    @Override
    public void fireWeapon() {
        int attackDamage = generator.nextInt(10) +1;
        System.out.println("Enemy tank does " + attackDamage + " damage");
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy tank moves forward " + movement + " meters");
        
    }

    @Override
    public void assignDriver(String drivername) {
        
        System.out.println(drivername + " is driving");
    }

    
}
