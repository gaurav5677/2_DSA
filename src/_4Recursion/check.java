package _4Recursion;

public class check {
    public static void main(String[] args) {


        int c[] = {1, 2, 4, 6, 4, 5};
        int x = 4;
        int size = 6;
        System.out.println(checkNumber(c, x, size));
    }

    public static int  checkNumber( int [] b ,int x , int size ){

    if ( size == 0 ){
        return -1;
    }

    if( (b[size-1]==x)){
        return size-1;
    }
    return checkNumber(b,x,size-1);


    }

}
