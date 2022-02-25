package DynamicProgramming;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2420:10
 */
public class ArithmeticSlices_Medium_413 {
    public int numberOfArithmeticSlices(int[] nums) {
        int output = 0;
        int tmp = 0;
        if(nums.length <= 2){
            return 0;
        }
        for(int i = 2; i < nums.length; i++){
            if (tmp == 0){
                if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                    tmp = 1;
                    output += 1;
                }
            }
            else{
                if(nums[i] - nums[i-1] ==  nums[i-1] - nums[i-2]){
                    tmp += 1;
                    output += tmp;
                }
                else{
                    tmp = 0;
                }
            }
        }
        return output;
    }

}
