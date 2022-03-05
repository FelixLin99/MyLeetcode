package DynamicProgramming;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/514:33
 */
public class WiggleSubsequence_Medium_376 {
    public int wiggleMaxLength(int[] nums) {
        int cnt = 1;
        int currOpt = 0;
        int currNode = nums[0];
        for(int i = 1; i < nums.length; i++){
            if (currNode == nums[i]){
                continue;
            }
            if(currOpt > 0){ // dp[curr] - dp[curr-1] > 0
                if(nums[i] < currNode){
                    cnt++;
                    currNode = nums[i];
                    currOpt = -1;
                }
                else {
                    currNode = nums[i];
                }
            }
            else if(currOpt < 0){ // dp[curr] - dp[curr-1] < 0
                if(nums[i] > currNode){
                    cnt++;
                    currNode = nums[i];
                    currOpt = 1;
                }
                else {
                    currNode = nums[i];
                }
            }
            else{ // initialize
                cnt++;
                currOpt = nums[i] - currNode;
                currNode = nums[i];
            }
        }

        return cnt;
    }

    // genius concise one
//    public int wiggleMaxLength(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return 0;
//        }
//        int up = 1, down = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] > nums[i - 1]) {
//                up = down + 1;
//            } else if (nums[i] < nums[i - 1]) {
//                down = up + 1;
//            }
//        }
//        return Math.max(up, down);
//    }
}
