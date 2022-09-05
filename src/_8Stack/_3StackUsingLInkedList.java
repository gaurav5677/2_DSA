package _8Stack;


import _6LinkedList.Node;

public class _3StackUsingLInkedList<T> {

    private Node<T> head;
    private int size;

    public _3StackUsingLInkedList() {
        head = null;
        size = 0;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T elem) {
        Node<T> newNode = new Node<T>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T top() throws StackEmptyExceptoin {
        if (head == null) {

            throw new StackEmptyExceptoin();
        }
        return head.data;
    }

    public T pop() throws  StackEmptyExceptoin{
        if( head == null){
            throw new StackEmptyExceptoin();
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;

    }

}
