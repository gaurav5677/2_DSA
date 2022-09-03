package _7LL_Recursively;

import java.util.Scanner;
import java.util.prefs.NodeChangeEvent;

public class _3DeleteNodeRecursively {

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        delete(head,2);
        print(head);

    }


    public static Node<Integer> delete(Node<Integer>head,int pos){
        if( head == null){
            return head;
        }
        if( pos == 0 ){
            return head.next;
        }
        head.next = delete(head.next,pos-1);

        return head ;
    }

       public static Node<Integer> takeInput (){
           Scanner s  = new Scanner(System.in);
           int data =s.nextInt();


           Node<Integer> head = null , tail=null;
           while(data !=-1){
               Node<Integer> currentNode = new Node<>(data);
               if(head == null){
                   head= currentNode;
                   tail=currentNode;

               }else{
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
            System.out.println(head.data);
            print(head.next);
        }

}
