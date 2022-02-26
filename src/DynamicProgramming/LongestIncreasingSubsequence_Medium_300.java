package DynamicProgramming;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/2519:28
 */
public class LongestIncreasingSubsequence_Medium_300 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] tails = new int[n];
        int len = 0;
        for (int num : nums) {
            int index = binarySearch(tails, len, num);
            tails[index] = num;
            if (index == len) {
                len++;
            }
        }
        return len;
    }

    private int binarySearch(int[] tails, int len, int key) {
        int l = 0, h = len;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (tails[mid] == key) {
                return mid;
            } else if (tails[mid] > key) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
