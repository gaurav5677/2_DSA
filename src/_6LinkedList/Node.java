package _6LinkedList;

public class Node<T> {//T means generics
    // this node class  will have  two things data and the address of the next node


    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}
