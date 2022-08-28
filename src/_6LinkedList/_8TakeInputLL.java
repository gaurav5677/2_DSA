package _6LinkedList;

import java.util.Scanner;

public class _8TakeInputLL {
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        print(head);
    }


    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        // we will need the head of the likned list here as well
        Node<Integer> head = null; // here we have only created the reference with value null

        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);// here we will create a node corresponding the value/ data
            if (head == null) {
                //make this node as head node
                head = currentNode;
            } else {
                Node<Integer> tail = head;f
                while (tail.next != null) {//  for n-1 node the next will null..
                    tail = tail.next;
                }
                // Now tail will refer to last node
                // the only thing left is to  connect new node after last nodetail
                tail.next = currentNode;
            }// here this loop will over and we will take the next input

            data = s.nextInt();// next input form the user
        }
        return head;
    }

    public static void print(Node<Integer> head ){
        Node<Integer> temp = head;

        while( temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

}


//Time Complexity is O(n^2)