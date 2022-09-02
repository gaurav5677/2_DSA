package _7LL_Recursively;

import java.util.Scanner;

public class _1PrintLLRecursively {

    public static void main(String[] args) {
        Node<Integer> head = TakeInput();
        printR(head);

    }

    public static Node<Integer> TakeInput() {

        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        Node<Integer> head = null, tail = null;

        while (data != -1) {

            Node<Integer> currentNode = new Node<Integer>(data);

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

    public static void printR(Node<Integer> head) {
        if (head == null) {
            return;

        }
        System.out.println(head.data);
        printR(head.next);

        // Print LL in reverse Order
//        printR(head.next);
//        System.out.println(head.data);


    }

}
