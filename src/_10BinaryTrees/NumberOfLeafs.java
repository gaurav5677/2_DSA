package _10BinaryTrees;



import java.util.Scanner;

public class NumberOfLeafs {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput( true , 0 , true );
        System.out.println(NumofLeaf(root));
    }


    public static int NumofLeaf ( BinaryTreeNode<Integer> root){
        if( root == null ){
            return 0 ;
        }
        if( root.left == null && root.right == null){
            return 1 ;
        }
        return  NumofLeaf(root.left)+ NumofLeaf(root.right);
    }
    public static BinaryTreeNode<Integer>takeInput(boolean isRoot, int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter the root data : ");

        }
        else{
            if( isLeft){
                System.out.println("Enter the left child of "+ parentData);
            }
            else{
                System.out.println("Enter the right child of + " + parentData);
            }
        }

        Scanner s = new Scanner(System.in);
        int rootdata = s.nextInt();

        if(rootdata==-1){
            return null ;
        }
        BinaryTreeNode<Integer>root = new BinaryTreeNode<>(rootdata);
        BinaryTreeNode<Integer>leftchild = takeInput(false , rootdata,true );
       BinaryTreeNode<Integer> rightchild = takeInput(false , rootdata , false );
       root.left = leftchild;
       root.right = rightchild;
       return root ;

    }

}
