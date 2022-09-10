package _10BinaryTrees;





import java.util.Scanner;

public class BinaryTreeUse {
    public static BinaryTreeNode<Integer> takeTreeInputbetter(boolean isRoot , int parentData, boolean isLeft ){
        if( isRoot) {

            System.out.println("Enter root data ");
        } else{
            if(isLeft) {
                System.out.println("Enter  left child of " + parentData);
            }else{
                System.out.println("Enter Right child of " + parentData);
            }
        }

        Scanner s  = new Scanner( System.in);
        int rootData = s.nextInt();

        if( rootData == -1){
            return  null ;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer>leftChild  = takeTreeInputbetter( false ,rootData,true );
        BinaryTreeNode<Integer>rightChild  = takeTreeInputbetter( false , rootData , false);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static BinaryTreeNode<Integer> takeTreeInput(){
        System.out.println("Enter root data ");
        Scanner s  = new Scanner( System.in);
        int rootData = s.nextInt();

        if( rootData == -1){
            return  null ;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
         BinaryTreeNode<Integer>leftChild  = takeTreeInput();
         BinaryTreeNode<Integer>rightChild  = takeTreeInput();
         root.left = leftChild;
         root.right = rightChild;
         return root;
    }
    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + ":");
         if( root.left != null){
             System.out.print("L " + root.left.data + ", ");
         }
         if(root.right != null){
             System.out.print("R "+ root.right.data);
         }
        System.out.println();

        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }
        public static void printTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);

        // Take care of the base case
//        System.out.println(root.data);
//        if(root.left != null){
//            printTree(root.left);
//        }
//        if (root.left != null){
//            printTree(root.right);
//        }
    }

    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//
//        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);

//        root.left = rootLeft;
//        root.right = rootRight;
//
////        printTreeDetailed(root);
//
//        BinaryTreeNode<Integer> twoRight  = new BinaryTreeNode<>(4 );
//        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(5 );
//       rootLeft.right =twoRight;
//       rootRight.left = threeLeft;
        BinaryTreeNode<Integer> root = takeTreeInputbetter(true , 0 , true );
        printTreeDetailed(root);
    }

}
