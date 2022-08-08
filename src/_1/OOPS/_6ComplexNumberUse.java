package _1.OOPS;

public class _6ComplexNumberUse {
    public static void main(String[] args) {
        _5ComplexNumbers c1 = new _5ComplexNumbers(4, 5);
        c1.print();
        _5ComplexNumbers c2 = new _5ComplexNumbers(1, 2);
        c2.print();
// c1.plus(c2);
// c1.print();
        c1.multiply(c2);
        c1.print();

    }

}
