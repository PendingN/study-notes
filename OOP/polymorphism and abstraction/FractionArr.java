public class FractionArr implements FractionI{
    private Fraction[] members ;

    public FractionArr(){
        members = new Fraction[0];
    }
    public FractionArr(int n, int d){
        members = new Fraction[1];
        members[0] = new Fraction(n,d);
    }
    public FractionArr(Fraction[] arr) {
        members = arr;
    }

    public int size() {
        return members.length;
    }
    public int getNum() {
        if (members.length == 0) return 0;
        return members[0].getNum();
    }
    public int getDenom() {
        if (members.length == 0) return 1;
        return members[0].getDenom();
    }

    public Fraction getMembers(int i) {
        return members[i];
    }
    public void simplify() {
        for (int i = 0; i < members.length; i++) {
            members[i].simplify(); 
        }
    }
    public Fraction add(Fraction f) {
        if (members.length == 0) return new Fraction(0, 1);
        Fraction sum = members[0];
        for (int i = 1; i < members.length; i++) {
            sum = sum.add(members[i]);
        }
        return sum;
    }
    public Fraction minus(Fraction f) {
        if (members.length == 0) return new Fraction(0, 1);
        Fraction diff = members[0];
        for (int i = 1; i < members.length; i++) {
            diff = diff.minus(members[i]);
        }
        return diff;
    }
    public Fraction times(Fraction f) {
        if (members.length == 0) return new Fraction(1, 1);
        Fraction prod = members[0];
        for (int i = 1; i < members.length; i++) {
            prod = prod.times(members[i]);
        }
        return prod;
    }
}