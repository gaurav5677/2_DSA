package _7LL_Recursively;

import java.util.Scanner;

public class _6MergeTwoLinkedList {

    public static void main(String[] args) {
        Node<Integer> head1 = TakeInput();
        Node<Integer> head2 = TakeInput();
       Node<Integer>  head = merge( head1 , head2 );
print(head);
    }


    public static Node<Integer> merge( Node<Integer> head1 , Node<Integer> head2) {


        if( head1 == null ){
            return head2;
        }
        if( head2 == null){
            return  head1;
        }

        Node<Integer> t1 = head1, t2 = head2;
        Node<Integer> head = null, tail = null;


        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;

            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = t2;
                t2 = t2.next;

            }
        }

        // one list is over

        if (t1 != null) {
            tail.next = t1;

        } else {
            tail.next = t2;
        }
        return head ;
    }



    public static Node<Integer> TakeInput(){
        Scanner s = new Scanner( System.in);
        int data = s.nextInt();

        Node<Integer> head = null , tail =null;

        while( data != -1){

            Node<Integer> currentNode =  new Node<>(data);

            if(  head == null){
                head = currentNode;
                tail = currentNode;
            }else{
                tail.next = currentNode;
                tail = currentNode;
            }
            data = s.nextInt();

        }
        return head ;
    }


    public static  void print( Node<Integer>head ){
        if( head == null){
            return ;
        }
        System.out.println(head.data+" ");
        print(head.next);
    }
}
