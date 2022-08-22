package _4Recursion;
//Check Number in Array
//
//Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
//Do this recursively.
//Input Format :
//Line 1 : An Integer N i.e. size of array
//Line 2 : N integers which are elements of the array, separated by spaces
//Line 3 : Integer x
//Output Format :
//'true' or 'false'
//Constraints :
//1 <= N <= 10^3
//Sample Input 1 :
//3
//9 8 10

//Sample Output 1 :
//true
//Sample Input 2 :
//3
//9 8 10
//2
//Sample Output 2 :
//false
public class _10checkNumberInArray {

  public static boolean checkNumber( int [] a , int  x , int size  ){
        if(  size==0){
            return  false;
        }

        if( a[size-1 ]==x){
            return true;
        }
        return  checkNumber(a , x ,size-1);
  }

//    public static boolean checkNumber( int  b [ ] , int x ){
//      return  checkNumber(b , x , 0);
//    }

    public static void main(String[] args) {
        int c [] = { 1,2,3,6,4,5};
        int x = 9 ;
        int s = 6 ;// size of the array

        System.out.println(checkNumber(c , x ,s));




    }
}
