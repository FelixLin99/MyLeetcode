package Greedy;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/16 11:02
 */
public class IsSubsequence_Easy_392 {
    public boolean isSubsequence(String s, String t) {
        int pointS = 0, pointT = 0;
        while(pointS < s.length() && pointT < t.length()){
            if (t.charAt(pointT) == s.charAt(pointS)){
                pointS++;
            }
            pointT++;
        }
        return pointS == s.length();
    }

}
