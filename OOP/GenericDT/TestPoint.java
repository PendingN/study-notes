public class TestPoint{
    public static void main(String[] args){
        ArrayList<Point>listPoint=new ArrayList<>();
        listPoint.add(new Point(1,3));
        listPoint.add(new Point(2,4));
        ArrayList<point> inCircle=findPoint(new Point(0,0),1.0.listPoint);
        for(point p: inCircle){
            System.out.println(p.toString());
        }
        public static ArrayList<Point>findPoint(Point c,double r,ArrayList<Point>listpt){
            ArrayList<Point>result=new ArrayList<>();
            for(Point p:listpt){
                if(p.distanceFrom(c)<=r){
                    result.add(p);
                }
            }
            return result;
        }
    }
}