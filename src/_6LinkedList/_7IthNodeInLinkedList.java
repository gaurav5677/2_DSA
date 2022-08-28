package _6LinkedList;

import java.util.Scanner;

public class _7IthNodeInLinkedList {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(23);
        Node<Integer> n4 = new Node<>(24);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        int x = 2;

        find(n1, x);
    }


    public static void find(Node<Integer> head, int c) {
        Node<Integer> temp = head;
        int count = 0;
        while (temp != null && count < c) {
            temp = temp.next;
            count++;


        }
        if(temp!=null) {
            System.out.println(temp.data);
        }
    }
}

