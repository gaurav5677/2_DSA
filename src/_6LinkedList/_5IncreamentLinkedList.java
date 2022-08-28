package _6LinkedList;


public class _5IncreamentLinkedList {

    public static void main(String[] args) {
        Node<Integer > head = creatLinkedList();

        increment(head);
        print(head);
    }
    public static Node<Integer> creatLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer > n2 = new Node<>(20);
        n1.next = n2;
        return n1;
    }
    public static void increment(Node<Integer> head){

        Node<Integer> temp = head;
        while(temp != null){
            temp.data++;
            temp= temp.next;
        }
    }


    public static void print (Node<Integer> head){
        Node<Integer> temp = head;
        while(temp!= null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}