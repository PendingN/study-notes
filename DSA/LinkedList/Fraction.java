
public class Fraction{
    private int numer ;
    private int denom ;
    public Fraction (){
        this.numer = 0;
        this.denom = 1;
    }
    public Fraction(int x, int y){
        numer = x;
        denom = y;
    }
    public Fraction(Fraction f){
        this.numer= f.numer;
        this.denom= f.denom;
    }
    public String toString(){
        return ""+this.numer+"/"+this.denom+"";
    }

    public boolean equals(Object f){
        
        boolean check =false;
        if(f instanceof Fraction){
            Fraction ff = (Fraction)f;
            check = this.numer*ff.denom == this.denom*ff.numer;
        }
        return check;
    }
}
