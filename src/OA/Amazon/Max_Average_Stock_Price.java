package OA.Amazon;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/8/30 14:48
 */
public class Max_Average_Stock_Price {
    private static int helper(int[] stocks, int k){
        int right = 0;
        int left = 0;
        int currSum = 0;
        int maxSum = -1;
        HashSet<Integer> set = new HashSet<>();

        while(right < stocks.length){

            while(set.contains(stocks[right])) {
                currSum -= stocks[left];
                set.remove(stocks[left++]);
            }

            currSum += stocks[right];
            set.add(stocks[right++]);

            if(right - left == k){
                maxSum = Integer.max(maxSum, currSum);
                currSum -= stocks[left];
                set.remove(stocks[left++]);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int res = helper(new int[]{1,2,2,7,7,4,4,3,6}, 3);
        System.out.println(res);

    }

}
