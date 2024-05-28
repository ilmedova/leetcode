package BalancedBinaryTree;

public class Main {
    public static void main(String[] args){
        Solution s = new Solution();
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        node3.left = node4;
        TreeNode node2 = new TreeNode(2);
        node2.left = node3;
        TreeNode node1 = new TreeNode(1);
        node1.left = node2;
        TreeNode node22 = new TreeNode(2);
        node1.right = node22;
        TreeNode node33 = new TreeNode(3);
        node22.right = node33;
        node33.right = new TreeNode(4);
        System.out.println(s.isBalanced(node1));
    }
}
