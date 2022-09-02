package _6LinkedList;

import java.util.*;

public class _11DeleteNode {
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        delete( head , x );
        print(head);
    }


    public static Node<Integer> delete(Node<Integer> head , int pos){
        if ( head == null ){
            return head ;

        }
        if( pos == 0 ){
            return  head.next;
        }

         int count  = 0 ;
        Node<Integer> currenthead = head ;
        while( currenthead  != null && count < pos-1){
            currenthead = currenthead.next;
            count++;
        }
        if(currenthead== null || currenthead.next == null){
            return head;
        }
        currenthead.next = currenthead.next.next;
        return head ;
    }

    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        Node<Integer> head = null, tail = null;


        while (data != -1) {

            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                // make this node as head and tail node because single node is both head and tail
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = currentNode; // tail = tai;.next // do not forget  to update
            }
            data = s.nextInt();



        }
        return head;
    }


//    public static Node<Integer> createLinkedList(){
//        Node<Integer> n1 = new Node<>(  10);
//        Node<Integer> n2 = new Node<>(20);
//        Node<Integer> n3 = new Node<>( 30 );
//        n1.next = n2 ;
//        n2.next = n3 ;
//
//
//
//        return n1;
//    }

        public static void print (Node < Integer > head) {

            Node<Integer> temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }

        }

}
