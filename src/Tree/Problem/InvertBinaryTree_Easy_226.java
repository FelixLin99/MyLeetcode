package Tree.Problem;

import Tree.DataStructure.TreeNode;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/2/2218:27
 */
public class InvertBinaryTree_Easy_226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return root;
        }
        TreeNode backupLeft = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(backupLeft);
        return root;
    }
}
