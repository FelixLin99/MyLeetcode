package Tree.Problem;

import Tree.DataStructure.TreeNode;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2218:10
 */
public class DiameterofBinaryTree_Easy_543 {
    public int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {

        maxDepth(root);
        return diameter-1;
    }

    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        diameter = Integer.max(diameter, l+r+1);
        return 1+Integer.max(l,r);
    }
}
