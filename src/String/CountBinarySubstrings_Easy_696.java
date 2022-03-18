package String;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/18 15:11
 */
public class CountBinarySubstrings_Easy_696 {
    public int countBinarySubstrings(String s) {
        // recursive method....

        // // iterative metho one (find centers)
        //     int cnts = 0;
        //     for (int centerLeft = 0; centerLeft < s.length() - 1; centerLeft++){
        //         char leftChar = s.charAt(centerLeft);
        //         char rightChar = s.charAt(centerLeft+1);
        //         if (leftChar == rightChar){
        //             continue;
        //         }
        //         int left = centerLeft;
        //         int right = centerLeft + 1;
        //         while(left >= 0 && right < s.length() && s.charAt(left) == leftChar && s.charAt(right) == rightChar){
        //             cnts++;
        //             left--;
        //             right++;
        //         }
        //     }
        //     return cnts;


        // dynamic programming
        int numInGroupR = 1, numInGroupLeft = 0, cnts = 0;
        for (int i = 1; i < s.length(); i++){
            char curChar = s.charAt(i);
            char preChar = s.charAt(i-1);
            if (curChar != preChar){
                numInGroupLeft = numInGroupR;
                numInGroupR = 1;
                cnts++;
                continue;
            }
            numInGroupR++;
            if (numInGroupR > numInGroupLeft){
                continue;
            }
            if (numInGroupR <= numInGroupLeft){
                cnts++;

            }
        }
        return cnts;
    }
}
