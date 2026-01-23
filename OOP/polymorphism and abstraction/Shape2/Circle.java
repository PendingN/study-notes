public class Circle extends Shape{
    private double radius;
    public Circle(){
        super();
        this.radius=0.0;
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean Filled){
        super(color,Filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius =radius;
    }
    public double getArea(){
        return 2*Math.PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }
    public String toString(){
        return "Circle{ radius:"+radius+", color:"+color+", Filled:"+filled+"}";
    }
}