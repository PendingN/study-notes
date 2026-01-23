public class Square extends Rectangle{
    public Square(){
        super(0.0,0.0,"black",false);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return getLength();
    }
    public void SetSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public void setWidth(double side){
        SetSide(side);
    }
    public void setLength(double side){
        SetSide(side);
    }
}
