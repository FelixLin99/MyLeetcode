package Greedy;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/16 10:14
 */
public class BestTimetoBuyandSellStock_Easy_121 {
    public int maxProfit(int[] prices) {
        int output = 0;
        int preMaxPrice = 0;
        for(int i = prices.length-2; i>=0; i--){
            preMaxPrice = Integer.max(preMaxPrice, prices[i+1]);
            output = Integer.max(preMaxPrice - prices[i], output);
        }
        return output;
    }
}
