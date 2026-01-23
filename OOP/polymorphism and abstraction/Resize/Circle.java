public class Circle implements GeometricObject{
     protected double radius;

    // Constructor
    public Circle() {
        this.radius = 1.0;  // mặc định bán kính 1.0
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement phương thức getArea
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Implement phương thức getPerimeter
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
