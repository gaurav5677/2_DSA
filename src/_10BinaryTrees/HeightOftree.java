package _10BinaryTrees;

import java.util.Scanner;

public class HeightOftree {
    public static void main(String[] args) {

            BinaryTreeNode<Integer> root = takeInput(true , 0 ,true);

        System.out.println(HeightofT(root));


        }
        public static int HeightofT( BinaryTreeNode<Integer>root){
        if(root == null ){
            return  0 ;

        }
        return  Math.max(HeightofT(root.left),HeightofT(root.right)+1 );
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

