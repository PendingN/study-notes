public interface FractionI{
    public int getNum();
    public int getDenom();
    public FractionI add(Fraction f);
    public FractionI minus(Fraction f);
    public FractionI times(Fraction f);
    public void simplify();
}