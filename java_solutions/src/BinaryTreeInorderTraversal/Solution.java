package BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        result.add(root.val);
        while(!s.empty()){
            while(root!= null){
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            result.add(root.val);
        }
        return result;
    }
}
