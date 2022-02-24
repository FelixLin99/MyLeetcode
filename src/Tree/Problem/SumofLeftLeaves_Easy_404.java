package Tree.Problem;

import Tree.DataStructure.TreeNode;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: 
 * @date 2022/2/2221:36
 */
public class SumofLeftLeaves_Easy_404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return 0;
        }
        return helper(root);
    }

    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left != null && root.left.left == null && root.left.right == null){
            return root.left.val + helper(root.right);
        }
        return helper(root.left) + helper(root.right);
    }
}
