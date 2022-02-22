package Tree.Problem;

import Tree.DataStructure.TreeNode;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2220:34
 */
public class SymmetricTree_Easy_101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return areTheySymmetric(root.left, root.right);
    }

    public boolean areTheySymmetric(TreeNode root1, TreeNode root2){
        if (root1 == null && root2 == null){
            return true;
        }
        if((root1 == null) != (root2 == null)){
            return false;
        }

        return root1.val == root2.val && areTheySymmetric(root1.left, root2.right) && areTheySymmetric(root1.right, root2.left);

    }
}
