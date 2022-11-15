//John Aston Adams
//10/11/22

package HomeworkUnit2;

public class Fraction {
    private int numerator, denominator;
    public Fraction(int n, int d){
        numerator = n;
        denominator = d;
    }
    public void setNumerator(int n) {
        numerator = n;
    }
    public void setDenominator(int d){
        denominator = d;
    }

    public double eval(int n, int d){
        return (double)n /d;
    }

    public Fraction add (Fraction fraction1, Fraction fraction2){
        int n1 = fraction1.numerator * fraction2.denominator;
        int n2 = fraction2.numerator * fraction1.denominator;
        int d = fraction1.denominator * fraction2.denominator;
        return new Fraction(n1 + n2,d);
    }   

    @Override //help from James
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args){
        Fraction f = new Fraction(2,5);
        System.out.println(f.eval(2,5));
        System.out.println(f.add(f,new Fraction(3,7)));
    }
}
