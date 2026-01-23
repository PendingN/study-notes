public class Calculator{
    public double divide (int a, int b) throws ArithmeticException,NumberOutofRangeException{
        if(b==0){
            throw new ArithmeticException("Khong the chia cho 0");
        }
        if(a>1000||a<-1000||b>1000||b<-1000)
            throw new NumberOutofRangeException("Vuot qua kha nang tinh toan");
        return (double)(a/b);
    }
    public double mul (int a, int b) throws NumberOutofRangeException{
        if(a>1000||a<-1000||b>1000||b<-1000)
            throw new NumberOutofRangeException("Vuot qua kha nang tinh toan");
        return (double)(a*b);
    }
}