package SOLIDPrinciples.OpenClosed.ShapeExample;

public class AreaCalculator {
    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }
}
//The area calculator used to contain allof the calculationsfor diffrerent shapes
//NOW it points to the interface