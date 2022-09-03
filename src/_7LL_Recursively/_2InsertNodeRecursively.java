package _7LL_Recursively;

import java.util.Scanner;

public class _2InsertNodeRecursively {

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
       head =  InsertR(head , 20, 2);
        print(head);
    }


    public static Node<Integer> InsertR(Node<Integer> head, int elem, int pos) {


        if (head == null && pos > 0) {
            return head;
        }

        if (pos == 0) {
            Node<Integer> newNode = new Node<Integer>(elem);// we will made node corresponding to the  val
            newNode.next = head;// here we will make connection 20  to  8 and return
            return newNode;
        } else {
            //Node<Integer>smallHead = InsertR(head.next,elem,pos-1);
            // head.next= smallHead;
            head.next = InsertR(head.next, elem, pos - 1);// this is really imp step . we must collect the head
            return head;
        }

    }

    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        // we will need the head of the likned list here as well tail
        Node<Integer> head = null, tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<>(data);
            if (head == null) {
                head = currentNode;// single node is both head and tail
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = currentNode; // dont forget to assign the  currentNodeTO the tail
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        Node<Integer> temp = head;

        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;

        }
    }


}


