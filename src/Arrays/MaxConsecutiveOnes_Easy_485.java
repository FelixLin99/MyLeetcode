package Arrays;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/21 15:44
 */
public class MaxConsecutiveOnes_Easy_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCnt = 0;
        int curCnt = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                maxCnt = Integer.max(maxCnt, curCnt);
                curCnt = 0;
            }
            else{
                curCnt++;
            }
        }
        if (nums[nums.length-1] == 1){
            maxCnt = Integer.max(maxCnt, curCnt);
        }
        return maxCnt;
    }
}
