package _5Recursion_Strings;

import java.awt.*;

public class _3RemoveDuplicatefrom_String {
    public static void main(String[] args) {
        String str = "aasdfassdddss";
        System.out.println(Duplicate(str));
    }
    public static  String  Duplicate(String str){
        if(str.length()<=1){
            return str;
        }
        if( str.charAt(0)== str.charAt(1)){
            return  Duplicate(str.substring(1));
        }else{
            String small = Duplicate(str.substring(1));
            return str.charAt(0)+ small;
        }
    }
}
