package SOLIDPrinciples.OpenClosed.ShapeExample;

public class Circle implements Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (radius * radius * Math.PI); //implements the interface into the class itself
    }
}

//If we made an "calculate all" class then this would be constantly updated when adding new shapes
