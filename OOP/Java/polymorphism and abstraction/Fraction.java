public class Fraction implements FractionI{
    private int num;
    private int deno;
    public Fraction(){
        this.num = 0;
        this.deno = 1;
    }

    public Fraction(int n, int d){
        this.num = n;
        this.deno = d;
    }
    public int getNum(){
        return this.num;
    }
    public int getDenom(){
        return this.deno;
    }
    public Fraction add(Fraction f) {
        int n = this.num * f.deno + this.deno * f.num;
        int d = this.deno * f.deno;
        Fraction sum = new Fraction(n, d);
        sum.simplify();
        return sum;
    }

    public Fraction minus(Fraction f) {
        int n = this.num * f.deno - this.deno * f.num;
        int d = this.deno * f.deno;
        Fraction sub = new Fraction(n, d);
        sub.simplify();
        return sub;
    }

    public Fraction times(Fraction f) {
        int n = this.num * f.num;
        int d = this.deno * f.deno;
        Fraction mul = new Fraction(n, d);
        mul.simplify();
        return mul;
    }

    public void simplify(){
        int g = gcd(Math.abs(num),Math.abs(deno));
        num /= g;
        deno /= g;
    }

    public int gcd(int a, int b){
        return b == 0 ? a : gcd(b,a % b);
    }
}