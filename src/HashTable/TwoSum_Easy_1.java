package HashTable;

import java.util.*;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2120:59
 */
public class TwoSum_Easy_1 {
    public int[] twoSum(int[] nums, int target) {
        // Sort + two pointers
        ArrayList<Integer> integers = new ArrayList<>();
        for (int j = 0; j<nums.length; j++){
            integers.add(nums[j]);
        }

        Arrays.sort(nums);
        for (int i = 0, j = nums.length-1; i<=j; ){
            int tmp = nums[i] + nums[j];
            if (tmp == target){
                return new int[]{integers.indexOf(nums[i]),integers.lastIndexOf(nums[j])};
            }
            if (tmp > target){
                j--;
            }
            else {
                i++;
            }
        }


        // HashMap
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (hashMap.containsKey(target - nums[i])){
                return new int[]{i, hashMap.get(target - nums[i])};
            }
            hashMap.put(nums[i], i);
        }
        return null;


    }
}
