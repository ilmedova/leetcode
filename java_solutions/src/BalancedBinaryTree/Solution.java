package BalancedBinaryTree;


public class Solution {
    public int getHeight(int height, TreeNode node){
        if(node == null) return height;
        if(node.left == null && node.right == null) return height;
        if(node.left == null) getHeight(height+1, node.right);
        if(node.right == null) getHeight(height+1, node.left);
        return -1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        int lh = getHeight(0, root.left);
        int rh = getHeight(0, root.right);
        if(lh == rh + 1 || rh == lh + 1 || lh == rh) return true;
        return false;
    }
}
