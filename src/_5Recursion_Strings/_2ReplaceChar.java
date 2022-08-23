package _5Recursion_Strings;

public class _2ReplaceChar {
    //Replace Character Recursively
    //
    //Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
    //Do this recursively.
    //Input Format :
    //Line 1 : Input String S
    //Line 2 : Character c1 and c2 (separated by space)
    //Output Format :
    //Updated string
    //Constraints :
    //1 <= Length of String S <= 10^6
    //Sample Input :
    //abacd
    //a x
    //Sample Output :
    //xbxcd

    public static String Replace(String st , char  a ,char b ){
        if( st.length()==0){
            return "";
        }
        char c ;
        if( st.charAt(0)== a ){
            c = b ;
        }else{
            c = st.charAt(0);
        }
         String ans =Replace(st.substring(1),a,b);
        return (c+ans);
    }


    public static void main(String[] args) {
        String  str = "Gaurav";
        char c1= 'a';
        char c2='x';
        System.out.println(Replace(str,c1,c2));
    }



}



