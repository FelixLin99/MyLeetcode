package Tree.Problem;

import Tree.DataStructure.TreeNode;

import java.util.Stack;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/6 15:09
 */
public class ConvertBSTtoGreaterTree_Medium_538 {
    public TreeNode convertBST(TreeNode root) {
        // right -> curr -> left, a similar in-order traversal
        Stack<TreeNode> s = new Stack<>();
        int currSum = 0;
        TreeNode currNode = root; // currNode is a node whose right tree has been visited.

        while(currNode != null || !s.isEmpty()){
            while(currNode != null){
                s.push(currNode);
                currNode = currNode.right;
            }
            currNode = s.pop();
            int tmp = currNode.val;
            currNode.val += currSum;
            currSum += tmp;
            currNode = currNode.left;
        }
        return root;
    }

}
