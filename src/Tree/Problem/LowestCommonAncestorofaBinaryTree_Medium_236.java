package Tree.Problem;

import Tree.DataStructure.TreeNode;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/9 0:08
 */
public class LowestCommonAncestorofaBinaryTree_Medium_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root.val == p.val || root.val == q.val){
            return root;
        }
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        if (right == null){
            return left;
        }
        if (left == null){
            return right;
        }
        return root;
    }
}
