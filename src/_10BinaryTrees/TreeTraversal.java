package _10BinaryTrees;


import javax.management.MBeanServerInvocationHandler;
import java.util.Scanner;

public class TreeTraversal {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput( true ,  0 , true );
        preOrder(root);
    }


    public static BinaryTreeNode<Integer> takeInput(boolean isRoot , int parentdata , boolean isLeft){
        if(isRoot ){
            System.out.println("Enter the root data ");

        }else{
            if( isLeft){
                System.out.println("Enter  left child of " + parentdata);

            }else{
                System.out.println("Enter right child of "+ parentdata);
            }
        }
        Scanner s = new Scanner( System.in );
        int rootdata = s.nextInt();

        if( rootdata== -1 ){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootdata);

        BinaryTreeNode<Integer> leftchild = takeInput(false ,rootdata,true  );
        BinaryTreeNode<Integer> rightchild =  takeInput(false , rootdata , false  );
        root.left = leftchild;
        root.right = rightchild;

        return root;

    }

    public static void preOrder(BinaryTreeNode<Integer> root){
        if(root == null ){
            return;

        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

}
