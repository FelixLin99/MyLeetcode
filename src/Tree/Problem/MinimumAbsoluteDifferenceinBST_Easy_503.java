package Tree.Problem;

import Tree.DataStructure.TreeNode;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/14 13:50
 */
public class MinimumAbsoluteDifferenceinBST_Easy_503 {
    private int last = Integer.MAX_VALUE;
    private int output = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inOrderTraversal(root);
        return output;
    }

    public void inOrderTraversal(TreeNode node){
        if (node == null){
            return ;
        }
        inOrderTraversal(node.left);
        output = Integer.min(output, Math.abs(node.val - last));
        last = node.val;
        inOrderTraversal(node.right);
    }
}
