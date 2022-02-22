package Tree.Problem;


import Tree.DataStructure.TreeNode;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2216:59
 */
public class MaximumDepthofBinaryTree_Easy_104 {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return 1 + Integer.max(maxDepth(root.left), maxDepth(root.right));

    }
}
