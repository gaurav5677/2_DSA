package _4Recursion;


import java.util.Scanner;

public class _3Calculate_Power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(power(a,b));

    }

    public static int power( int a ,int  b ) {
       if( a == 0 && b ==0 ){
           return 1 ;
       }
       if( b ==0 ){
           return  1 ;

       }
       if( a ==0 ){
           return 0 ;
       }


       return  ( a* power(a,b-1));// this will call the power funtion again .
        // ans will continue till  the base case became true.
    }
}