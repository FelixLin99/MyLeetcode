package Arrays;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/21 14:22
 */
public class MoveZeroes_Easy_283 {
    public void moveZeroes(int[] nums) {
        // O(n)
        int offset = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                offset++;
                continue;
            }
            if (offset != 0){
                nums[i-offset] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
