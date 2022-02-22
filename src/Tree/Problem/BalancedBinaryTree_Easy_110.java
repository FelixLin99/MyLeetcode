package Tree.Problem;

import Tree.DataStructure.TreeNode;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2217:28
 */
public class BalancedBinaryTree_Easy_110 {
    public boolean output = true;
    public boolean isBalanced(TreeNode root) {
        maxDept(root);
        return output;

    }

    public int maxDept(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftDepth = maxDept(root.left);
        int rightDepth = maxDept(root.right);
        output = output && Math.abs(leftDepth - rightDepth)<=1;

        return 1 + Integer.max(leftDepth, rightDepth);
    }
}
