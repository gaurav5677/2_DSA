package _4Recursion;
//Sum of Array
//
//Given an array of length N, you need to find and return the sum of all elements of the array.
//Do this recursively.
//Input Format :
//Line 1 : An Integer N i.e. size of array
//Line 2 : N integers which are elements of the array, separated by spaces
//Output Format :
//Sum
//Constraints :
//1 <= N <= 10^3
//Sample Input 1 :
//3
//9 8 9
//Sample Output 1 :
//26
//Sample Input 2 :
//3
//4 2 1
//Sample Output 2 :
//7
public class _9SumOfArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int startIndex = 0;
        System.out.println(sum(a, startIndex));
    }

    public static int sum(int[] c, int v) {

        if (v == c.length) {
            return 0;
        }
       return ( c[v]+ sum( c, v+1));
    }

}