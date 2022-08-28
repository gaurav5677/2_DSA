package _6LinkedList;

import java.util.Scanner;

public class _10InsertNode {
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = insert(head, 80, 0);
        print(head);

    }


    public static Node<Integer> insert(Node<Integer> head, int elem, int pos) {
        Node<Integer> nodeToBeInserted = new Node<Integer>(elem);

        if (pos == 0) {
            nodeToBeInserted.next = head;
//            head = nodeToBeInserted;
            return nodeToBeInserted;
        } else {
            int count = 0;
            Node<Integer> prev = head;
            while (count < pos - 1 && prev != null) {
                count++;
                prev = prev.next;

            }
            if (prev != null) {
                nodeToBeInserted.next = prev.next;
                prev.next = nodeToBeInserted;
            }


        }
        return head;
    }


    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        Node<Integer> head = null, tail = null;

        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);
            if (head == null) {
                // make this node as head and tail node because  single node is both head and tail
                head = currentNode;
                tail = currentNode;

            } else {


                tail.next = currentNode;
                tail = currentNode;// tail= tail.next;//do not forget to update
            }


            data = s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
