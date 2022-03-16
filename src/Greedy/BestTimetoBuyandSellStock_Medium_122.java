package Greedy;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/3/16 10:18
 */
public class BestTimetoBuyandSellStock_Medium_122 {
    public int maxProfit(int[] prices) {
        int output = 0;
        int slow = 0, fast = 1;
        while(fast < prices.length){
            if (prices[slow] >= prices[fast]){
                slow++;
                fast++;
                continue;
            }
            if (fast >= prices.length-1 || prices[fast+1] <= prices[fast]){
                output += prices[fast] - prices[slow];
                slow = fast+1;
                fast += 2;
            }
            else{
                fast++;
            }
        }
        return output;
    }
}
