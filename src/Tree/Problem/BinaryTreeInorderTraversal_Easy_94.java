package Tree.Problem;

import Tree.DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2716:20
 */
public class BinaryTreeInorderTraversal_Easy_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        // left -> root -> right
        Stack<TreeNode> s = new Stack<>();
        TreeNode currNode = root;
        ArrayList<Integer> output = new ArrayList<>();
        while(currNode != null || !s.isEmpty()){

            while(currNode != null){
                s.push(currNode);
                currNode = currNode.left;
            }

            currNode = s.pop();
            output.add(currNode.val);
            currNode = currNode.right;
        }
        return output;
    }
}
