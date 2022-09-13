package _10BinaryTrees;

import java.util.Scanner;

public class NumbersOFNodes {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput(true, 0, true);
        System.out.println("NUmber of nodes: " + numNodes(root));
        System.out.println("Sum of nodes: " + sumNodes(root));
    }

    public static int sumNodes(BinaryTreeNode<Integer> root){
        if( root == null ){
            return  0;
        }
       int leftSum = sumNodes(root.left);
       int rightSum= sumNodes(root.right);

       return (leftSum + rightSum + root.data);

    }

    public static int numNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int leftnodeCount = numNodes(root.left);
        int rightnodeCount = numNodes(root.right);
        return 1 + leftnodeCount + rightnodeCount;
    }


    public static BinaryTreeNode<Integer> takeInput(boolean isRoot, int parentdata, boolean isleft) {
        if (isRoot) {
            System.out.println("Enter the root data ");
        } else {
            if (isleft) {
                System.out.println("Enter  left child of " + parentdata);
            } else {
                System.out.println("Enter right child of " + parentdata);
            }
        }

        Scanner s = new Scanner(System.in);
        int rootdata = s.nextInt();

        if (rootdata == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
        BinaryTreeNode<Integer> leftchild = takeInput(false, rootdata, true);
        BinaryTreeNode<Integer> rightChild = takeInput(false, rootdata, false);
        root.left = leftchild;
        root.right = rightChild;
        return root;
    }
}
