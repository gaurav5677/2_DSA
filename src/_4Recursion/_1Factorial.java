package _4Recursion;

public class _1Factorial {

    // Recursion in computer science is a method where the solution to a problem depends on
    //  Solutions to smaller instance of the same problem.

   public  static   int fact(int n ){
       if(n==0){
           return  1 ;

       }
        int smallAn = fact(n-1);
        return n*smallAn;



    }

    public static void main(String[] args) {
        int n = 3 ;
        int ans = fact(n);
        System.out.println(ans);
    }
}
