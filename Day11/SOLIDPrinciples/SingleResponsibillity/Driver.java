package SOLIDPrinciples.SingleResponsibillity;

public class Driver {
    private int mileage;

    // functionality
    public void drive(String milesDriven){
        this.setMileage(this.getMileage() + milesDriven);
    }
}