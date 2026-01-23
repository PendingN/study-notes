public class TestLab2{
    public static void main(String[] args){
        MyStack<Fraction> stack = new MyStack<>();
        stack.push(new Fraction(6,4));
        stack.push(new Fraction(1,4));
        stack.push(new Fraction(2,4));
        stack.push(new Fraction(0,4));
        stack.print();

        
    }
    public static int recurP(int n){
        if(n == 1){
            return 3;
        }
        else return Math.pow(2,n)+ Math.pow(n,2)+ recurP(n-1);
    }
    public int callPStack(int n){
        MyStack<Integer> stack = new MyStack<>();
        while(n>1){
            stack.push(n);
            n--;
        }
        int res = 3;
        while(!stack.isEmpty()){
            int m = stack.pop();
            res = Math.pow(2,m)+ Math.pow(m,2)+ res;
        }
        return res;
    }
}
