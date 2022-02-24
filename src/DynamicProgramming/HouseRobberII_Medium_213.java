package DynamicProgramming;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2415:49
 */
public class HouseRobberII_Medium_213 {
    public int rob(int[] nums) {
        // bottom up DP, TC O(n),  SC O(1)
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Integer.max(nums[0], nums[1]);
        }

        return Integer.max(helper(nums, 0, nums.length-1), helper(nums, 1, nums.length));

    }

    public int helper (int[] nums, int head, int tail){
        int n2 = nums[head];
        int n1 = Integer.max(n2, nums[head+1]);
        for(int i = head+2; i<tail; i++){
            int tmp = Integer.max(n1, n2+nums[i]);
            n2 = n1;
            n1 = tmp;
        }
        return n1;
    }
}
