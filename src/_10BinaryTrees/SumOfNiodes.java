package _10BinaryTrees;


import java.util.Scanner;

public class SumOfNiodes {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput(true, 0, true);
        System.out.println(sumNodes(root));
    }

    public static int sumNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int leftsum = sumNodes(root.left);
        int rightsum = sumNodes(root.right);

        return (leftsum + rightsum + root.data);
    }

    public static BinaryTreeNode<Integer> takeInput(boolean isRoot, int parentData, boolean isLeft) {


        if (isRoot) {
            System.out.println("Enter the root data");
        } else {
            if (isLeft) {
                System.out.println("Enter left child of " + parentData);
            } else {
                System.out.println("Enter right child of " + parentData);
            }
        }
        Scanner s = new Scanner(System.in);
        int rootdata = s.nextInt();

        if (rootdata == -1) {
            return null;
        }


        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootdata);
        BinaryTreeNode<Integer> leftchild = takeInput(false, rootdata, true);
        BinaryTreeNode<Integer> rightchild = takeInput(false, rootdata, false);
        root.left = leftchild;
        root.right = rightchild;

        return root;

    }
}
