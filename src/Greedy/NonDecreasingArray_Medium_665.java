package Greedy;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/16 11:29
 */
public class NonDecreasingArray_Medium_665 {
    public boolean checkPossibility(int[] nums) {
        boolean hasModified = false;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] <= nums[i+1]){
                continue;
            }
            if(hasModified){
                return false;
            }
            if(i == 0){
                hasModified = true;// 修改i[0] - i[1], to make i[1] as small as possible.
                continue;
            }
            // Now we guarantee that nums[i]>=nums[i-1] and nums[i]>nums[i+1], so there are two situations:
            if(nums[i+1] < nums[i-1]){
                nums[i+1] = nums[i];
                hasModified = true;
            }
            else if(nums[i+1] >= nums[i-1]){
                // just change nums[i]
                hasModified = true;
            }
        }
        return true;
    }
}
