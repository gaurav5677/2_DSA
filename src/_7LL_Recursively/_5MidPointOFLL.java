package _7LL_Recursively;

import java.util.Scanner;

public class _5MidPointOFLL {

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Node<Integer> x   = midpoint(head);
        System.out.println(x.data);
    }


     public static   Node<Integer> midpoint(Node<Integer>head ){

        Node<Integer> slow = head , fast = head ;

        while( fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;


        }
        return slow ;
     }

    public  static Node<Integer> takeInput(){

        Scanner s =new Scanner( System.in);
        int data = s.nextInt();

        Node<Integer> head = null , tail = null ;

        while( data != -1 ){
            Node<Integer> currentNode = new Node<>(data);

            if( head == null){
                head = currentNode;
                tail = currentNode;
            }else{
                tail.next = currentNode;
                tail=currentNode;
            }

            data  = s.nextInt();
        }
        return head;


    }

     public static void print ( Node<Integer> head ){

         if (head == null) {
             return;
         }
         System.out.print(head.data + " ");
         print(head.next);

//        Node< Integer> temp = head ;
//
//        while (temp != null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
        }

     }

