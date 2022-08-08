package _1.OOPS;

public class _5ComplexNumbers {
    int real;
    int imaginary;

    _5ComplexNumbers( int real , int imaginary){
        this.real = real;
        this.imaginary =imaginary;
    }

    void plus(_5ComplexNumbers c2){
        int real = this.real + c2.real;
        int imaginary = this.imaginary+ c2.imaginary;
        this.real =real;
        this.imaginary =imaginary;
    }
    void multiply( _5ComplexNumbers c2){
        int real = (this.real*c2.real)-(this.imaginary*c2.imaginary);
        int imaginary=(this.real* c2.imaginary)+(this.imaginary*c2.real);
        this.real=real;
        this.imaginary=imaginary;
    }
     public void print(){
        System.out.println(this.real+" + i" + this.imaginary);
    }

}
