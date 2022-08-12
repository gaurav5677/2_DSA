package _4Recursion;

public class _7Test {
    public static void main(String[] args) {
        int num =5 ;
        int ans = func(num -1 );
        System.out.println(ans);
    }
    public static int func( int num ){
        if( num == 1 ){
            return 1;
        }
         return func(num -1);

    }
}
