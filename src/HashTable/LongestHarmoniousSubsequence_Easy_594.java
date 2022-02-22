package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2122:08
 */
public class LongestHarmoniousSubsequence_Easy_594 {
    public int findLHS(int[] nums) {
//        // two pointers: time complexity O(NlogN + N) space complexityO(1)
//        Arrays.sort(nums);
//        int fast = 0, slow = 0, output = 0;
//        while(fast < nums.length){
//            while(fast < nums.length && nums[fast] == nums[slow]){
//                fast++;
//            }
//            if(fast >= nums.length){
//                break;
//            }
//            int nextSlow = fast;
//            if (nums[fast] == nums[slow] + 1){
//                while(fast < nums.length && nums[fast] == nums[slow]){
//                    fast++;
//                }
//                output = Integer.max(output, fast - slow);
//            }
//            slow = nextSlow;
//        }

        // My solution2: Hashing O(N)  300ms
        Map<Integer, Integer> countForNum = new HashMap<>();
        for (int num : nums) {
            countForNum.put(num, countForNum.getOrDefault(num, 0) + 1);
        }
        int longest = 0;
        for (int num : countForNum.keySet()) {
            if (countForNum.containsKey(num + 1)) {
                longest = Math.max(longest, countForNum.get(num + 1) + countForNum.get(num));
            }
        }
        return longest;




    }
}
