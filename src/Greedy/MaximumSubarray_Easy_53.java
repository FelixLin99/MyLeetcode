package Greedy;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/16 21:56
 */
public class MaximumSubarray_Easy_53 {
    public int maxSubArray(int[] nums) {
        int curSum = nums[0];
        int maxSum = nums[0];
        for(int i = 1; i< nums.length; i++){
            if(curSum <=0){
                curSum = nums[i];
            }
            else{
                curSum += nums[i];
            }
            maxSum = Integer.max(curSum, maxSum);
        }
        return maxSum;
    }
}
