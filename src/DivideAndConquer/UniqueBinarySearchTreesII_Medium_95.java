package DivideAndConquer;

import Tree.DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/17 22:27
 */
public class UniqueBinarySearchTreesII_Medium_95 {
    // pal, you completed it with DAC. Next time try DP,only if you have enough time, because it gonna be pretty hard!

    public static List<TreeNode> generateTrees(int n) {
        return helper(1,n);
    }

    public static ArrayList<TreeNode> helper(int head, int tail) {
        ArrayList<TreeNode> output = new ArrayList<>();
        if (head > tail){
            return output;
        }
        for(int i = head; i <= tail; i++){
            ArrayList<TreeNode> left = helper(head, i-1);
            ArrayList<TreeNode> right = helper(i+1, tail);
            if(left.size() == 0 && right.size() == 0){
                output.add(new TreeNode(i));
            }
            else if(left.size() == 0){
                for(TreeNode r : right){
                    output.add(new TreeNode(i, null, r));
                }
            }
            else if(right.size() == 0){
                for(TreeNode l : left){
                    output.add(new TreeNode(i, l, null));
                }
            }
            else{
                for (TreeNode l : left){
                    for(TreeNode r : right){
                        output.add(new TreeNode(i, l, r));
                    }
                }
            }
        }
        return output;
    }
}
