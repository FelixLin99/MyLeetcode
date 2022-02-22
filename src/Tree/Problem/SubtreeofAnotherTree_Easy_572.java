package Tree.Problem;

import Tree.DataStructure.TreeNode;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2220:18
 */
public class SubtreeofAnotherTree_Easy_572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null){
            return true;
        }
        if((root == null) != (subRoot == null)){
            return false;
        }

        return areTheyEqual(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }


    public boolean areTheyEqual(TreeNode root, TreeNode subRoot){
        if (root == null && subRoot == null){
            return true;
        }
        if((root == null) != (subRoot == null)){
            return false;
        }

        return (root.val == subRoot.val) && areTheyEqual(root.left, subRoot.left) && areTheyEqual(root.right, subRoot.right);
    }
}
