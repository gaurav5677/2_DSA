package _1.OOPS;

public class _4FractionUse {
    public static void main(String[] args) {
        _3fraction f1 = new _3fraction(4, 6);

        f1.print();
//        f1.increment();
//        f1.print();//means adding 1 to it 2/3 +1 = 2+(1*3)/3 {num+deno/deno}
//        //create a function to add two fraction
        _3fraction f2 = new _3fraction(4, 8);
       // f1.add(f2);
        f1.print();

        _3fraction f3 = _3fraction.add(f1,f2);
        f3.print();
    }
}
