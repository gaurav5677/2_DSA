package _4Recursion;

// checkSorted// here we are checking whether the array is sorted or not
public class _8RecursionAndArrats {


    public static boolean checksorted( int [] input) {
        if (input.length <= 1) {
            return true;
        }

        int smallInput[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallInput[i - 1] = input[i];
        }

        boolean smallAns = checksorted(smallInput);
        if(!smallAns ){
            return false;

        }

        if( input[0]<=input[1]){
            return true;
        }else{
            return  false;
        }


    }



    public static void main(String[] args) {
 int input[] = { 2,1,3,4,5};
        System.out.println(checksorted(input));
    }

}
