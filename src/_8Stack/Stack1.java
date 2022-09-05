package _8Stack;

import java.util.Stack;

public class Stack1 {
 public static void main(String[] args) {
    Stack<Integer> a = new Stack<>();
    int arr [] = { 5 ,3 ,2 ,3 ,45 , 1 };

    for( int elem : arr){
     a.push(elem);
    }
    while (!a.isEmpty()){
     System.out.println(a.pop());
    }
//    a.push( 10);
//  System.out.println(a.size());
//  System.out.println(a.peek());
//  System.out.println(a.pop());
//  System.out.println(a.isEmpty());
 }

}
