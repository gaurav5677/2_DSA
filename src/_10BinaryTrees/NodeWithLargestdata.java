package _10BinaryTrees;



import java.util.Scanner;

public class NodeWithLargestdata {
    public static void main(String[] args) {
      BinaryTreeNode<Integer> root = takeInput(true, 0 , true);
        System.out.println(largest(root));
    }
    public static int largest ( BinaryTreeNode<Integer> root){
        if(root== null){
            return -1 ;
        }
        int largestLeft = largest(root.left);
        int largestRight  = largest(root.right);

        return Math.max( root.data,Math.max( largestLeft,largestRight));

    }
    public static BinaryTreeNode<Integer> takeInput(boolean isRoot , int parentdata,boolean isLeft ){
        if( isRoot){
            System.out.println("Enter the root data : " );
        }else {
            if( isLeft){
                System.out.println("Enter the left Child of "+ parentdata);
            }else {
                System.out.println("Enter the right child of " + parentdata);
            }

        }

        Scanner s = new Scanner( System.in);
        int rootdata = s.nextInt();

         if(rootdata == -1 ){
             return null;
         }

         BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
         BinaryTreeNode<Integer>leftchild  = takeInput(false , rootdata, true );
         BinaryTreeNode<Integer>rightchild = takeInput(false , rootdata, false );
         root.left = leftchild;
         root.right = rightchild;
          return root ;

    }
}
