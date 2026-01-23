public class testCalculator{
    public static void main(String[] args){
        int a=5;
        int b=0;
        Calculator c= new Calculator();
        try{
            System.out.printf("%.0f\n",c.mul(a,b));
            System.out.printf("%.2f",c.divide(a,b));
        } catch(ArithmeticException|NumberOutofRangeException e)
        {
            System.out.printf(e.getMessage());
        }
    }
}