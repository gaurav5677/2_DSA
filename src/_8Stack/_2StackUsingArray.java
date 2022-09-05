package _8Stack;

public class _2StackUsingArray {

    private int data[];
    private int topIndex; // index of the top most of the stack

    public _2StackUsingArray() {
        data = new int[2];
        topIndex = -1;
    }

    public _2StackUsingArray(int size) {
        data = new int[size];
        topIndex = -1;
    }


    public int size() {
        return topIndex + 1;
    }

    public int top() throws StackEmptyExceptoin {
        if (topIndex == -1) {
            // throw stackEmptyException
            throw new StackEmptyExceptoin();
        }
        return data[topIndex];

    }

    public void push(int elem) throws StackfullException {

        // if stack is full
        if (topIndex == data.length - 1) {
//            StackfullException e = new StackfullException();
//            throw  e ;
         //   throw new StackfullException();
            // throw an exception
            dobleCapacity();
        }
//        topIndex++;
        data[++topIndex] = elem;

    }

    private void dobleCapacity() {
        System.out.println("double Capacity ");
        int temp[] = data;
        data = new int[temp.length * 2];
        for (int i = 0; i < temp.length ; i++) {
            data[i] = temp [ i ];
        }

    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public int pop() throws StackEmptyExceptoin {
        if (topIndex == -1) {
            throw new StackEmptyExceptoin();
        }
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }

}
