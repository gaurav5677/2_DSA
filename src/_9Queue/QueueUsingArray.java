package _9Queue;

public class QueueUsingArray {

    private int data[];
    private int front ;// index of element at the front of the queue

    private int rear; // indeax of element at the reat of the queue

    private int size;

    public QueueUsingArray(int capacity) {

        data = new int[capacity];
        front = -1;
        rear = -1;
    }

    public QueueUsingArray() {

        data = new int[5];
        front = -1;
        rear = -1;
    }

    public int size(){
        return size ;
    }

    public boolean isEmpty(){
        return size == 0 ;
    }

public void enqueue( int elem ) throws QueuefullException{
        if(size == data.length){
            throw new QueuefullException();

        }
        if( size == 0 ){
            front = 0;


        } rear++ ;
        data[rear ] = elem;
        size++;

    }
    public int  front()  throws QueueEmptyException {
     if(size == 0 ) {

         throw new QueueEmptyException();
     }
        return data[front];

    }

    public int dequeue() throws QueueEmptyException  {
        if(size == 0 ) {

            throw new QueueEmptyException();
        }
        int temp  = data[front];
        front++;
        size--;
        if( size == 0 ){
            front = -1;
            rear = -1 ;
        }
        return temp ;

    }
}
