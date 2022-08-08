package _1.OOPS;

public class _3fraction {
    private int numerator;
    private int denominator;

    public _3fraction(int numerator, int denominator) {
        if (denominator == 0) {
            //throw error
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();

    }

    public void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }


    public void increment() {
        numerator = numerator + denominator;
        simplify();
    }


    public void setNumerator(int num) {
        this.numerator = num;
        simplify();

    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int num) {
        if (num == 0) {
            //throw error
            return;

        }
        this.denominator = num;
        simplify();
    }

    public int getDenominator() {
        return denominator;
    }


    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public void add(_3fraction f2) {
// first fraction  is the fraction on which funcitno in called
        // second fraction is passed as arguments
        this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public static  _3fraction add(_3fraction f1, _3fraction f2){
       int newNum = f1.numerator * f2.denominator + f1.denominator*f2.numerator;
       int newDenp = f1.denominator*f2.denominator;
       _3fraction f3 = new _3fraction(newNum,newDenp);
       return f3;
    }


}
