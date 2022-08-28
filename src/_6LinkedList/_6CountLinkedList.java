package _6LinkedList;

public class _6CountLinkedList {

    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer > n2 = new Node<>(20);
        n1.next = n2;
        print(n1);
        System.out.println(count(n1));

    }
//    public static Node<Integer> creatLinkedList(){
//
//        return n1;
//    }

    public static int count(Node<Integer> n1){

        int count = 0 ;
        Node<Integer> temp = n1;
        while( temp != null){
            count++;
            temp=temp.next;
        }
        return count ;
    }

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while( temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }



}

