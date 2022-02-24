package DynamicProgramming;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2414:55
 */
public class HouseRobber_Easy_198 {
    public int rob(int[] nums) {
        // bottom up DP, TC O(n),  SC O(1)
        if (nums.length == 1){
            return nums[0];
        }
        if (nums.length == 2){
            return Integer.max(nums[0], nums[1]);
        }
        if (nums.length == 3){
            return Integer.max(nums[0]+nums[2], nums[1]);
        }


        int n1 = nums[2] + nums[0]; // nums[i-1]
        int n2 = nums[1]; // nums[i-2]
        int n3 = nums[0]; // nums[i-3]
        int output = -1;
        for (int i =3; i<nums.length; i++){
            output = Integer.max(Integer.max(n1, n2 + nums[i]), n3 + nums[i]);
            n3 = n2;
            n2 = n1;
            n1 = output;
        }
        return output;
    }

}
