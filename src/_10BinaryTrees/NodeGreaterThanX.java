package _10BinaryTrees;

import java.util.Scanner;

public class NodeGreaterThanX {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput(true , 0 ,true);
        System.out.println("Enter the Number :" );
       Scanner s = new Scanner(System.in);
       int x = s.nextInt();
        System.out.println(GreaterThan(root, x ));
    }

    public  static int GreaterThan(BinaryTreeNode<Integer>root,int v){
        if(root == null){
            return 0 ;
        }
        int count = (root.data > v )? 1:0;
        if(root.left !=null){
            count += GreaterThan(root.left,v);
        }
        if(root.right != null){
            count+=GreaterThan(root.right,v );
        }
        return count;
    }
    public static BinaryTreeNode<Integer> takeInput(boolean isRoot, int parentdata, boolean isLeft){
        if(isRoot){
            System.out.println("Enter the root data ");
        }
        else {
            if(isLeft){
                System.out.println("Enter the left child of "+parentdata);
            }else{
                System.out.println("Enter the right child of "+parentdata);
            }

        }

       Scanner s =  new Scanner(System.in);
        int rootdata = s.nextInt();

        if(rootdata == -1 ){
            return null ;
        }

        BinaryTreeNode<Integer>root = new BinaryTreeNode<>(rootdata);
        BinaryTreeNode<Integer >leftchild = takeInput(false,rootdata, true);
        BinaryTreeNode<Integer>rightChild = takeInput(false , rootdata,false );
        root.left = leftchild ;
        root.right = rightChild;
        return root;
    }
}
