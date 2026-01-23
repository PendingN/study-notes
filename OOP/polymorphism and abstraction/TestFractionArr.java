public class TestFractionArr {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction f3 = new Fraction(2, 5);

        Fraction[] arr = { f1, f2, f3 };
        FractionArr fa = new FractionArr(arr);

        System.out.println(fa.add(null));
        System.out.println(fa.minus(null));
        System.out.println(fa.times(null));
    }
}
