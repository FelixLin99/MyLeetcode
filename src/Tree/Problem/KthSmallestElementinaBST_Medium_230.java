package Tree.Problem;

import Tree.DataStructure.TreeNode;

import java.util.Stack;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/6 15:10
 */
public class KthSmallestElementinaBST_Medium_230 {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode currNode = root;
        int currEpoch = 0;
        while(currNode != null || !s.isEmpty()){
            while(currNode != null){
                s.push(currNode);
                currNode = currNode.left;
            }
            currNode = s.pop();
            if(++currEpoch == k){
                return currNode.val;
            }
            currNode = currNode.right;
        }

        return 0;
    }
}
