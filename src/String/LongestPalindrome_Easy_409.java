package String;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/17 23:06
 */
public class LongestPalindrome_Easy_409 {
    public int longestPalindrome(String s) {
        int[] cnts = new int[58];
        for (char c : s.toCharArray()){
            cnts[c - 'A']++;
        }

        int output = 0;
        boolean hasOdd = false;
        for(int cnt : cnts){
            if (hasOdd){
                output += (cnt/2) * 2;
            }
            else{
                output += cnt;
                if (cnt % 2 != 0){
                    hasOdd = true;
                }
            }
        }

        return output;
    }
}
