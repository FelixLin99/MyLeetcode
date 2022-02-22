package Tree.Problem;

import Tree.DataStructure.TreeNode;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/2/2220:00
 */
public class PathSumIII_Medium_437 {
    private int output = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        pathSumIncludeRoot(root, targetSum);

        return output;
    }


    public void pathSumIncludeRoot(TreeNode root, int targetSum){
        if(root == null){
            return ;
        }

        if(root.val == targetSum){
            output++;
        }

        pathSumIncludeRoot(root.left, targetSum - root.val);
        pathSumIncludeRoot(root.right, targetSum - root.val);
    }

}
