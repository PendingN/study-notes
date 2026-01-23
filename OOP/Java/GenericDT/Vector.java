public class Vector{
    public static void main(String[] args){
        Vector<Integer> X=new Vector<>();
        X.add(1);
        X.add(2);
        X.add(3);
        Vector<Integer> Y= new Vector<>();
        for(int i:X){
            int y=2*x*x+1;
            Y.add(y);
        }
        System.out.println("vectorX:");
        System.out.println(X);
        System.out.println("Vector y=2x^2+1");
        System.out.println(Y);
    }
}