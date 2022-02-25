package DynamicProgramming;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/2/2518:26
 */
public class DecodeWays_Medium_91 {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()+2];
        dp[1] = 1;
        dp[2] = (s.charAt(0)=='0')? 0 : 1;
        for(int i = 1; i<s.length(); i++){
            int tmp = Integer.parseInt(s.substring(i-1,i+1));
            int tmp2 = Integer.parseInt(s.substring(i,i+1));
            if (tmp2 != 0){
                dp[i+2] += dp[i+1];
            }
            if (tmp >=10 && tmp <= 26){
                dp[i+2] += dp[i];
            }
        }
        return dp[s.length()+1];
    }

}
