package _10BinaryTrees;

import java.util.Scanner;

public class TreeTraversal2 {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput(true , 0 , true );
        PostOrder(root);
    }



    public static void PostOrder(BinaryTreeNode<Integer>root){
        if( root == null ){
            return ;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.data+ " ");
    }
    public static BinaryTreeNode<Integer> takeInput( boolean isRoot , int parentdata , boolean isLeft){
        if(isRoot){
            System.out.println("Enter the root data:" );
        }
        else{
            if( isLeft){
                System.out.println("Enter the left child data "+ parentdata);

            }else{
                System.out.println("Enter the right child of "+ parentdata);
            }
        }
        Scanner s = new Scanner( System.in);
        int rootdata = s.nextInt();

        if( rootdata == -1){
            return null ;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootdata);
        BinaryTreeNode<Integer>leftchild = takeInput(false , rootdata,true);
        BinaryTreeNode<Integer>rightchild = takeInput(false , rootdata,false);
         root.left= leftchild;
         root.right = rightchild;
         return  root;
    }
}
