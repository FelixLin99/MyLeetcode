package String;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/18 10:35
 */
public class PalindromicSubstrings_Medium_647 {
    /**
     * Very interesting problem. There are at least 3 methods to conquer:
     */

    // // 1. for each center, try to extend palindrom.
    // private int cnts;
    // public int countSubstrings(String s) {
    //     for(int i = 0; i < s.length(); i++){
    //         extendPalindrom(s, i, i);
    //         extendPalindrom(s, i, i+1);
    //     }
    //     return cnts;
    // }
    // private void extendPalindrom(String s, int head, int tail){
    //     while(head >= 0 && tail < s.length() && s.charAt(head) == s.charAt(tail)){
    //         this.cnts++;
    //         head--;
    //         tail++;
    //     }
    // }


    // 2. dp
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        dp[0][0] = true;
        int cnts = 1;
        for(int tail = 1; tail < s.length(); tail++){
            int head;
            for (head = 0; head < tail - 1; head ++){
                if (s.charAt(head) == s.charAt(tail) && dp[head+1][tail-1]){
                    dp[head][tail] = true;
                    cnts++;
                }
            }
            // head == tail -1
            if (s.charAt(tail-1) == s.charAt(tail)){
                dp[tail-1][tail] = true;
                cnts++;
            }
            // head == tail
            dp[tail][tail] = true;
            cnts++;
        }
        return cnts;
    }

//     // 3. mathematical solution(legend one)
//     public int countSubstrings(String s) {

//     }


}
