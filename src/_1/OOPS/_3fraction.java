package _1.OOPS;

public class _3fraction {
    private int numerator;
    private int denominator;


    public _3fraction(int numerator, int denominator) {
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


    public void increment(){
         numerator = numerator+denominator;
         simplify();
    }

    public void  add(){

    }
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }
}
