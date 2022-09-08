package _9Queue;

public class queue {
    public static void main(String[] args) {


        QueueUsingArray queue = new QueueUsingArray(3);
        int arr[] = {10, 20, 30, 40,50 };
        for (int elem : arr) {
           // try {
                queue.enqueue(elem);
//            } catch (QueuefullException e) {
//
//            }
        }

            while (! queue.isEmpty()) {
                try {
                    System.out.println(queue.dequeue());
                } catch (QueueEmptyException e) {
                   // throw new RuntimeException(e);
                }


            }


        }

    }

