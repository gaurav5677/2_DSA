package _7LL_Recursively;

import java.util.Scanner;

public class _4ReverseLinkedList {//recursively

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head =  reverseR(head); //Recursively
        print(head);
    }

    public static Node<Integer> reverseR(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;

        }

        Node<Integer> smallHead = reverseR(head.next);
        head.next.next = head;
        head.next = null;


        return smallHead;

        // Method 2
//        Node<Integer > smallhead = reverseR(head.next);
//
//        Node<Integer> tail = smallhead;// keep a variable to travel form start to tail
//     // this will start from small head
//        while( tail.next !=null){ // till we dont reached the last node
//            tail  = tail.next;
//           // this piece of code will bring us to the last node
//        }
//        tail.next = head; // so now we have to connect tail with head
//        head.next = null;// and head should point  null
//        return smallhead;// and head of entire list is smallhead only

    }


    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();


        Node<Integer> head = null, tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = currentNode;
            }
            data = s.nextInt();

        }
        return head;


    }

    public static void print(Node<Integer> head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        print(head.next);
    }

}